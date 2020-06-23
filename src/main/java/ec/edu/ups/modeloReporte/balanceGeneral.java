package ec.edu.ups.modeloReporte;

import java.util.Date;

public class balanceGeneral {
	private int codigo;
	private Date fecha;
	private double caja;
	private double banco;
	private double mercacia;
	private double deudoresDiversos;
	
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
	public double getCaja() {
		return caja;
	}
	public void setCaja(double caja) {
		this.caja = caja;
	}
	public double getBanco() {
		return banco;
	}
	public void setBanco(double banco) {
		this.banco = banco;
	}
	public double getMercacia() {
		return mercacia;
	}
	public void setMercacia(double mercacia) {
		this.mercacia = mercacia;
	}
	public double getDeudoresDiversos() {
		return deudoresDiversos;
	}
	public void setDeudoresDiversos(double deudoresDiversos) {
		this.deudoresDiversos = deudoresDiversos;
	}
	@Override
	public String toString() {
		return "balanceGeneral [codigo=" + codigo + ", fecha=" + fecha + ", caja=" + caja + ", banco=" + banco
				+ ", mercacia=" + mercacia + ", deudoresDiversos=" + deudoresDiversos + "]";
	}
	
}
