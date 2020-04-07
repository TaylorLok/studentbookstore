package factory.user;

import company.ac.za.studentbookstore.domain.user.User;

public class UserFactory
{
    public static User getUser(String email,String name,String surname,String phoneNumber)
    {
        return new User.Builder()
                       .Email(email)
                       .buildName(name)
                       .buildSurname(surname)
                       .buildPhoneNumber(phoneNumber)
                       .build();
    }
}
