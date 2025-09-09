package Polimorfismo.Veiculos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Veiculos carro = new Carro();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja ligar o: ");
        System.out.println("1- Carro");
        System.out.println("2- Moto");
        System.out.println("3- Caminhão");
        
       int escolhaNum = scanner.nextInt();

        switch (escolhaNum) {
            case 1:

            System.out.println("Deseja ligar o carro?  TRUE / FALSE");
            boolean escolha = scanner.nextBoolean();

            if(escolha == true){
            carro.ligar();
            carro.acelerar();
            carro.emitirSom();

            }
                
                break;

            case 2:
                break;
            
            case 3:
                break;

            
        
            default:
                break;
        }

        
        
    }
    
}
