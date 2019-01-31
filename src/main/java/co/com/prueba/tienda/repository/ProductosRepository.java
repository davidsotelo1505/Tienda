package co.com.prueba.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.prueba.tienda.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {

}
