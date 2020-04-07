package company.ac.za.studentbookstore.factory.domain.book;

import company.ac.za.studentbookstore.domain.book.Book;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class BookFactoryTest {
Book book=BookFactory.getBook("bible","franch","louis second",2000);
    @Test
    void getBook() {
        Assert.isInstanceOf(Book.class,book);// checking if the object is an instance of Book class.
        System.out.println(book.toString());
    }
}