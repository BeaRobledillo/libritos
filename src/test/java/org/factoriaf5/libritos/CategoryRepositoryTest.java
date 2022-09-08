package org.factoriaf5.libritos;

import org.factoriaf5.libritos.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class CategoryRepositoryTest {

    @Test
    void providesTheValidCategories() {

        CategoryRepository categoryRepository = new CategoryRepository();

        assertThat(categoryRepository.findAll(), hasItems(
                hasProperty("name", is("Essay")),
                hasProperty("name", is("Fantasy")),
                hasProperty("name", is("Software"))
        ));
    }
}