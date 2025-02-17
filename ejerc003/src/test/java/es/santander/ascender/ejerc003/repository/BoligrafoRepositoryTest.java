package es.santander.ascender.ejerc003.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc003.model.Boligrafo;

@SpringBootTest
public class BoligrafoRepositoryTest {

    @Autowired
    private BoligrafoRepository repository;

    @Test
    public void testCreate(){
        Boligrafo boligrafo= new Boligrafo();
       
        repository.save(boligrafo);

         assertTrue(
            repository
                .findById(boligrafo.getId())
                .isPresent());
    }
}
