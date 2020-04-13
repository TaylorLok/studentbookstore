package company.ac.za.studentbookstore.controller.user;

import company.ac.za.studentbookstore.domain.user.UserAccount;
import company.ac.za.studentbookstore.service.user.UserAccountService;
import company.ac.za.studentbookstore.util.MyAppLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sts/user/")
public class UserAccountController {
    @Autowired
    UserAccountService userAccountService;
    @PostMapping("login")
    public UserAccount LogIn(@RequestBody UserAccount userAccount){
        UserAccount userAccount1=userAccountService.logIn(userAccount.getEmail(),userAccount.getPassword());
        if (userAccount1!=null) {
            MyAppLog.sMessage("LogIn");
            return userAccount1;
        }
        MyAppLog.fMessage("LogIn");
        return null;
    }
}
