package List.RemoverItensLista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> items = new ArrayList<>();

        String item = "";

        // preenchendo a lista
        while(!item.equalsIgnoreCase("sair")){
            System.out.println("Adicione o item desejado (ou digite 'sair' para parar): ");
            item = scanner.nextLine();
            if(!item.equalsIgnoreCase("sair")){ // não adiciona o "sair"
                items.add(item);
            }
        }

        System.out.println("Sua lista de itens: " + items);
        System.out.println("========================");
        System.out.println("Deseja remover algum item? (SIM/NAO)");
        String escolha = scanner.nextLine();
        
        if(escolha.equalsIgnoreCase("sim")){ // aqui sim entra no processo de remoção
            String item2 = "";
            while(true) {
                System.out.println("Qual item deseja remover? (ou digite 'sair' para parar)");
                item2 = scanner.nextLine();
                
                if(item2.equalsIgnoreCase("sair")){
                    break; // sai do loop de remoção
                }

                if(items.remove(item2)){ 
                    System.out.println("Item removido: " + item2);
                } else {
                    System.out.println("Item não encontrado na lista!");
                }

                System.out.println("Lista atualizada: " + items);
            }
            System.out.println("Sua nova lista: " + items);
        } else {
            System.out.println("Sua lista continua sendo: " + items);
        }

        scanner.close();
    }
}
