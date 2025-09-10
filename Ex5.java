package exerciciosCondicionais;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cod;
		int qnt;
		double total;
		
		cod = sc.nextInt();
		qnt = sc.nextInt();
		
		if (cod == 1) {
			total = qnt * 4.00;
			System.out.printf("TOTAL: R$ %.2f", total);
		}
		
		else if (cod == 2) {
			total = qnt * 4.50;
			System.out.printf("TOTAL: R$ %.2f", total);	
		}
		
		else if (cod == 3) {
			total = qnt * 5.00;
			System.out.printf("TOTAL: R$ %.2f", total);	
		}
		
		else if (cod == 4) {
			total = qnt * 2.00;
			System.out.printf("TOTAL: R$ %.2f", total);	
		}
		
		else if (cod == 5) {
			total = qnt * 1.50;
			System.out.printf("TOTAL: R$ %.2f", total);	
		}
		
		
		sc.close();
	}

}
