package ec.edu.ups.ControladorCitaMedica;

import java.awt.List;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ec.edu.ups.modeloReporte.TipoOrden;

public class ControladorTipo {
 
	public String mostrardiagnostico(TipoOrden orden) {
		String datos="los datos son: /n";
		
		datos=orden.getCodigo()+"/n";
		datos=orden.getDescripcion()+"/n";
		
		return datos;
		
	}


}

