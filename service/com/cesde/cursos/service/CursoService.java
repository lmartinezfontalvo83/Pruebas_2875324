package com.cesde.cursos.service;

import com.cesde.cursos.model.Curso;
import com.cesde.cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> findById(Long id) {
        return cursoRepository.findById(id);
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }
}