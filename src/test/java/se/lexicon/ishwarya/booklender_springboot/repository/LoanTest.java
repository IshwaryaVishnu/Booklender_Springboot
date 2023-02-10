package se.lexicon.ishwarya.booklender_springboot.repository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.ishwarya.booklender_springboot.model.entity.Book;
import se.lexicon.ishwarya.booklender_springboot.model.entity.LibraryUser;
import se.lexicon.ishwarya.booklender_springboot.model.entity.Loan;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class LoanTest {
    @Autowired
     LoanRepository loanRepository;
     Loan loan;

    @BeforeEach
    void setUp() {
        LibraryUser loanTaker = new LibraryUser("FirstName", "email@email.com");
        Book book = new Book("Title", 7, BigDecimal.valueOf(10), "Description");
        loan = new Loan(loanTaker, book, LocalDate.now(), false);
        loanRepository.save(loan);
    }

    @Test
    void given_valid_userId_when_findByUserId_then_return_loan() {
        List<Loan> result = loanRepository.findByUserId(Long.valueOf(loan.getLoanTaker().getUserId()));
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(loan, result.get(0));
    }

    @Test
    void given_valid_bookId_when_findByBookId_then_return_loan() {
        List<Loan> result = loanRepository.findByBookId(Long.valueOf(loan.getBook().getBookId()));
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(loan, result.get(0));
    }

    @Test
    void given_valid_concluded_when_findByConcludedStatus_then_return_loan() {
        List<Loan> result = loanRepository.findByConcludedStatus(loan.isConcluded());
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(loan, result.get(0));
    }
}









