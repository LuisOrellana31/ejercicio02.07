package ec.edu.ups.ControladorCitaMedica;

import ec.edu.ups.modeloCitaMedica.Consulta;

public class ControladorConsulta {

	public String mostratconsulta(Consulta consulta) {
		String datos="los datos son: /n";
		datos+=consulta.getCodigo()+ "\n";
		datos+=consulta.getFecha()+ "\n";
		
		return datos;
	}
	
	
}
