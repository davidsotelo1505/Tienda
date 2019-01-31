package co.com.prueba.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.prueba.tienda.model.Ventas;
import co.com.prueba.tienda.repository.VentasRepository;
import co.com.prueba.tienda.service.VentasService;

@Service
public class VentasServiceImpl implements VentasService{
	
	private VentasRepository ventasRepository;
	
	@Autowired
	public VentasServiceImpl(VentasRepository ventasRepository) {
		this.ventasRepository = ventasRepository;
	}

	public List<Ventas> ventasList() {
		
		return ventasRepository.findAll();
	}

	public Ventas findOne(Long id) {
		
		return ventasRepository.findOne(id);
	}

	public Ventas addVentas(Ventas ventas) {
		
		return ventasRepository.save(ventas);
	}

	public String deleteVentas(Long id) {
		ventasRepository.delete(id);
		return "{'message':'Venta eliminada correctamente}";
	}

}
