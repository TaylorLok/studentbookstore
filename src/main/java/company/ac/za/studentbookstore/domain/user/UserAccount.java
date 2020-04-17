package company.ac.za.studentbookstore.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserAccount {
    @Id
    private String email;
    private String password;
    private String account_status;
    private Date date;

    private UserAccount() {
    }

    public UserAccount(Builder builder) {
        this.account_status=builder.account_status;
        this.date=builder.date;
        this.email=builder.email;
        this.password=builder.password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAccount_status() {
        return account_status;
    }

    public Date getDate() {
        return date;
    }

    public static class Builder{
        private String email;
        private String password;
        private String account_status;
        private Date date;

        public Builder(String email){
            this.email=email;
        }
        public Builder buildPassword(String password){
            this.password=password;
            return this;
        }
        public Builder buildAccountStatus(String account_status){
            this.account_status=account_status;
            return this;
        }
        public Builder buildDate(Date date){
            this.date=date;
            return this;
        }
        public UserAccount build(){
            return new UserAccount(this);
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", account_status='" + account_status + '\'' +
                ", date=" + date +
                '}';
    }

}
