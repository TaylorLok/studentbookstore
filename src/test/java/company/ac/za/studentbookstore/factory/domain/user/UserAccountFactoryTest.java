package company.ac.za.studentbookstore.factory.domain.user;

import company.ac.za.studentbookstore.domain.user.UserAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAccountFactoryTest {
UserAccount userAccount= UserAccountFactory.getUseraccount("espoirduteke@maild.xom");
    @Test
    void getUseraccount() {
        System.out.println(userAccount.toString());
    }
}