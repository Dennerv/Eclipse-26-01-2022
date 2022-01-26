package Familia44;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1,x2=0,y1 = 0,y2=0,dist;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valor de x2: ");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valor de y1: ");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valor de y2: ");
		x1 = leia.nextDouble();
		
		dist= Math.sqrt((Math.pow((x2 -x1),2))+(Math.pow((y2-y1),2)));
		
		System.out.println("Distancia entre dois pontos: "+dist);
		

}
	
}
