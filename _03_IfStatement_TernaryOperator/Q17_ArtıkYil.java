package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17_Art�kYil {

	public static void main(String[] args) {
		// artik yil sorusu

		Scanner scan = new Scanner(System.in);
		System.out.print("L羹tfen bir y覺l giriniz : ");
		int year = scan.nextInt();
		System.out.println ("   ***   if c繹zumu   ***   ");
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("Girdi��iniz"+year + " y覺l覺 ARTIK YIL");
		} else if (year % 100 != 0 && year % 4 == 0) {
			System.out.println("Girdi��iniz"+year + " y覺l覺 ARTIK YIL");
		} else {
			System.out.println("Girdi��iniz"+year + " y覺l覺 ARTIK YIL de��ildir.");
		}

		//  ternary cozumu ...
		System.out.println ("   ***   ternary c繹zumu   ***   ");

		String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
				: year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
		System.out.println(result);
		

		scan.close();

	}

}
