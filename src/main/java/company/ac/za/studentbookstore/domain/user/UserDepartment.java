package company.ac.za.studentbookstore.domain.user;

import javafx.util.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDepartment {
    @Id
    private String email;
    private String department_id;
    private String description;

    private UserDepartment(){}

    public String getEmail() {
        return email;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public String getDescription() {
        return description;
    }

    public UserDepartment(Builder builder)
    {
        this.email = builder.email;
        this.department_id = builder.department_id;
        this.description = builder.description;
    }

    public static class Builder
    {
        private String email;
        private String department_id;
        private String description;

        public Builder email(String email)
        {
            this.email = email;
            return this;
        }
        public Builder departmentId(String department_id)
        {
            this.department_id = department_id;
            return this;
        }
        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public UserDepartment build()
        {
            return new UserDepartment(this);
        }
    }
}
