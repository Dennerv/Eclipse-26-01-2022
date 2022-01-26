package Familia44;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia,mes,ano,totalDia;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Escreva quantos anos: ");
			ano= leia.nextInt();
			System.out.println("Escreva quantos meses: ");
			mes= leia.nextInt();
			System.out.println("Escreva quantos dias: ");
			dia= leia.nextInt();
		}
		
		ano= ano * 365; //convertendo para dias 
		mes = mes * 30;  // convertendo meses em dias 
		
		totalDia = ano+mes+dia;
		
		System.out.println("O total de dias é: "+totalDia);
				
		
		
		
	}

}
