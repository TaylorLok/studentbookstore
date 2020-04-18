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
        Picture picture1 = PictureFactory.getPicture(decoreder(picture.getPicture()),picture.getDescription());
        //System.out.println(picture.toString());
        return pictureService.create(picture1);
    }

    @GetMapping("delete")
    @Override
    public Picture delete(@RequestBody Picture picture)
    {
        return pictureService.delete(picture);
    }

    @GetMapping("read")
    @Override
    public Picture read(@RequestParam("id") String id) {
        System.out.println("we are reading a picture");
        return pictureService.read(id);
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
    @GetMapping("readfirst")
    public Picture readFirstPicture(@RequestParam("id") String id){
        return pictureService.getFirstpicture(id);
    }

    public byte[] decoreder(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }
}
