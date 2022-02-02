package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class ProductManagerTest {

    @Test
    void shouldSearchBy() {
        Product first = new Book(1,"Книга","ОП",50);
        Product two = new Smartphone(2,"телефон", "телефон", 30);
        ProductManager manager = new ProductManager(new ProductRepository());
        manager.add(first);
        manager.add(two);
        Product[] actual = manager.searchBy("Книга");
        Product[] ex = {new Book(1,"Книга","ОП",50)};

        assertArrayEquals( ex, actual);
    }
}