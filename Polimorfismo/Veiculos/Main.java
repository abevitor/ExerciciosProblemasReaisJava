package Polimorfismo.Veiculos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Veiculos carro = new Carro();
        Veiculos moto = new Moto();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja ligar o: ");
        System.out.println("1- Carro");
        System.out.println("2- Moto");
    
        
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
             System.out.println("Deseja ligar a moto?  TRUE / FALSE");
            boolean escolhaMoto = scanner.nextBoolean();

            if(escolhaMoto == true){
                moto.ligar();
                moto.acelerar();
                moto.emitirSom();

            }
                break;
            
            default:
                break;
        }

        
        
    }
    
}
