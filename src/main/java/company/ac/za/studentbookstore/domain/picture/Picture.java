package company.ac.za.studentbookstore.domain.picture;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class Picture {
    @Id
    private String id;
    private byte[] picture;
    private String description;

    private Picture(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + id + '\'' +
                ", picture=" + Arrays.toString(picture) +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private byte[] picture;
        private String description;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildPicture(byte[] picture){
            this.picture=picture;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Picture build(){
            Picture picture=new Picture();
            picture.description=this.description;
            picture.id=this.id;
            picture.picture=this.picture;
            return picture;
        }

    }
}
