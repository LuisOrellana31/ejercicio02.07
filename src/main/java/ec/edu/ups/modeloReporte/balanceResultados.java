package ec.edu.ups.modeloReporte;

import java.util.Date;

public class balanceResultados {
	private int codigo;
	private Date fecha;
	private double ventas;
	private double utilidadBruta;
	private double gastoOperacion;
	private double otrosProd;
	private double otrosGastos;
	private double utilidadNeta;
	
	@Override
	public String toString() {
		return "balanceResultados [codigo=" + codigo + ", fecha=" + fecha + ", ventas=" + ventas + ", utilidadBruta="
				+ utilidadBruta + ", gastoOperacion=" + gastoOperacion + ", otrosProd=" + otrosProd + ", otrosGastos="
				+ otrosGastos + ", utilidadNeta=" + utilidadNeta + "]";
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

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getUtilidadBruta() {
		return utilidadBruta;
	}

	public void setUtilidadBruta(double utilidadBruta) {
		this.utilidadBruta = utilidadBruta;
	}

	public double getGastoOperacion() {
		return gastoOperacion;
	}

	public void setGastoOperacion(double gastoOperacion) {
		this.gastoOperacion = gastoOperacion;
	}

	public double getOtrosProd() {
		return otrosProd;
	}

	public void setOtrosProd(double otrosProd) {
		this.otrosProd = otrosProd;
	}

	public double getOtrosGastos() {
		return otrosGastos;
	}

	public void setOtrosGastos(double otrosGastos) {
		this.otrosGastos = otrosGastos;
	}

	public double getUtilidadNeta() {
		return utilidadNeta;
	}

	public void setUtilidadNeta(double utilidadNeta) {
		this.utilidadNeta = utilidadNeta;
	}

}
