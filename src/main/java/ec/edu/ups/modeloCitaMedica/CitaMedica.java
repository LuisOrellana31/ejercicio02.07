package ec.edu.ups.modeloCitaMedica;

public class CitaMedica {
	
	private int    cita_codigo;
    private String cita_fecha;
    private String cita_hora;
    private String cita_motivo;
    private Medico medico;
    private Paciente paciente;
    
    // Hola Rafael
    
    
	public CitaMedica(int cita_codigo, String cita_fecha, String cita_hora, String cita_motivo, Medico medico,
			Paciente paciente) {
		super();
		this.cita_codigo = cita_codigo;
		this.cita_fecha = cita_fecha;
		this.cita_hora = cita_hora;
		this.cita_motivo = cita_motivo;
		this.medico = medico;
		this.paciente = paciente;
	}


	public int getCita_codigo() {
		return cita_codigo;
	}


	public void setCita_codigo(int cita_codigo) {
		this.cita_codigo = cita_codigo;
	}


	public String getCita_fecha() {
		return cita_fecha;
	}


	public void setCita_fecha(String cita_fecha) {
		this.cita_fecha = cita_fecha;
	}


	public String getCita_hora() {
		return cita_hora;
	}


	public void setCita_hora(String cita_hora) {
		this.cita_hora = cita_hora;
	}


	public String getCita_motivo() {
		return cita_motivo;
	}


	public void setCita_motivo(String cita_motivo) {
		this.cita_motivo = cita_motivo;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
    
    
}



