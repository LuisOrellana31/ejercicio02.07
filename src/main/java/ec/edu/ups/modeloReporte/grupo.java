package ec.edu.ups.modeloReporte;

public class grupo {
	private int codigo;
	private String tipo;
	
	@Override
	public String toString() {
		return "cuenta [codigo=" + codigo + ", tipo=" + tipo + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
