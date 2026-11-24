package Gaia6;


public class Email {

	private String norentzat;
	private String asuntua;
	private String gorputza;
	private boolean irakurrita;
	
	public Email(String norentzat, String asuntua, String gorputza, boolean irakurrita){
		this.norentzat = norentzat;
		this.asuntua = asuntua;
		this.gorputza = gorputza;
		this.irakurrita = irakurrita;
	}
	public  void irakurriGabe() {
		if(this.irakurrita == false) {
			System.out.println("Irakurri gabe");
		}else {
			System.out.println("Irakurrita");
		}
	}
	
	public void txartoIpinita() {
		if(this.norentzat == null) {
			System.out.println("Te falta poner para quien es");
		}else if(this.asuntua == null) {
			System.out.println("No has puesto el Asunto");
		}else if(this.gorputza == null) {
			System.out.println("No es escrito el mensaje");
		}else {
			System.out.println("HAS ENVIADO CORRECTAMENTE EL MAIL" + toString());
			System.out.println(toString()); 
		}
	}
	
	
	public String getNorentzat() {
		return norentzat;
	}
	public void setNorentzat(String norentzat) {
		this.norentzat = norentzat;
	}
	public String getAsuntua() {
		return asuntua;
	}
	public void setAsuntua(String asuntua) {
		this.asuntua = asuntua;
	}
	public String getGorputza() {
		return gorputza;
	}
	public void setGorputza(String gorputza) {
		this.gorputza = gorputza;
	}
	public boolean isIrakurrita() {
		return irakurrita;
	}
	public void setIrakurrita(boolean irakurrita) {
		this.irakurrita = irakurrita;
	}
	@Override
	public String toString() {
		return "Email [norentzat=" + norentzat + ", asuntua=" + asuntua + ", gorputza=" + gorputza + ", irakurrita="
				+ irakurrita + "]";
	}
}

