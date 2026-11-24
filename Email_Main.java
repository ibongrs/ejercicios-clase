package Gaia6;

import java.util.Scanner;

public class Email_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		String norentzat = null;
		String asuntua = null;
		String gorputza = null;

		String opzioa = null;
		boolean continuar = false;
		String opzioaE = null;

		do {
			String opcion = "";
			// creamos postontzia
			Email_Postontzia postontzia = new Email_Postontzia();

			// creamos un email1 predeterminado y lo duardamos en gehitu()
			Email newEmail1 = new Email("Muri@gmail.com", "tordo", "sdefv", false);
			postontzia.gehitu(newEmail1);
			// creamos un email1 predeterminado y lo duardamos en gehitu()
			Email newEmail2 = new Email("Ibongrs@gmail.com", "Hola", "si", true);
			postontzia.gehitu(newEmail2);

			System.out.println("Quieres escribir un Email?");
			opcion = teklatua.nextLine();

			if (opcion.equalsIgnoreCase("bai") || opcion.equalsIgnoreCase("b")) {

				System.out.println("IDATZI EMAIL BERRI BAT: ");

				System.out.println("Norentzat: ");
				norentzat = teklatua.nextLine();

				System.out.println("Asuntua: ");
				asuntua = teklatua.nextLine();

				System.out.println("Gorputza: ");
				gorputza = teklatua.nextLine();

				// creamos email y q se guarde
				Email newEmail = new Email(norentzat, asuntua, gorputza, false);
				postontzia.gehitu(newEmail);
			}
			System.out.println("===========================");
			System.out.println("        POSTONTZIA");
			System.out.println(postontzia.emailKopurua());
			System.out.println("===========================");

			System.out.println(postontzia.emailKopurua());

			System.out.println("Ikusi nahi dituzu irakurrita ez daudenak? ");
			opzioa = teklatua.nextLine();

			if (opzioa.equalsIgnoreCase("bai") || opzioa.equalsIgnoreCase("b")) {
				System.out.println("Daukazu irakurri gabe: ");
				System.out.println(postontzia.erakutsi());

			} else if (opzioa.equalsIgnoreCase(null) || opzioa.equalsIgnoreCase("ez") || opzioa.equalsIgnoreCase("e")) {

				System.out.println("Jarraitu nahi duzu idazten?");
				opzioa = teklatua.nextLine();
				if (opzioa.equalsIgnoreCase("bai") || opzioa.equalsIgnoreCase("b")) {
					continuar = true;
				} else if (opzioa.equalsIgnoreCase(null) || opzioa.equalsIgnoreCase("ez")
						|| opzioa.equalsIgnoreCase("e")) {
					continuar = false;
					System.out.println("Agur");
				}
			}

		} while (continuar == true);
	}

}