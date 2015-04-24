package asd;

import java.util.Scanner;
import java.util.Stack;

public class Cualquiera {
	
	public static void main(String[] args) {
		
		Stack pila = new Stack ();
		Stack pila2 = new Stack();
		
		int variable = 0;
		
		System.out.println("A continuación se le presenta un programa que convierte una pila a una cola con métodos de una pila");
		System.out.println("Ingrese los números para llenar la pila");
		System.out.println("Ingrese cero para terminar de ingresar valores");
		Scanner teclado = new Scanner(System.in);
		do{
			variable = teclado.nextInt();
			
			if(variable!=0)
				pila.push(variable);
			else{}
			}while(variable!=0);
		System.out.println("Pila Normal");
		System.out.println("En una pila normal los valores salen de esta manera");
		System.out.println(pila);
		System.out.println();
		System.out.println();
		do{
		pila2.push(pila.pop());
		}while((pila.isEmpty()==false));
		System.out.println("Cola con métodos de Pila");
		System.out.println("Se puede observar que es una cola, pero esta hecha con métodos de una pila");
		System.out.println(pila2);
}
}
