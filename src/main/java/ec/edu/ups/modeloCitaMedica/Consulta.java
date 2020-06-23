package ec.edu.ups.modeloCitaMedica;

public class Consulta {
private int codigo;
private String fecha;



public Consulta(int codigo, String fecha) {
	super();
	this.codigo = codigo;
	this.fecha = fecha;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}



}
