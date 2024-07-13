package com.cesde.cursos.controller;

import com.cesde.cursos.model.Curso;
import com.cesde.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping(value = "1")
    public List<Curso> getAllCursos() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
        return cursoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> updateCurso(@PathVariable Long id, @RequestBody Curso curso) {
        return cursoService.findById(id)
                .map(cursoExistente -> {
                    curso.setId(cursoExistente.getId());
                    return ResponseEntity.ok(cursoService.save(curso));
                })
                .orElse(((Object) ResponseEntity.notFound()).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
        return cursoService.findById(id)
                .map(curso -> {
                    cursoService.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(((Object) ResponseEntity.notFound()).build());
    }
}