package co.com.prueba.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.prueba.tienda.model.Productos;
import co.com.prueba.tienda.repository.CategoriasRepository;
import co.com.prueba.tienda.repository.ProductosRepository;
import co.com.prueba.tienda.service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService {
	
	private ProductosRepository productosRepository;
	private CategoriasRepository categoriasRepository;
	
	@Autowired
	public ProductosServiceImpl(ProductosRepository productosRepository, CategoriasRepository categoriasRepository) {
		this.productosRepository = productosRepository;
		this.categoriasRepository = categoriasRepository;
	}

	public List<Productos> productosList() {
		
		return productosRepository.findAll();
	}

	public Productos findOne(Long id) {
		
		return productosRepository.findOne(id);
	}

	public Productos addProductos(Productos productos) {
		productos.setCategorias(categoriasRepository.findOne(productos.getIdCategorias()));
		return productosRepository.save(productos);
	}

	public String deleteProductos(Long id) {
		productosRepository.delete(id);
		return "{'message':'Producto eliminada correctamente}";
	}
	
	
	
	
}
