package gestionClinicaPrueba.pruebaTD.modelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "Doctores")
public class Doctor {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Nombre", length = 100)
    private String nombre;

    @Column(name = "Especialidad_ID")
    private int especialidadId;

    @Column(name = "Experiencia")
    private int experiencia;


    // Constructor, getters y setters
    public Doctor() {
    	
    }
	public Doctor(int id, String nombre, int especialidadId, int experiencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidadId = especialidadId;
		this.experiencia = experiencia;
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

	public int getEspecialidadId() {
		return especialidadId;
	}

	public void setEspecialidadId(int especialidadId) {
		this.especialidadId = especialidadId;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", nombre=" + nombre + ", especialidadId=" + especialidadId + ", experiencia="
				+ experiencia + "]";
	}
    
    
}

