package company.ac.za.studentbookstore.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailServiceTest {

    @Test
    void sendGrid() {
        MailService.sendGrid("espoirditekemena@gmail.com",001,"kasnf.uihekla");
    }
}