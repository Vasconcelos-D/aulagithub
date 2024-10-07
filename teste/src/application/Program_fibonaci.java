package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_fibonaci {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int number = scanner.nextInt();

	        // Verificando se o número pertence à sequência de Fibonacci
	        if (belongsToFibonacci(number)) {
	            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
	        }

	        scanner.close();
		// TODO Auto-generated method stub

	}
	
	 // Método para gerar a sequência de Fibonacci até um determinado número
    public static ArrayList<Integer> fibonacciUntil(int n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);

        while (true) {
            int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            if (nextFib > n) {
                break;
            }
            fibSequence.add(nextFib);
        }

        return fibSequence;
    }

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean belongsToFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        ArrayList<Integer> fibSequence = fibonacciUntil(n);
        return fibSequence.contains(n);
    }

}
