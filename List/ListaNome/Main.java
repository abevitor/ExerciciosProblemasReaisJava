package List.ListaNome;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        String nome = "";

        while(!nome.equalsIgnoreCase("sair")){
            System.out.println("Digite um nome. Caso deseje sair digite 'sair'");
            nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.println("Nomes digitados:" + nomes);
        System.out.println("========================");

        List<String> nomesCrescente = new ArrayList<>(nomes);
        Collections.sort(nomesCrescente);
        System.out.println("Nomes em ordem alfabetica: " + nomesCrescente);
         
        List<String> nomesDecrescente = new ArrayList<>(nomes);
        Collections.sort(nomesDecrescente, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente: " + nomesDecrescente);

        scanner.close();
        
    }
    
}
