package company.ac.za.studentbookstore.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private String id;
    private String title;
    private String longitude;
    private String latitude;
    private String description;
}
