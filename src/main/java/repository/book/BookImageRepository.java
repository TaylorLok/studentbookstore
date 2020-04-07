package repository.book;

import company.ac.za.studentbookstore.domain.book.BookImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookImageRepository extends JpaRepository<BookImage,String> {
}
