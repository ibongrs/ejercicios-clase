package Gaia6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ikasgela {

	private ArrayList<Ikasleak> ikasleak = new ArrayList<Ikasleak>();

	public void ikasleDatuakKargatu(Ikasleak i) {
		ikasleak.add(i);
	}
	
	public String ikasleTxikiHandia() {
		String delvolver= "";
		//	Objetua	variable : Arraylist
		for (Ikasleak ikasleak2 : ikasleak) {
			if(ikasleak2.getAdina() >= 18) {
				delvolver += "El alumno: " + ikasleak2.getIkaslea() + " es mayor de edad, porq tiene: " + ikasleak2.getAdina();
			}else {
				delvolver += "El alumno: " + ikasleak2.getIkaslea() + " es es menor de edad, porq tiene: " + ikasleak2.getAdina();
			}
		}
		return delvolver;
	}
	
	public boolean permisoEntrada() {
		boolean devolver = true;
		
		for (Ikasleak ikasleak2 : ikasleak) {
			if(ikasleak2.getNacionalidad().equalsIgnoreCase("Marroqui")) {
				devolver = false;
				System.out.println("No puedes pasar: " + ikasleak2.getIkaslea() + " porq tiene Nacionalidad " + ikasleak2.getNacionalidad());
			}
		}
		return devolver;
	}
	public void ikasleakErakutsi() {
		for (Ikasleak ikasleak2 : ikasleak) {
			System.out.println(ikasleak2);
		}
	}
}
