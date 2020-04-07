package factory.book;

import company.ac.za.studentbookstore.domain.book.BookPost;

import java.util.Date;

public class BookPostFactory
{
    public static BookPost getPostedBook(String id,String email,String book_id,Date date, String locationId, String status, String description)
    {
        return new BookPost.Builder()
                           .BookId(book_id)
                           .Date(date)
                           .Description(description)
                           .Id(id)
                           .Email(email)
                           .LocationId(locationId)
                           .Status(status)
                           .build();
    }
}
