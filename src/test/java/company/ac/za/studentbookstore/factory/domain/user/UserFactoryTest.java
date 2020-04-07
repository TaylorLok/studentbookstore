package company.ac.za.studentbookstore.factory.domain.user;

import company.ac.za.studentbookstore.domain.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class UserFactoryTest {
User user=UserFactory.getUser("espoirditekemena@gmail.com","espoir","dite","0617825205");
    @Test
    void getUser() {
        Assert.isInstanceOf(User.class,user);
        System.out.println(user.toString());
    }
}