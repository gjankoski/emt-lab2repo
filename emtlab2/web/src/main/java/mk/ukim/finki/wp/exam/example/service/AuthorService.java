package mk.ukim.finki.wp.exam.example.service;

import mk.ukim.finki.wp.exam.example.model.Author;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface AuthorService {
    Optional<Author> findById(Long id);

}
