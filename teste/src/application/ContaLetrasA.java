package application;

import java.util.Scanner;

public class ContaLetrasA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada da string pelo usuário
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Contando a letra 'a' e 'A'
        int count = contarLetrasA(input);
        
        // Verificando se a letra 'a' existe e quantas vezes
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
        
        scanner.close();
    }

    // Método para contar 'a' e 'A'
    public static int contarLetrasA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
