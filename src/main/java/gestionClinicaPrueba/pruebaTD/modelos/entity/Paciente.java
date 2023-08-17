package gestionClinicaPrueba.pruebaTD.modelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Pacientes")
public class Paciente {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Nombre", length = 100)
    private String nombre;

    @Column(name = "Fecha_Nacimiento")
    private Date fechaNacimiento;

    // Constructor, getters y setters

    public Paciente() {
    	
    }
    
	public Paciente(int id, String nombre, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
    
    
}

