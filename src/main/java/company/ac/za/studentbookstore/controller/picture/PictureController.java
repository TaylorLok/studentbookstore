package company.ac.za.studentbookstore.controller.picture;

import company.ac.za.studentbookstore.controller.Icontroller;
import company.ac.za.studentbookstore.domain.picture.Picture;
import company.ac.za.studentbookstore.factory.domain.picture.PictureFactory;
import company.ac.za.studentbookstore.service.picture.PictureService;
import company.ac.za.studentbookstore.util.ImageResizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("sts/picture/")
public class PictureController implements Icontroller<Picture, String> {
    @Autowired
    PictureService pictureService;

    @PostMapping("create")
    @Override
    public Picture create(@RequestBody Picture picture) throws IOException {
         // When a picture gets in here we first write it as a jpg file
        pictureWriter(picture.getPicture());
        //Then we resize the picture
        ImageResizer.getResizedImage();
        //Now we convert to byte array so that we can save it
        byte[] resizedPicture= convertToBytes();
        //Lastly we have to delete the file
        deleteFile();
        // In this line we encode the byteArray so that we can save a small data
        Picture picture1 = PictureFactory.getPicture(encodeIntoByteArray(resizedPicture), picture.getDescription());
        //System.out.println(picture.toString());
        return pictureService.create(picture1);
    }

    @GetMapping("delete")
    @Override
    public Picture delete(@RequestBody Picture picture) {
        return pictureService.delete(picture);
    }

    //I have converted the picture into a string taking a place of the id.
    @GetMapping("read")
    @Override
    public Picture read(@RequestParam("id") String id) {
        System.out.println("we are reading a picture");//Base64.getEncoder().encodeToString(
        Picture picture = pictureService.read(id);
        Picture pictureToReturn = PictureFactory.getDecodablePicture(Base64.getEncoder().encodeToString(picture.getPicture()), picture.getPicture(), picture.getDescription());
        System.out.println(pictureToReturn.getId());
        return pictureToReturn;
    }

    @GetMapping("update")
    @Override
    public Picture update(@RequestBody Picture picture) {
        return pictureService.update(picture);
    }

    @GetMapping("reads")
    @Override
    public List<Picture> readAll() {
        return pictureService.readAll();
    }

    /****
     * I have converted the picture into a string taking a place of the id.
     * we don't need the id when returning the answer to the user.
     *
     * ***/
    @GetMapping("readfirst")
    public Picture readFirstPicture(@RequestParam("id") String id) {//Base64.getDecoder().decode(encodedString);
        Picture picture = pictureService.getFirstpicture(id);
        byte[] fack = new byte[0]; // just send an empty byte array.
        if (picture != null) {
            Picture pictureToReturn = PictureFactory.getDecodablePicture(decodeIntoString(picture.getPicture()), fack, picture.getDescription());
            //System.out.println(pictureToReturn.getPicture());
            return pictureToReturn;
        }
        return null;
    }

    @PostMapping("readAllOf")
    public List<Picture> readAllOf(@RequestBody List <String> ids){
        byte[] fack = new byte[0]; // just send an empty byte array.
        List<Picture> picture = new ArrayList<>();
        for(Picture picture1: pictureService.readAllOf(ids)){
            Picture picture2=PictureFactory.getDecodablePicture(decodeIntoString(picture1.getPicture()),fack,picture1.getDescription());
            picture.add(picture2);
        }
        return picture;
    }

    public byte[] encodeIntoByteArray(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }

    /**
     * Now we first decode the Byte Array
     * then convert into a string
     **/

    public String decodeIntoString(byte[] picture) {
        byte[] byteArrayPicture = Base64.getDecoder().decode(picture);
        String stringPicture = Base64.getEncoder().encodeToString(byteArrayPicture);
        return stringPicture;

    }

    /****
     * This method first converts byte array to a file
     * and write it in util directory
     * naming it output.jpg
     * so that the method that resize picture can read it from that location.
     * @param bytes
     * @throws IOException
     */
    public void pictureWriter(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        BufferedImage bImage2 = ImageIO.read(bis);
        ImageIO.write(bImage2, "jpg", new File("src/main/java/company/ac/za/studentbookstore/util/output.jpg"));
        System.out.println("image created");
    }

    public void deleteFile() {
        try {
            File f = new File("src/main/java/company/ac/za/studentbookstore/util/resized.jpg");           //file to be delete
            if (f.delete()) {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            } else {
                System.out.println("failed to delete");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] convertToBytes() throws IOException {
        File file = new File("src/main/java/company/ac/za/studentbookstore/util/resized.jpg");
        FileInputStream fis = new FileInputStream(file);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1; ) {
                bos.write(buf, 0, readNum); //no doubt here is 0
                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
                //System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            System.out.println("failed to convert to byte array");
        }
        bos.close();
        fis.close();
        return bos.toByteArray();
    }

}
