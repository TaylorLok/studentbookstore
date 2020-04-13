package company.ac.za.studentbookstore.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentDataTest {

    @Test
    void getCurrentTime() {
        System.out.println(CurrentData.getCurrentTime());
    }
}