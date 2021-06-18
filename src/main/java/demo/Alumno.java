package demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="alumnos")
public class Alumno {

	
	
	//atributos
	@Id
	@Column(name="id_alumno",unique=true)
	private int id_alumno;
	
	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@Column(name="apellidos",nullable=false)
	private String apellidos;
	
	@Column(name="curso",nullable=false)
	private String curso;
	
	@Column(name="sexo",nullable=false)
	private	String sexo;
	
	@Column(name="repetidor",nullable=false)
	private boolean repetidor;
	
	@Column(name="id_tutor",nullable=false)
	private int id_tutor;

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public int getId_tutor() {
		return id_tutor;
	}

	public void setId_tutor(int id_tutor) {
		this.id_tutor = id_tutor;
	}
	
	
	
	
	
}