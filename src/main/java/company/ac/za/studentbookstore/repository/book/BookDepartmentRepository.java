package company.ac.za.studentbookstore.repository.book;

import company.ac.za.studentbookstore.domain.book.BookDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDepartmentRepository extends JpaRepository<BookDepartment,String> {
}
