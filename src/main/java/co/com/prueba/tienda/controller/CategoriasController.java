package co.com.prueba.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.prueba.tienda.model.Categorias;
import co.com.prueba.tienda.service.CategoriasService;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {
	private CategoriasService categoriasService;
	
	@Autowired
	public CategoriasController(CategoriasService categoriasService) {
		this.categoriasService = categoriasService;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCategorias(@PathVariable Long id) {
		return categoriasService.deleteCategorias(id);
	}
	
	@RequestMapping("/add")
	public Categorias addCategorias(@RequestBody Categorias categorias) {
		return categoriasService.addCategorias(categorias);
	}
	
	
	@RequestMapping("/list/{id}")
	public Categorias findOne(@PathVariable Long id) {
		return categoriasService.findOne(id);
	}
	
	@RequestMapping("/list")
	public List<Categorias> categoriasService(){
		return categoriasService.cateList();
	}
	
}
