package ec.edu.ups.modeloReporte;

import ec.edu.ups.modeloCitaMedica.Medico;

public class Especialidad {
	
	private int    codigo_esp;
	private String descripcion_esp;
	private Medico medico;
	public Especialidad(int codigo_esp, String descripcion_esp, Medico medico) {
		super();
		this.codigo_esp = codigo_esp;
		this.descripcion_esp = descripcion_esp;
		this.medico = medico;
	}
	public int getCodigo_esp() {
		return codigo_esp;
	}
	public void setCodigo_esp(int codigo_esp) {
		this.codigo_esp = codigo_esp;
	}
	public String getDescripcion_esp() {
		return descripcion_esp;
	}
	public void setDescripcion_esp(String descripcion_esp) {
		this.descripcion_esp = descripcion_esp;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}



