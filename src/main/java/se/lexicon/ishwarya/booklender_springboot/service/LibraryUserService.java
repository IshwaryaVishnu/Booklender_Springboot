package se.lexicon.ishwarya.booklender_springboot.service;

import se.lexicon.ishwarya.booklender_springboot.dto.LibraryUserDto;

import java.util.List;

public interface LibraryUserService {

    LibraryUserDto findById(Integer userId);
    LibraryUserDto findByEmailId(String email);
    List<LibraryUserDto> findAll();
    LibraryUserDto create(LibraryUserDto libraryUserDto);
    LibraryUserDto update(LibraryUserDto libraryUserDto);
    Boolean  delete(Integer userId);
}
