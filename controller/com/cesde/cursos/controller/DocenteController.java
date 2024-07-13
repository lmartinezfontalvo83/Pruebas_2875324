package com.cesde.cursos.controller;

import com.cesde.cursos.model.Docente;
import com.cesde.cursos.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping(value = "1")
    public List<Docente> getAllDocentes() {
        return docenteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> getDocenteById(@PathVariable Long id) {
        return docenteService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Docente createDocente(@RequestBody Docente docente) {
        return docenteService.save(docente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Docente> updateDocente(@PathVariable Long id, @RequestBody Docente docente) {
        return docenteService.findById(id)
                .map(docenteExistente -> {
                    docente.setId(docenteExistente.getId());
                    return ResponseEntity.ok(docenteService.save(docente));
                })
                .orElse(((Object) ResponseEntity.notFound()).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocente(@PathVariable Long id) {
        return docenteService.findById(id)
                .map(docente -> {
                    docenteService.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(((Object) ResponseEntity.notFound()).build());
    }
}