package company.ac.za.studentbookstore.domain.book;

import javafx.util.Builder;

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

    private BookPost(){}

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getBook_id() {
        return book_id;
    }

    public Date getDate() {
        return date;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public BookPost (Builder builder)
    {
        this.id =  builder.id;
        this.email = builder.email;
        this.book_id = builder.book_id;
        this.date = builder.date;
        this.locationId = builder.locationId;
        this.status = builder.status;
        this.description = builder.description;
    }

    public static class Builder
    {
        private String id;
        private String email;
        private String book_id;
        private Date date;
        private String locationId;
        private String status;
        private String description;


        public Builder Id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder Email(String email)
        {
            this.email = email;
            return this;
        }
        public Builder BookId(String book_id)
        {
            this.book_id = book_id;
            return this;
        }
        public Builder Date(Date date)
        {
            this.date = date;
            return this;
        }
        public Builder LocationId(String locationId)
        {
            this.locationId = locationId;
            return this;
        }
        public Builder Status(String status)
        {
            this.status = status;
            return this;
        }
        public Builder Description(String description)
        {
            this.description = description;
            return this;
        }

        public BookPost build()
        {
            return new BookPost(this);
        }

    }

    @Override
    public String toString() {
        return "BookPost{" + "id='" + id + '\'' + ", email='" + email +
                '\'' + ", book_id='" + book_id + '\'' + ", date=" + date + ", " +
                "locationId='" + locationId + '\'' + ", status='" + status + '\'' + "," +
                " description='" + description + '\'' + '}';
    }
}
