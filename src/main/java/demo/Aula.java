package demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="aulas")
public class Aula {

	
	
	//atributos
	@Id
	@Column(name="id_aula",unique=true)
	private int id_aula;
	
	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@Column(name="planta",nullable=false)
	private int planta;
	
	@Column(name="capacidad",nullable=false)
	private int capacidad;
	
	@Column(name="disponibilidad",nullable=false)
	private	boolean disponibilidad;
	
	@Column(name="seccion",nullable=false)
	private String seccion;
	
	
	
	//metodos
	public int numero_alumnos()
	{
		return this.capacidad;
	}
	
	public boolean disponibilidad()
	{
		return this.disponibilidad;
	}

	public String toString()
	{
		return "Nombre aula: "+this.getNombre()+
				"Numero de aula "+this.getPlanta()+
				"Numero de alumnos: "+this.getCapacidad()+
				"disponibilidad: "+this.isDisponible();
	}

	public int getId_aula() {
		return id_aula;
	}

	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isDisponible() {
		return disponibilidad;
	}

	public void setDisponible(boolean disponible) {
		this.disponibilidad = disponible;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
}