package company.ac.za.studentbookstore.factory.domain.user;

import company.ac.za.studentbookstore.domain.user.UserImage;

import java.util.Date;

public class UserImageFactory
{
    public static UserImage getUserImage(String email, String image_id, String description, Date date)
    {
        return new UserImage.Builder()
                .Date(date)
                .ImageId(image_id)
                .Email(email)
                .description(description)
                .build();
    }
}
