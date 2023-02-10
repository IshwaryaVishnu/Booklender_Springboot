package se.lexicon.ishwarya.booklender_springboot.repository;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.ishwarya.booklender_springboot.model.entity.LibraryUser;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class LibraryUserTest {
    @Autowired
     LibraryUserRepository repository;

     LibraryUser testUser;

    @BeforeEach
    void setUp() {
        testUser = new LibraryUser( " Name", "testuser@email.com");
        repository.save(testUser);
    }

    @Test
    void given_email_when_findByEmailIgnoreCase_then_return_user() {
        Optional<LibraryUser> result = repository.findByEmailIgnoreCase("testuser@email.com");
        assertTrue(result.isPresent());
        assertEquals(" Name", result.get().getName());
    }

    @Test
    void given_non_existing_email_when_findByEmailIgnoreCase_then_return_empty() {
        Optional<LibraryUser> result = repository.findByEmailIgnoreCase("non_existing_user@email.com");
        assertFalse(result.isPresent());
    }
}

