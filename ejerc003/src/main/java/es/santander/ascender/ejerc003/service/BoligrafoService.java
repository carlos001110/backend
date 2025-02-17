package es.santander.ascender.ejerc003.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc003.model.Boligrafo;
import es.santander.ascender.ejerc003.repository.BoligrafoRepository;

@Service
public class BoligrafoService {

    @Autowired
    private BoligrafoRepository repository;

    public Boligrafo create(Boligrafo boligrafo) {
        if (boligrafo.getId() != null) {
            throw new CrudSecurityException("Han tratado de modificar un registro de Boligrafo utilizando la creación",
                                             CrudOperation.CREATE, 
                                             boligrafo.getId());
        }
        return repository.save(boligrafo);            
    }
}
