package es.deusto.ingenieria.progii.cine;

public class FechaYHora {

	private int dia=0;
	private int mes=0;
	private int año=0;

	private int horas=0;
	private int minutos=0;
	private int segundos=0;

	public FechaYHora(int dia, int mes, int año, int horas, int minutos, int segundos) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 & dia <= 31) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 0 & mes <= 12) {
			this.mes = mes;
		}
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		if (año > 1900 & año < 2400) {
			this.año = año;
		}
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas > 0 & horas <= 24)
			this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos >= 0  & minutos < 60)
			this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}





}
