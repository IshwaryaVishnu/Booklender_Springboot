package se.lexicon.ishwarya.booklender_springboot.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<LoanRepository,Long> {
    List<LoanRepository> findByUserId(Long userId);
    List<LoanRepository> findByBookId(Long bookId);
    @Query("SELECT l FROM Loan l WHERE l.concluded = :concluded")
    List<LoanRepository> findByConcludedStatus(@Param("concluded") boolean concluded);

}
