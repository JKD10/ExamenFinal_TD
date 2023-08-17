package gestionClinicaPrueba.pruebaTD.modelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Facturas")
public class Factura {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Monto", precision = 8, scale = 2)
    private BigDecimal monto;

    @Column(name = "Fecha_Pago")
    private Date fechaPago;


    // Constructor, getters y setters
    
    public Factura() {
    	
    }
    
	public Factura(int id, BigDecimal monto, Date fechaPago) {
		super();
		this.id = id;
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", monto=" + monto + ", fechaPago=" + fechaPago + "]";
	}
    
    
}


