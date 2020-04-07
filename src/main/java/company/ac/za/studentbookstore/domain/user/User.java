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

    private User(){}// default constructor of the repository.user class only

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSurname() {
        return surname;
    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "email='" + email + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
    public User(Builder builder) // i added the builder constructor here
    {
        this.email = builder.email;
        this.name = builder.name;
        this.surname = builder.surname;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder{
        private String email;
        private String name;
        private String surname;
        private String phoneNumber;

        public Builder Email(String email){
            this.email=email;
            return this;
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
//            User repository.user=new User();
//            repository.user.email=this.email;
//            repository.user.name=this.name;
//            repository.user.phoneNumber=this.phoneNumber;
//            repository.user.surname=this.surname;
            return new User(this);
        }
    }

    // this is where to string method should be and looks clean instead of inside :)

    @Override
    public String toString() {
        return "User{" + "email='" + email + '\'' + ", " +
                "name='" + name + '\'' + ", surname='" + surname + '\'' + "," +
                " phoneNumber='" + phoneNumber + '\'' + '}';
    }
}
