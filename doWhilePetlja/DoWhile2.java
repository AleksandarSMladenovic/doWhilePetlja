package doWhilePetlja;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		/* DoWhile2: Napisati program koji ce korisniku ispisati poruku da li je ceo pozitivan broj koji je uneo palindrom ili nije palindrom. 
		(palindromi -> isto mu dodje citali sleva nadesno ili s desne na levu stranu).*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ceo pozitivan broj: ");
		int unos = sc.nextInt();
		int unazad = 0;
		int cifra = 0;
		int privremeniUnos = unos;
		
		while(privremeniUnos != 0) {
			cifra = privremeniUnos % 10;
			privremeniUnos = privremeniUnos / 10;
			unazad = unazad * 10 + cifra;
		}
		if(unazad == unos) {
			System.out.println("Uneti broj je palindrom.");
		}else {
			System.out.println("Nije palindrom.");
		}
	}
}