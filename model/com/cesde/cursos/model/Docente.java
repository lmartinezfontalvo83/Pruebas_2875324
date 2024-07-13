package com.cesde.cursos.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String documento;
    private String correo;

    @OneToMany(mappedBy = "docente", cascade = CascadeType.ALL)
    private List<Curso> cursos;


}