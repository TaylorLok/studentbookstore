package company.ac.za.studentbookstore.util;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGSampleTest {

    @Test
    void sendSimpleMessage() throws UnirestException {
        MGSample.sendSimpleMessage("espoirditekemena@gmail.com",001,"lsd;fdjhkldlfdsf");
    }
}