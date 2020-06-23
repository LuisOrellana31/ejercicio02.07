package ec.edu.ups.ControladorCitaMedica;

import ec.edu.ups.modeloCitaMedica.Diagnostico;

public class ControladorDiagnostico {

	public String mostrardiagnostico(Diagnostico diagnostico) {
		String datos="los datos son: /n";
		
		datos=diagnostico.getCodigo()+"/n";
		datos=diagnostico.getDescripcion()+"/n";
		datos=diagnostico.getOrden()+"/n";
		
		return datos;
		
	}
}
