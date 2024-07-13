package com.cesde.cursos.service;

import com.cesde.cursos.model.Docente;
import com.cesde.cursos.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    public Optional<Docente> findById(Long id) {
        return docenteRepository.findById(id);
    }

    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

    public void deleteById(Long id) {
        docenteRepository.deleteById(id);
    }
}