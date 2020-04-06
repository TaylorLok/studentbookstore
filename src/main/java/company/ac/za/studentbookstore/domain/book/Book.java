package company.ac.za.studentbookstore.domain.book;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private String id;
    private String title;
    private String language;
    private String edition;
    private double price;
    private Book(Builder builder){}

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getLanguage() {
        return language;
    }

//    public void setLanguage(String language) {
//        this.language = language;
//    }

    public String getEdition() {
        return edition;
    }

//    public void setEdition(String edition) {
//        this.edition = edition;
//    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(double price) {
//        this.price = price;
//    }
    public static class Builder{
        private String id;
        private String title;
        private String language;
        private String edition;
        private double price;

        public Builder Id(String id){
            this.id=id;
            return this;
        }
        public Builder buildTitle(String title){
            this.title=title;
            return this;
        }
        public Builder buildLanguage(String language){
            this.language=language;
            return this;
        }
        public Builder buildedition(String edition){
            this.edition=edition;
            return this;
        }
        public Builder Price(double price){
            this.price=price;
            return this;
        }
        public Book build(){
//            Book book=new Book();
//            book.edition=this.edition;
//            book.id=this.id;
//            book.language=this.language;
//            book.title=this.title;
//            book.price=this.price;
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" + "id='" + id + '\'' + ", title='" + title +
                '\'' + ", language='" + language + '\'' + ", edition='" + edition + '\'' + ", price=" + price + '}';
    }
}
