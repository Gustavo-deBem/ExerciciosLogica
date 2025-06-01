package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	   double a;
	   double b;
	   double c;
	   
	   System.out.println("Informe o valor do coeficiente A: ");
	   a = sc.nextDouble();
	   System.out.println("Informe o valor do coeficiente B: ");
	   b = sc.nextDouble();
	   System.out.println("Informe o valor do coeficiente C: ");
	   c = sc.nextDouble();
	   
	   System.out.println(calcular(a,b,c));
	   
	   

	}
	static String calcular(double a,double b,double c) {
		double delta = Math.pow(b, 2) -4 *a*c;
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		
			return "Resultado da conta: \n"+
			"X1: "+x1+"\n"+
			"X2: "+x2;
		}else if(delta == 0) {
			double Resultado = -b/(2*a);
			return"Resultado da conta: "+Resultado;
	
			
		}
		return "delta deu negativo";
		
	}

}

