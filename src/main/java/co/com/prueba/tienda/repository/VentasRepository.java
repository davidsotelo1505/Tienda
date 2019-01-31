package co.com.prueba.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.prueba.tienda.model.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Long>{

}
