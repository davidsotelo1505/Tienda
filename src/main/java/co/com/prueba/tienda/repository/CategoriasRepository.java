package co.com.prueba.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.prueba.tienda.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

}
