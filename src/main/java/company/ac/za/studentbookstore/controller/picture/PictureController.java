package company.ac.za.studentbookstore.controller.picture;

import company.ac.za.studentbookstore.controller.Icontroller;
import company.ac.za.studentbookstore.domain.picture.Picture;
import company.ac.za.studentbookstore.factory.domain.picture.PictureFactory;
import company.ac.za.studentbookstore.service.picture.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/picture/")
public class PictureController implements Icontroller<Picture,String>
{
    @Autowired
    PictureService pictureService;

    @PostMapping("create")
    @Override
    public Picture create(@RequestBody Picture picture)
    {
        Picture picture1 = PictureFactory.getPicture(picture.getId(),picture.getPicture(),picture.getDescription());
        System.out.println(picture.toString());
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
    public Picture read(@RequestParam("id") String id)
    {
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
}
