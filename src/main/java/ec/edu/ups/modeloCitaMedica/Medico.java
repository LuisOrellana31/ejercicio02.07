package ec.edu.ups.modeloCitaMedica;

import java.util.List;

public class Medico {

    public static boolean remove(List<Medico> medicosList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	private int     codigo_med;
	public  int     consulturionum_med;
	private String  usuario_med;
	private String  contrasena;
	
	public Medico(int codigo_med, int consulturionum_med, String usuario_med, String contrasena) {
		super();
		this.codigo_med = codigo_med;
		this.consulturionum_med = consulturionum_med;
		this.usuario_med = usuario_med;
		this.contrasena = contrasena;
	}
	
	public int getCodigo_med() {
		return codigo_med;
	}
	public void setCodigo_med(int codigo_med) {
		this.codigo_med = codigo_med;
	}
	public int getConsulturionum_med() {
		return consulturionum_med;
	}
	public void setConsulturionum_med(int consulturionum_med) {
		this.consulturionum_med = consulturionum_med;
	}
	public String getUsuario_med() {
		return usuario_med;
	}
	public void setUsuario_med(String usuario_med) {
		this.usuario_med = usuario_med;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEspecialidad() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public String toString() {
        return "Medico{" + "codigo_med=" + codigo_med + ", consulturionum_med=" + consulturionum_med + ", usuario_med=" + usuario_med + ", contrasena=" + contrasena + '}';
    }
        
        
	
}
