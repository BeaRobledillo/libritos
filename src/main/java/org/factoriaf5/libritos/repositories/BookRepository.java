package org.factoriaf5.libritos.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBooksByTitleContaining(String word);

    List<Book> findBooksByCategoryEquals(String category);
}