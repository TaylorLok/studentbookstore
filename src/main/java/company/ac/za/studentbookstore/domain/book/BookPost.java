package company.ac.za.studentbookstore.domain.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BookPost {
    @Id
    private String id;
    private String email;
    private String book_id;
    private Date date;
    private String locationId;
    private String status;
    private String description;
}
