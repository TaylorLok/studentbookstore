package company.ac.za.studentbookstore.repository.book;

import company.ac.za.studentbookstore.domain.book.BookPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPostRepository extends JpaRepository<BookPost,String> {
}
