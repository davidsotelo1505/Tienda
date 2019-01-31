package co.com.prueba.tienda.service;

import java.util.List;

import co.com.prueba.tienda.model.Categorias;

public interface CategoriasService {
	List<Categorias> cateList();
	
	Categorias findOne(Long id);
	
	Categorias addCategorias(Categorias categorias);
	
	String deleteCategorias(Long id);
}
