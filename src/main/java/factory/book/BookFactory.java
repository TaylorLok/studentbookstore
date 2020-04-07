package factory.book;

import company.ac.za.studentbookstore.domain.book.Book;

public class BookFactory
{
    public static Book getBook(String id,String title,String language,String edition,double price)
    {
        return new Book.Builder()
                .buildedition(edition)
                .Id(id)
                .buildTitle(title)
                .buildLanguage(language)
                .Price(price)
                .build();
    }

}
