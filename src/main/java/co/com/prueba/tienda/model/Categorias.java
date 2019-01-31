package co.com.prueba.tienda.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
public class Categorias extends AbstractPersistable<Long> {
	
	private static final long serialVersionUID = -5342069690984251312L;
		
		
		
		private String nombreCat;
		
		@OneToMany(targetEntity=Productos.class, mappedBy= "categorias", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
		private List<Productos> productos;
		
		
		public String getNombreCat() {
			return nombreCat;
		}
		public void setNombreCat(String nombreCat) {
			this.nombreCat = nombreCat;
		}
		
}
