package company.ac.za.studentbookstore.controller.user;

import company.ac.za.studentbookstore.controller.Icontroller;
import company.ac.za.studentbookstore.domain.user.User;
import company.ac.za.studentbookstore.factory.domain.user.UserFactory;
import company.ac.za.studentbookstore.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController implements Icontroller<User,String>
{
    @Autowired
    UserService userService;

    @PostMapping("create")
    @Override
    public User create( @RequestBody User user)
    {
        User user1 = UserFactory.getUser(user.getName(),user.getSurname(),user.getPhoneNumber(),user.getEmail());
        System.out.println(user.toString());
        return userService.create(user1);
    }
    @GetMapping("delete")
    @Override
    public User delete(@RequestBody User user)
    {
        return userService.delete(user);
    }
    @GetMapping("read")
    @Override
    public User read(@RequestParam("id") String id)
    {
        return userService.read(id);
    }

    @GetMapping("update")
    @Override
    public User update(@RequestBody User user)
    {
        return userService.update(user);
    }

    @GetMapping("reads")
    @Override
    public List<User> readAll()
    {
        return userService.readAll();
    }
}
