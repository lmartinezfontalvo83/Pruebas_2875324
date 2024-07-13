package com.cesde.cursos.repository;

import com.cesde.cursos.model.Curso;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

	List<Curso> findAll();

	Optional<Curso> findById(Long id);

	Curso save(Curso curso);

	void deleteById(Long id);
}