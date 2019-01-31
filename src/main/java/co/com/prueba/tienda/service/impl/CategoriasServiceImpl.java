package co.com.prueba.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.prueba.tienda.model.Categorias;
import co.com.prueba.tienda.repository.CategoriasRepository;
import co.com.prueba.tienda.service.CategoriasService;

@Service
public class CategoriasServiceImpl implements CategoriasService {

	private CategoriasRepository categoriasRepository;
	
	@Autowired
	public CategoriasServiceImpl(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	}

	public List<Categorias> cateList() {
		
		return categoriasRepository.findAll();
	}

	public Categorias findOne(Long id) {
		
		return categoriasRepository.findOne(id);
	}

	public Categorias addCategorias(Categorias categorias) {
		
		return categoriasRepository.save(categorias);
	}

	public String deleteCategorias(Long id) {
		categoriasRepository.delete(id);
		return "{'message':'Categoria eliminada correctamente}";
	}
	
	

}
