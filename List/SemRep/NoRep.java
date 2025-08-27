package List.SemRep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoRep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        String nome = "";
        String numero = "";

        System.out.println("Deseja adicionar um número? (SIM/NAO)");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("sim")) {
            while (!escolha.equalsIgnoreCase("nao")) {
                System.out.println("Caso deseje sair, digite 'sair' no nome.");

                System.out.print("Digite o nome: ");
                nome = scanner.nextLine();
                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("Digite o número: ");
                numero = scanner.nextLine();

                agenda.put(nome, numero);

                System.out.println("Deseja adicionar mais um número? (SIM/NAO)");
                escolha = scanner.nextLine();
            }
        }

        System.out.println("\n==== Lista de Contatos ====");
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        scanner.close();
    }
}

