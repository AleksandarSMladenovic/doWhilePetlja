package doWhilePetlja;

import java.util.Scanner;

public class DoWhile1Perica {

	public static void main(String[] args) {

		/*
		 * DoWhile1: Napisati program koji ce omoguciti Peri da unese sa koliko novca
		 * raspolaze. On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu
		 * toliko novca treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim
		 * poklonima. Pera treba da unosi pojedinacne cene poklona, a program treba da
		 * ga obavesti kada potrosi sav predvidjeni novac, to jest kada za sledeci
		 * poklon vise nema kinte.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko para ima Pera: ");
		int unosNovca = sc.nextInt();
		int brojac = 0;
		
		if (unosNovca < 89) {
			System.out.println("Nemas para ni za povratak kuci busom!");
		} else {
			int ostatak = unosNovca;

			do {
				System.out.println("Unesi koliko si potrosio novca: ");
				int kupovina = sc.nextInt();
				int dozvoljenaKupovina = ostatak - kupovina;

				if (dozvoljenaKupovina > 89) {
					System.out.println("Smes da potrosis jos " + (ostatak - kupovina - 89));
					ostatak = ostatak - kupovina;
					brojac++;
				} else if (dozvoljenaKupovina == 89) {
					System.out.println("Potrosio si sav novac!");
					brojac++;
					break;
				} else {
					System.out.println("Nemas dovoljno para za ovu kupovinu!");
					break;
				}
			} while (ostatak >= 89);
			System.out.println("Kupio si " + brojac + " poklona, dekintiran si, hvataj bus...");
		}
	}
}
