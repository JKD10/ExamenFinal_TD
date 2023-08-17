package gestionClinicaPrueba.pruebaTD.modelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "Especialidades")
public class Especialidad {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Nombre", length = 100)
    private String nombre;

    
    // Constructor, getters y setters

    public Especialidad() {
    	
    }
    
	public Especialidad(int id, String nombre) {
		super();
		this.id = id;
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
		return "Especialidad [id=" + id + ", nombre=" + nombre + "]";
	}
    
    
}

