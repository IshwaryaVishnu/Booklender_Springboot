package se.lexicon.ishwarya.booklender_springboot.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.ishwarya.booklender_springboot.model.entity.Book;
import se.lexicon.ishwarya.booklender_springboot.model.entity.LibraryUser;
import se.lexicon.ishwarya.booklender_springboot.model.entity.Loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@DataJpaTest
public class LoanTest {


    @Autowired
    LoanRepository loanRepository;

    LibraryUser user1;
    Book book1;
    Loan loan1;

}