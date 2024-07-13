package com.cesde.cursos.model;

public @interface OneToMany {

	String mappedBy();

	String cascade();

}
