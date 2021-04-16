package mk.ukim.finki.wp.exam.example.service.impl;

import mk.ukim.finki.wp.exam.example.model.Book;
import mk.ukim.finki.wp.exam.example.repository.CountryRepository;
import mk.ukim.finki.wp.exam.example.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.countryRepository.findById(id);
    }
}
