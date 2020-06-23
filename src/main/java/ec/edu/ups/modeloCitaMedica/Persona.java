package ec.edu.ups.modeloCitaMedica;

public abstract class Persona {
	
	private int       codigo;
	private String    cedula;
	private String    nombre;
	private String    apellido;
	private String    direccion;
	private int       telefono;
	private String    correo;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	
	}

	public Persona(int codigo, String cedula, String nombre, String apellido, String direccion, int telefono,
			String correo) {
		super();
		this.codigo = codigo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	protected abstract char[] mostrarDatos(Persona persona1);
	
}// Fin de la Clase.
	