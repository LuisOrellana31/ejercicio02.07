package ec.edu.ups.modeloReporte;

public class generarDiarioDetalle {
	private int codigo;
	private String descripcion;
	private double debe;
	private double haber;
	@Override
	public String toString() {
		return "generarDiarioDetalle [codigo=" + codigo + ", descripcion=" + descripcion + ", debe=" + debe + ", haber="
				+ haber + "]";
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
	public double getDebe() {
		return debe;
	}
	public void setDebe(double debe) {
		this.debe = debe;
	}
	public double getHaber() {
		return haber;
	}
	public void setHaber(double haber) {
		this.haber = haber;
	}
	
}
