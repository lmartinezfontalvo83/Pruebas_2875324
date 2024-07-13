package com.cesde.cursos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private int duracionSemanas;
    private BigDecimal precio;
    private LocalDateTime fechaInicio;

    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

    
}