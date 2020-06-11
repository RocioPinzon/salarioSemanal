/*
 * Hacer un programa que calcule e imprima el salario semanal de un empleado
 * a partir de sus horas semanales trabajadas y de su salario por horas.
 * */

package salarioSemanal;

import java.util.Scanner;

public class salarioSemanal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int horasSemanales;
		float salarioHora, salarioTotal;
		
		System.out.println("Digite las horas semanales trabajadas");
		horasSemanales = entrada.nextInt();
		
		System.out.println("Digite el salario que gana por hora ");
		salarioHora = entrada.nextFloat();
		
		salarioTotal = horasSemanales*salarioHora;
		System.out.println("\nEl salario semanal es: " + salarioTotal + " euros");
		
	}

}
