package co.com.prueba.tienda.service;

import java.util.List;

import co.com.prueba.tienda.model.Ventas;

public interface VentasService {
	List<Ventas> ventasList();
	
	Ventas findOne(Long id);
	
	Ventas addVentas(Ventas ventas);
	
	String deleteVentas(Long id);
}
