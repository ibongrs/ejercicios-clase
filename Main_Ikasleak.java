package Gaia6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Ikasleak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		Scanner teklatua = new Scanner(System.in);
		String katea = "";
		String ikasleak = "";
		String abizena = "";
		int adina = 0;
		String dni = "";
		String nacionalidad = "";

		Ikasgela ikasgela = new Ikasgela();

		Ikasleak ikaslea1 = new Ikasleak("Ibon", "Garcia", 22, "79398735K", "Española");
		ikasgela.ikasleDatuakKargatu(ikaslea1);
		Ikasleak ikaslea2 = new Ikasleak();
		do {
			System.out.println("=================================");
			System.out.println("1. Ikasleen datuak kargatzea");
			System.out.println("2. Ikasleen datuak erakustea");
			System.out.println("3. Ikasle baten datuak erakustea");
			System.out.println("0. Amaiera");
			System.out.println("=================================");
			System.out.println("Menu de opciones, mete un numero:");
			katea = teklatua.nextLine();
			opcion= Integer.parseInt(katea);
			switch (opcion) {
			case 1: {
				System.out.println("Nombre: ");
				ikasleak = teklatua.nextLine();

				System.out.println("Apellido: ");
				abizena = teklatua.nextLine();

				System.out.println("Adina: ");
				katea = teklatua.nextLine();
				adina = Integer.parseInt(katea);

				System.out.println("DNI: ");
				dni = teklatua.nextLine();

				System.out.println("Nacionalidad: ");
				nacionalidad = teklatua.nextLine();

				Ikasleak newIkaslea = new Ikasleak(ikasleak, abizena, adina, dni, nacionalidad);
				System.out.println(newIkaslea.toString());

				ikasgela.ikasleDatuakKargatu(newIkaslea);
				break;
			}
			case 2: {
				ikasgela.ikasleakErakutsi();

				break;
			}
			case 3: {
				System.out.println(ikaslea1);
				break;
			}

			default:
				System.out.println("error, mete una opcion valida");
			}

		} while (opcion != 0);

	}
}
