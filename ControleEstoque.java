import java.util.ArrayList;
import java.util.Scanner;
public class ControleEstoque {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();

        System.out.println("Você deseja adcionar um produto?(sim/nao)");
        String resposta = scanner.nextLine();

        while(resposta.equalsIgnoreCase("sim")){

            System.out.println("Nome do produto:");
            String item = scanner.nextLine();
            produtos.add(item);

            System.out.println("Produto adcionado com exito! Deseja adcionar mais?");
            resposta = scanner.nextLine();
        }

        System.out.println("Deseja ver os produtos cadastrados? (sim/nao)");
        String verCadastrados = scanner.nextLine();

        if(verCadastrados.equalsIgnoreCase("sim")){
            for(int i = 0; i< produtos.size(); i++){
                System.out.println((i+1) + " - " + produtos.get(i));
            }
                 return;
        }

        if(verCadastrados.equalsIgnoreCase("nao")){
            System.out.println("Caso deseje adcionar ou ver a lista de produtos, recarregue o código:");

            return;
        }
        
    

    
    
    }
    
}
