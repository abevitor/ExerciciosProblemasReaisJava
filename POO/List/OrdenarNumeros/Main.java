package POO.List.OrdenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 5 números inteiros:");
        for(int i = 0; i < 5; i++){
            System.out.println("Número " + (i+1) + ":");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.println("\n Números digitados: " + numeros);

        List<Integer> crescente = new ArrayList<>(numeros);
        Collections.sort(crescente);
        System.out.println("Ordem crescente: " + crescente);

        List<Integer> decrescente = new ArrayList<>(numeros);
        Collections.sort(decrescente, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + decrescente);

        scanner.close();
    
    }
    
}
