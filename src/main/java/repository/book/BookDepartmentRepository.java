package repository.book;

import company.ac.za.studentbookstore.domain.book.BookDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDepartmentRepository extends JpaRepository<BookDepartment,String> {
}
