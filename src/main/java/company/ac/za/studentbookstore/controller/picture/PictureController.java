package company.ac.za.studentbookstore.controller.picture;

import company.ac.za.studentbookstore.controller.Icontroller;
import company.ac.za.studentbookstore.domain.picture.Picture;
import company.ac.za.studentbookstore.factory.domain.picture.PictureFactory;
import company.ac.za.studentbookstore.service.picture.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("sts/picture/")
public class PictureController implements Icontroller<Picture,String>
{
    @Autowired
    PictureService pictureService;

    @PostMapping("create")
    @Override
    public Picture create(@RequestBody Picture picture) {
        //System.out.println(picture.toString());
        Picture picture1 = PictureFactory.getPicture(encodeIntoByteArray(picture.getPicture()),picture.getDescription());
        //System.out.println(picture.toString());
        return pictureService.create(picture1);
    }

    @GetMapping("delete")
    @Override
    public Picture delete(@RequestBody Picture picture)
    {
        return pictureService.delete(picture);
    }

    //I have converted the picture into a string taking a place of the id.
    @GetMapping("read")
    @Override
    public Picture read(@RequestParam("id") String id) {
        System.out.println("we are reading a picture");//Base64.getEncoder().encodeToString(
        Picture picture=pictureService.read(id);
        Picture pictureToReturn=PictureFactory.getDecodedPicture(Base64.getEncoder().encodeToString(picture.getPicture()),picture.getPicture(),picture.getDescription());
        System.out.println(pictureToReturn.getId());
        return pictureToReturn;
    }

    @GetMapping("update")
    @Override
    public Picture update(@RequestBody Picture picture)
    {
        return pictureService.update(picture);
    }

    @GetMapping("reads")
    @Override
    public List<Picture> readAll()
    {
        return pictureService.readAll();
    }

    /****
     * I have converted the picture into a string taking a place of the id.
     * we don't need the id when returning the answer to the user.
     *
     * ***/
    @GetMapping("readfirst")
    public Picture readFirstPicture(@RequestParam("id") String id){//Base64.getDecoder().decode(encodedString);
        Picture picture=pictureService.getFirstpicture(id);
        byte[] fack = new byte[0]; // just send an empty byte array.
        if(picture!=null) {
            Picture pictureToReturn = PictureFactory.getDecodedPicture(decodeIntoString(picture.getPicture()), fack, picture.getDescription());
            //System.out.println(pictureToReturn.getPicture());
            return pictureToReturn;
        }
        return null;
    }

    public byte[] encodeIntoByteArray(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }

    /**
     * Now we first decode the Byte Array
     * then convert into a string
     * **/

    public String decodeIntoString(byte[] picture){
        byte[] byteArrayPicture=Base64.getDecoder().decode(picture);
        String stringPicture=Base64.getEncoder().encodeToString(byteArrayPicture);
        return stringPicture;

    }

}
