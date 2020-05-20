package company.ac.za.studentbookstore.util;

import java.io.File;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class MGSample {
    // ...
    public static JsonNode sendSimpleMessage(String EMAIL_TO,int contentIndex, String code) throws UnirestException {
        String API_KEY= "f9dd6d5089953c95467d0560ef4b1340-e5e67e3e-fa1b6648";
        String YOUR_DOMAIN_NAME = "sandboxeb23bedf759347409706b34c746bbf5c.mailgun.org";

        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + YOUR_DOMAIN_NAME + "/messages")
                .basicAuth("api", API_KEY)
                .field("from", "BookVerse <DO-NOT-REPLY@TOTHISEMAIL.COM>")
                .field("to", EMAIL_TO)
                //.field("cc", "bob@example.com")
                //.field("bcc", "joe@example.com")
                .field("subject", getSubejct(contentIndex))
                .field("text", getMessage(contentIndex,code))
                //.field("html", "<html>HTML version </html>")
                //.field("attachment", new File("/temp/folder/test.txt"))
                .asJson();

        return request.getBody();
    }
    public static String getSubejct(int contentIndex){
        switch (contentIndex){
            case 001:
                return "Confirm Registration on Bookverse";
            case 002:
                return "New post";
        }
        return null;
    }
    public static String getMessage(int contentIndex,String code){
        switch (contentIndex){
            case 001:
                return "Thank you for registering on our system.\nto confirm your registration please click the following link\nhttp://102.130.119.251:40001/user/userAccount/"+code;
            case 002:
                return "Your book : "+code+"\n has been posted submitted successfully";
        }
        return null;
    }
}

