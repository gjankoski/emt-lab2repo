package mk.ukim.finki.wp.exam.example.service;

import mk.ukim.finki.wp.exam.example.model.Book;

import java.util.Optional;

public interface CountryService {

    Optional<Book> findById(Long id);

}
