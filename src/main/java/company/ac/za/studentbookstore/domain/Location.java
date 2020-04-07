package company.ac.za.studentbookstore.domain;

import javafx.util.Builder;

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

    private Location(){}

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getDescription() {
        return description;
    }

    public Location(Builder builder)
    {
        this.id = builder.id;
        this.title = builder.title;
        this.longitude = builder.longitude;
        this.latitude = builder.latitude;
        this.description = builder.description;
    }
    public static class Builder
    {
        private String id;
        private String title;
        private String longitude;
        private String latitude;
        private String description;

        public Builder Id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder Title(String title)
        {
            this.title = title;
            return this;
        }
        public Builder Longitude(String longitude)
        {
            this.longitude = longitude;
            return this;
        }
        public Builder Latitude(String latitude)
        {
            this.latitude = latitude;
            return this;
        }
        public Builder Description(String description)
        {
            this.description = description;
            return this;
        }

        public Location build()
        {
            return new Location(this);
        }
    }

    @Override
    public String toString() {
        return "Location{" + "id='" + id + '\'' + ", " +
                "title='" + title + '\'' + ", longitude='" + longitude + '\'' + ", " +
                "latitude='" + latitude + '\'' + ", description='" + description + '\'' + '}';
    }
}
