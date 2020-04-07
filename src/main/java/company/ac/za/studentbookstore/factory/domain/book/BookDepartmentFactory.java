package company.ac.za.studentbookstore.factory.domain.book;

import company.ac.za.studentbookstore.domain.book.BookDepartment;

public class BookDepartmentFactory
{
    public static BookDepartment getBookByDepartment(String book_Id,String department_Id,String description)
    {
        return new BookDepartment.Builder()
                                 .BookId(book_Id)
                                 .buildDepartmentId(department_Id)
                                 .builderDescription(description)
                                 .build();
    }
}
