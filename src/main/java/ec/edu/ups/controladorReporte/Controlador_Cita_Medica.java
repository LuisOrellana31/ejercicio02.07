package ec.edu.ups.controladorReporte;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.modeloCitaMedica.CitaMedica;
	
	
 public class Controlador_Cita_Medica {

	 private List<CitaMedica> citaMedicaList;

	  public Controlador_Cita_Medica() {
		
	        citaMedicaList = new ArrayList<>();
	    }
	    
	    public void crear(CitaMedica citaMedica){
	    citaMedicaList.add(citaMedica);
	    }
	    
	    public CitaMedica buscar(int codigo){
	    for (CitaMedica citaMedica: citaMedicaList){
	        if(citaMedica.getCita_codigo()==codigo){
	            return citaMedica;
	        }
	    }
	    return null;
	    }
	    
	     public boolean eliminar(int codigo) {
	        CitaMedica citaMedica = buscar(codigo);
	        if (citaMedica!= null) {
	            return citaMedicaList.remove(citaMedica);
	        }
	        return false;
	    }

	    public List<CitaMedica> getCitaMedicaList() {
	        return citaMedicaList;
	    }

	    
	}
	

