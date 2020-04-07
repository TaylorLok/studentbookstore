package company.ac.za.studentbookstore.domain;

import javafx.util.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department
{
    @Id
    private String id;
    private String department_Name;
    private String description;

    private Department(){}

    public String getId() {
        return id;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public String getDescription() {
        return description;
    }

    public Department(Builder builder)
    {
        this.id = builder.id;
        this.department_Name = builder.department_Name;
        this.description = builder.description;
    }

    public static class Builder
    {
        private String id;
        private String department_Name;
        private String description;

        public Builder Id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder DepartmentName(String department_Name)
        {
            this.department_Name = department_Name;
            return this;
        }
        public Builder Description(String description)
        {
            this.description = description;
            return this;
        }

        public Department build()
        {
            return new Department(this);
        }
    }
}
