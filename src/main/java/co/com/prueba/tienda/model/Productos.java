package co.com.prueba.tienda.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Productos extends AbstractPersistable<Long>{

	private static final long serialVersionUID = -3937969749127183506L;
	
	private String nombre;
	private String cantidad;
	private String precio;
	
	//vamos a crear un campo trasendente para categoriasId
	private transient Long idCategorias; 
	private transient Long idVentas;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categorias categorias;
	
	//@OneToOne
	//@JoinColumn(name="id_ventas")
	//private Ventas ventas;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	
	
	
	public Long getIdVentas() {
		return idVentas;
	}
	public void setIdVentas(Long idVentas) {
		this.idVentas = idVentas;
	}
//	public Ventas getVentas() {
//		return ventas;
//	}
//	public void setVentas(Ventas ventas) {
//		this.ventas = ventas;
//	}
	public Long getIdCategorias() {
		return idCategorias;
	}
	public void setIdCategorias(Long idCategorias) {
		this.idCategorias = idCategorias;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Categorias getCategorias() {
		return categorias;
	}
	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
	 

}
