package co.com.prueba.tienda.service;

import java.util.List;

import co.com.prueba.tienda.model.Productos;

public interface ProductosService {
	List<Productos> productosList();
	
	Productos findOne(Long id);
	
	Productos addProductos(Productos productos);
	
	String deleteProductos(Long id);
	

}
