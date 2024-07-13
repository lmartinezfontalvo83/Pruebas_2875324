package com.cesde.cursos.repository;

import com.cesde.cursos.model.Docente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {

	List<Docente> findAll();

	Optional<Docente> findById(Long id);

	Docente save(Docente docente);

	void deleteById(Long id);
}