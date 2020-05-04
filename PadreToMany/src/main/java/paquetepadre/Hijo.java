package paquetepadre;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hijo {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int id;
	
	private String nombre;
	
	public Hijo() {
		
	}

	public Hijo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Hijo [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
