package exerciciosCondicionais;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}

		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	}

}
