package ec.edu.ups.modeloReporte;

import java.util.Date;

public class generarDiarioCabecera {
	private int codigo;
	private Date fecha;
	private Date hora;
	@Override
	public String toString() {
		return "generarDiarioCabecera [codigo=" + codigo + "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	
}
