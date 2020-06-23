package ec.edu.ups.modeloReporte;

public class TipoOrden {
	
	private String codigo;
	private String descripcion;
	

	public TipoOrden(String codigo, String descripcion) {
	super();
	this.codigo = codigo;
	this.descripcion = descripcion;
}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String string) {
		this.codigo = string;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
	

}
