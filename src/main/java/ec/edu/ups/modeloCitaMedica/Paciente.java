package ec.edu.ups.modeloCitaMedica;

public class Paciente {
	//Atributos de la Clase
	private  int codigo_pac;
	private String direccion_pac;
	private String procedencia_pac;
	private Persona paciente;
	
	//Constructores Paciente
	public Paciente(int codigo_pac, String direccion_pac, String procedencia_pac, Persona paciente) {
		super();
		this.codigo_pac = codigo_pac;
		this.direccion_pac = direccion_pac;
		this.procedencia_pac = procedencia_pac;
		this.paciente = paciente;
	}
	public int getCodigo_pac() {
		return codigo_pac;
	}
	public void setCodigo_pac(int codigo_pac) {
		this.codigo_pac = codigo_pac;
	}
	public String getDireccion_pac() {
		return direccion_pac;
	}
	public void setDireccion_pac(String direccion_pac) {
		this.direccion_pac = direccion_pac;
	}
	public String getProcedencia_pac() {
		return procedencia_pac;
	}
	public void setProcedencia_pac(String procedencia_pac) {
		this.procedencia_pac = procedencia_pac;
	}
	public Persona getPaciente() {
		return paciente;
	}
	public void setPaciente(Persona paciente) {
		this.paciente = paciente;
	}// Fin Constructores


}// Fin de la Clae
