package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_EstruturaSequencial1 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor de x: ");
		int x = sc.nextInt();
		System.out.println();
		System.out.print("Entre com o valor de y: ");
		int y = sc.nextInt();
		
		double soma = x + y;
		System.out.println();
		System.out.printf("Soma: %.2f%n ", soma);
		
		
		sc.close();

	}

}
