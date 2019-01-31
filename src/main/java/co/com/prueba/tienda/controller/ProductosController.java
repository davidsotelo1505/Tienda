package co.com.prueba.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.prueba.tienda.model.Productos;
import co.com.prueba.tienda.service.ProductosService;

@RestController
@RequestMapping("/productos")
public class ProductosController {
	
	private ProductosService productosService;
	
	@Autowired
	public ProductosController(ProductosService productosService) {
		this.productosService = productosService;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProductos(@PathVariable Long id) {
		return productosService.deleteProductos(id);
	}
	public class Post {
	    
	}
	
	@RequestMapping("/add")
	public Productos addProductos(@RequestBody Productos productos) {
		return productosService.addProductos(productos);
	}
	
	@RequestMapping("/list/{id}")
	public Productos findOne(@PathVariable Long id) {
		return productosService.findOne(id);
	}
	@RequestMapping("/list")
	public List<Productos> productosList(){
		return productosService.productosList();
	}
	
	
	
}
