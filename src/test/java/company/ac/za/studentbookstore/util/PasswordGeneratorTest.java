package company.ac.za.studentbookstore.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void getPasword() {
        System.out.println(PasswordGenerator.getPasword());
    }
}