package factory.book;

import company.ac.za.studentbookstore.domain.book.BookImage;

public class BookImageFactory
{
    public static BookImage getBookByImage(String book_id,String image_id,String description)
    {
        return new BookImage.Builder(book_id)
                            .buildImageId(image_id)
                            .buildDescription(description)
                            .build();
    }
}
