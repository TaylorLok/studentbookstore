package company.ac.za.studentbookstore.controller.book;

import company.ac.za.studentbookstore.domain.book.Book;
import company.ac.za.studentbookstore.factory.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {
    private static  final String Base_url="http://localhost:8080/sts/book";
    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeEach
    void setUp() {
    }

    @Test
    void create() {
//        Book book= BookFactory.getBook("Bible","French","VI",2000);
//        ResponseEntity responseEntity=restTemplate.withBasicAuth("admin","095b1eed-24e4-4359-9643-96419fab85f4")
//                .postForEntity(Base_url+"/create",book,Book.class);
//        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
//        System.out.println(responseEntity.getBody());
    }

    @Test
    void delete() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void readAll() {
    }
}