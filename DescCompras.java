import java.util.ArrayList;
import java.util.Scanner;

public class DescCompras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================BEM VINDO=================");
        System.out.println("10% de DESCONTO para compras ACIMA DE 200R$");
        System.out.println(
        );
        System.out.println(" Oque desejaria comprar?");

        System.out.println();

        System.out.println("1-CAMISETAS");
        System.out.println("2-CALÇAS");
        System.out.println("3-BERMUDAS");
        System.out.println("4-TENIS");
        System.out.println("===========================================");

        System.out.println();
        var resposta = scanner.nextLine();

        ArrayList<String> camisetas = new ArrayList<String>();
        ArrayList<String> calcas = new ArrayList<String>();
        ArrayList<String> bermudas = new ArrayList<String>();
        ArrayList<String> tenis = new ArrayList<String>();


        camisetas.add("0- ADDCTION REVERSE 249R$");
        camisetas.add("1- PATINHO FEIO 200R$");
        camisetas.add("2- ROBO 230R$");

        bermudas.add("0- KEROSENE 359R$");
        bermudas.add("1- PHOENIX 400R$");
        bermudas.add("2- MARMORE 320R$");

        calcas.add("0- AEGEN 359R$");
        calcas.add("1- CARAMEL 340R$");
        calcas.add("2- STAIN 400R$");

        tenis.add("0- allstar 700R$");
        tenis.add("1- puma 350R$");
        tenis.add("2- adidas 500$");

        if(resposta.equalsIgnoreCase("camisetas")){
            System.out.println("Qual dessas camisetas você gostaria de comprar?");
            System.out.println(camisetas);
            var escolhaCamiseta = scanner.nextInt();

             if (escolhaCamiseta >= 0 && escolhaCamiseta < camisetas.size()) {
            System.out.println("Você escolheu: " + camisetas.get(escolhaCamiseta));

        } else {
            System.out.println("Opção inválida!");
        }


        }

        if(resposta.equalsIgnoreCase("calcas")){

            System.out.println("Qual dessas calças você gostaria de comprar?");
            System.out.println(calcas);
            var escolhaCalca = scanner.nextInt();

             if (escolhaCalca >= 0 && escolhaCalca < calcas.size()) {
            System.out.println("Você escolheu: " + calcas.get(escolhaCalca));
        } else {
            System.out.println("Opção inválida!");
        }
            
        }
        

        if(resposta.equalsIgnoreCase("bermudas")){

            System.out.println("Qual dessas bermudas você gostaria de comprar?");
            System.out.println(bermudas);
            var escolhaBermuda = scanner.nextInt();

             if (escolhaBermuda >= 0 && escolhaBermuda < bermudas.size()) {
            System.out.println("Você escolheu: " + bermudas.get(escolhaBermuda));
        } else {
            System.out.println("Opção inválida!");
        }
            
        }
        

        if(resposta.equalsIgnoreCase("tenis")){

             System.out.println("Qual desses tênis você gostaria de comprar?");
            System.out.println(tenis);
            var escolhaTenis= scanner.nextInt();

             if (escolhaTenis >= 0 && escolhaTenis < tenis.size()) {
            System.out.println("Você escolheu: " + tenis.get(escolhaTenis));
        } else {
            System.out.println("Opção inválida!");
        }
            
        }
        scanner.close();
        
    }
}