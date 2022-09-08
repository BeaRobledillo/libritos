package org.factoriaf5.libritos.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private BookRepository bookRepository;

    @Autowired
    public SampleDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        bookRepository.saveAll(List.of(
                new Book("Una habitación propia", "Virginia Woolf", "Essay"),
                new Book("Un mago de Terramar", "Ursula K. Leguin", "Fantasy"),
                new Book("Los desposeídos", "Ursula K. Leguin", "Fantasy"),
                new Book("Lean Software Development", "Mary Poppendieck", "Software"),
                new Book("Women, Race and Class", "Angela Y. Davis", "Essay"),
                new Book("Object Design", "Rebecca Wirfs-Brock", "Software")
        ));
    }
}