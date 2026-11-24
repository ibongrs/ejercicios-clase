package Gaia6;

import java.util.ArrayList;

public class Email_Postontzia {

	//private Email email;
	private ArrayList<Email> listaemail = new ArrayList<Email>();

	public Email_Postontzia() {
	
	}
	
	public int emailKopurua() {
		
		if(this.listaemail.isEmpty()) {
			System.out.println("No tienes emails");
		}else {
			System.out.println("Tienes Emails: ");
		}
		return this.listaemail.size();
	}
	
	public  void irakurriGabe(Email e) {
		
		if(e.isIrakurrita() == false) {
			System.out.println("Irakurri gabe");
		}else {
			System.out.println("Irakurrita");
		}	
	}
	
	public int irakurriGabeKont() {
		int kont = 0;
		for (Email email : listaemail) {
			if (email.isIrakurrita() == false) {
				kont++;
			}	
		}
		return kont;
	}
	public void gehitu(Email e) {
		this.listaemail.add(e);
	}
	
	public String erakutsi() {// le he quitado el int K, porq no me rentaba
		ArrayList<Email> mensaje = new ArrayList<Email>();
		for (Email email : listaemail) {
			
			if (email != null && !email.isIrakurrita()) {
				mensaje.add(email); //recorro el array para guardarme la informacion en el array2
			}
		}
		String asuntua = "";
		for (Email email : mensaje) { // con otro array lo printo en la pantallaa
			asuntua += "Asuntua: " + email.getAsuntua() + "\n";
		}
		return asuntua;
		
	}
	
}