package company.ac.za.studentbookstore.factory.domain;

import company.ac.za.studentbookstore.domain.Language;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageFactoryTest {
Language language=LanguageFactory.getLanguage("french");
    @BeforeEach
    void setUp() {
    }

    @Test
    void getLanguage() {
        System.out.println(language.toString());
    }
}