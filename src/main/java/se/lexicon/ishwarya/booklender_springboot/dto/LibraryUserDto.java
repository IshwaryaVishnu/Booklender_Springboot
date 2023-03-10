package se.lexicon.ishwarya.booklender_springboot.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LibraryUserDto {
    private int userId;
    private LocalDate regDate;
    private String name;
    private String email;

}
