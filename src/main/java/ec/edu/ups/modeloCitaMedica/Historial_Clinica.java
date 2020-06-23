package ec.edu.ups.modeloCitaMedica;

public class Historial_Clinica {
	
	//Atributos de la clase
private int codigo_historial;
private String descripcion;
private String tipo;
private Paciente paciente;

public Historial_Clinica(int codigo_historial, String descripcion, String tipo, Paciente paciente) {
	super();
	this.codigo_historial = codigo_historial;
	this.descripcion = descripcion;
	this.tipo = tipo;
	this.paciente = paciente;
}
public int getCodigo_historial() {
	return codigo_historial;
}
public void setCodigo_historial(int codigo_historial) {
	this.codigo_historial = codigo_historial;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Paciente getPaciente() {
	return paciente;
}
public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
}

}
