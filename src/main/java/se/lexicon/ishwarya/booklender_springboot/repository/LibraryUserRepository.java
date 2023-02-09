package se.lexicon.ishwarya.booklender_springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.ishwarya.booklender_springboot.model.entity.LibraryUser;

import java.util.Optional;

@Repository
public interface LibraryUserRepository extends CrudRepository<LibraryUser,Integer> {
    Optional<LibraryUser> findByEmailIgnoreCase(String email);
}
