package Familia44;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int totalDia,dia,mes,ano;
      
      Scanner leia= new Scanner(System.in); // apelidar o Scunner e dar a fun��o
      
      System.out.println("Quantos dias voc� tem de vida? ");
      totalDia = leia.nextInt();
    		  
    	ano= totalDia /365;
    	mes = (totalDia % 365) / 30;
		dia = (totalDia % 365) % 30;
		
		System.out.println("Voc� tem " +ano+" anos," +mes+" meses e " +dia+" dias de vida!!!");
	}

}
