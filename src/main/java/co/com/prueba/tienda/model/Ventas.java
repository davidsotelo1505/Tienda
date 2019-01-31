package co.com.prueba.tienda.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Ventas extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -6963688032895148865L;

	private Integer cantidadVenta;
	private Integer precioVenta;
	
	//@OneToOne(targetEntity=Ventas.class, mappedBy= "ventas", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	//private Productos productos;
	
	public Integer getCantidadVenta() {
		return cantidadVenta;
	}

	public void setCantidadVenta(Integer cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}

	public Integer getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Integer precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
	
}
