package paquetepadre;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Padre {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String nombre;

//One padre tiene Many Hijo
@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
//@Fetch(value = FetchMode.JOIN)
private List<Hijo> hijos=new ArrayList();


public Padre() {
	
}

public Padre(String nombre, List<Hijo> hijos) {
	super();
	this.nombre = nombre;
	this.hijos = hijos;
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

public List<Hijo> getHijos() {
	return hijos;
}

public void setHijos(List<Hijo> hijos) {
	this.hijos = hijos;
}

@Override
public String toString() {
	return "Padre [id=" + id + ", nombre=" + nombre + ", hijos=" + hijos + "]";
}


	
}
