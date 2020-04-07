package company.ac.za.studentbookstore.factory.service.book;

import company.ac.za.studentbookstore.service.book.BookService;

public class BookServiceFactory {
    public static BookService getBookService(){
        return BookService.getBookService();
    }
}
