package se.lexicon.ishwarya.booklender_springboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Loan extends CrudRepository<Loan,Long> {
    List<Loan> findByUserId(Long userId);
    List<Loan> findByBookId(Long bookId);
    @Query("SELECT l FROM Loan l WHERE l.concluded = :concluded")
    List<Loan> findByConcludedStatus(@Param("concluded") boolean concluded);

}
