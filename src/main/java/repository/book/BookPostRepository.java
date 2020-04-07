package repository.book;

import company.ac.za.studentbookstore.domain.book.BookPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPostRepository extends JpaRepository<BookPost,String> {
}
