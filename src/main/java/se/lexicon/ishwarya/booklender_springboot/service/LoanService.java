package se.lexicon.ishwarya.booklender_springboot.service;

import se.lexicon.ishwarya.booklender_springboot.dto.LoanDto;

import java.util.List;

public interface LoanService {
    LoanDto findById(long loanId);
    List<LoanDto> findByBookId(Integer bookId);
    List<LoanDto> findByUserId(Integer userId);
    List<LoanDto> findByConcluded(long loanId);
    List<LoanDto> findAll();
    LoanDto create(LoanDto LoanDto);
    LoanDto update(LoanDto LoanDto);
    Boolean delete(long loanId);
}
