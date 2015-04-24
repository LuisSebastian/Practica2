package asd;

import java.util.LinkedList;
import java.util.Scanner;

public class Cualquiera2 {
	
	public static void main(String[] args){
		int x=0;
		LinkedList cola = new LinkedList();
		LinkedList cola1 = new LinkedList();
		LinkedList cola2 = new LinkedList();
		LinkedList cola3 = new LinkedList();
		LinkedList cola4 = new LinkedList();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese 5 números para la cola");
		x = s.nextInt();
		cola.offer(x);
		x = s.nextInt();
		cola1.offer(x);
		x = s.nextInt();
		cola2.offer(x);
		x = s.nextInt();
		cola3.offer(x);
		x = s.nextInt();
		cola4.offer(x);
		
		cola4.offer(cola3.poll());
		cola4.offer(cola2.poll());
		cola4.offer(cola1.poll());
		cola4.offer(cola.poll());
		System.out.println("Pila hecha con colas");
		System.out.println("(El primero que entra es el ultimo que sale)");		
		while(cola4.peek()!=null){
			System.out.println(cola4.poll());
		}
}
}
