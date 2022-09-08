package org.factoriaf5.libritos.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {

    public CategoryRepository() {
    }

    public List<Category> findAll() {
        return List.of(
                new Category("Essay"),
                new Category("Fantasy"),
                new Category("Software")
        );
    }
}