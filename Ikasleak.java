package Gaia6;


public class Ikasleak {

	private String ikaslea;
	private String abizena;
	private int adina;
	private String dni;
	private String nacionalidad;
	
	
	public Ikasleak() {
		super();
	}

	public Ikasleak(String ikaslea, String abizena, int adina, String dni, String nacionalidad) {
		super();
		this.ikaslea = ikaslea;
		this.abizena = abizena;
		this.adina = adina;
		this.dni = dni;
		this.nacionalidad = nacionalidad;
	}

	public String getIkaslea() {
		return ikaslea;
	}

	public void setIkaslea(String ikaslea) {
		this.ikaslea = ikaslea;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Ikasleak [ikaslea=" + ikaslea + ", abizena=" + abizena + ", adina=" + adina + ", dni=" + dni
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	
}