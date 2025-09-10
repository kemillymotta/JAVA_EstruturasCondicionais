package exerciciosCondicionais;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaI, horaF;
		int duracao;
		
		horaI = sc.nextInt();
		horaF = sc.nextInt();

		if (horaI < horaF) {
			duracao = horaF - horaI;
		}
		else {
			duracao = 24 - horaI + horaF;
		}
			
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
			
			
		sc.close();
	}

}
