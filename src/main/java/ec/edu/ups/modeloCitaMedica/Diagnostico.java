package ec.edu.ups.modeloCitaMedica;

import ec.edu.ups.modeloReporte.TipoOrden;

public class Diagnostico {

	private int codigo;
	private String descripcion;
	private TipoOrden orden;
	
	
	@Override
	public String toString() {
		return "Diagnostico [codigo=" + codigo + ", descripcion=" + descripcion + ", orden=" + orden + "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public TipoOrden getOrden() {
		return orden;
	}
	public void setOrden(TipoOrden orden) {
		this.orden = orden;
	}
	
	
	
}
