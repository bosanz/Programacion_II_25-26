package es.deusto.ingenieria.progii.etxeradeusto.model;

public class Transaccion {
	
	private String dniUsuario;
	private int idVivienda;
	public Transaccion(String dniUsuario, int idVivienda) {
		super();
		this.dniUsuario = dniUsuario;
		this.idVivienda = idVivienda;
	}
	public String getDniUsuario() {
		return dniUsuario;
	}
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public int getIdVivienda() {
		return idVivienda;
	}
	public void setIdVivienda(int idVivienda) {
		this.idVivienda = idVivienda;
	}
	
	
	
	

}
