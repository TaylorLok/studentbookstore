package company.ac.za.studentbookstore.domain.user;

import javafx.util.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class UserImage {
    @Id
    private String email;
    private String image_id;
    private String description;
    private Date date;

    private UserImage(){}

    public String getEmail() {
        return email;
    }

    public String getImage_id() {
        return image_id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public UserImage(Builder builder)
    {
        this.date = builder.date;
        this.description = builder.description;
        this.email = builder.email;
        this.image_id = builder.image_id;
    }

    public static class Builder
    {
        private String email;
        private String image_id;
        private String description;
        private Date date;

        public Builder Email(String email)
        {
            this.email = email;
            return this;
        }
        public Builder ImageId(String image_id)
        {
            this.image_id = image_id;
            return this;
        }
        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Builder Date(Date date)
        {
            this.date = date;
            return this;
        }

        public UserImage build()
        {
            return new UserImage(this);
        }
    }
}
