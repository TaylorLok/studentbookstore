package company.ac.za.studentbookstore.factory.domain.picture;

import company.ac.za.studentbookstore.domain.picture.Picture;

public class PictureFactory
{
    public static Picture getPicture(String id,byte[] picture,String description)
    {
        return new Picture.Builder(id)
                          .buildPicture(picture)
                          .buildDescription(description)
                          .build();
    }
}
