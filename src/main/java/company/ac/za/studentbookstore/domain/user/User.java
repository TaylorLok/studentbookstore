package company.ac.za.studentbookstore.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String email;
    private String name;
    private String surname;
    private String phoneNumber;

    private User(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public static class Builder{
        private String email;
        private String name;
        private String surname;
        private String phoneNumber;

        public Builder(String email){
            this.email=email;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildSurname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder buildPhoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public User build(){
            User user=new User();
            user.email=this.email;
            user.name=this.name;
            user.phoneNumber=this.phoneNumber;
            user.surname=this.surname;
            return user;
        }
    }
}
