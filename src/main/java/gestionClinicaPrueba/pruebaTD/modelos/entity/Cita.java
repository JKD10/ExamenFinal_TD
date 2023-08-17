package gestionClinicaPrueba.pruebaTD.modelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Citas")
public class Cita {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Paciente_ID")
    private int pacienteId;

    @Column(name = "Doctor_ID")
    private int doctorId;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Factura_ID")
    private int facturaId;

    
    // Constructor, getters y setters
    
    public Cita() {
    	
    }
    
	public Cita(int id, int pacienteId, int doctorId, Date fecha, int facturaId) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.doctorId = doctorId;
		this.fecha = fecha;
		this.facturaId = facturaId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", pacienteId=" + pacienteId + ", doctorId=" + doctorId + ", fecha=" + fecha
				+ ", facturaId=" + facturaId + "]";
	}
    
    
}

