package co.com.prueba.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.prueba.tienda.model.Ventas;
import co.com.prueba.tienda.service.ProductosService;
import co.com.prueba.tienda.service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	private ProductosService productosService;
	private VentasService ventasService;
	
	@Autowired
	public VentasController(VentasService ventasService) {
		this.ventasService = ventasService;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteVentas(@PathVariable Long id) {
		return ventasService.deleteVentas(id);
	}
	
	public class Post {
	    
	}
	
	@RequestMapping("/add")
	public Ventas addVentas(@RequestBody Ventas ventas) {
		
		return ventasService.addVentas(ventas);
	}
	
	@RequestMapping("/list/{id}")
	public Ventas findOne(@PathVariable Long id) {
		return ventasService.findOne(id);
	}
	
	@RequestMapping("/list")
	public List<Ventas> ventasService(){
		return ventasService.ventasList();
	}
	
}
