package Polimorfismo.Veiculos;
import java.util.Scanner;

public class Moto extends Veiculos {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void emitirSom(){
        System.out.println("Brr Brr");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando a moto!");
       
    }

    @Override
    public void acelerar() {
        System.out.println("Deseja acelerar? SIM/NÃO");
        String escolha = scanner.nextLine();
        
        if(escolha.equalsIgnoreCase("Sim")){
            boolean continuar = true;

            System.out.println("Acelerando:");

            System.out.println("======================");

            System.out.println("Deseja acelerar mais?");


            while (continuar) {

                 int incremento = 1 + (int) (Math.random() * 30); 
                 setVelocidade(getVelocidade() + incremento);
                System.out.println("Acelerando...." + getVelocidade());

                System.out.println("======================");

                 System.out.println("Deseja acelerar mais? SIM/NÃO");
                 String escolhaAcelerar = scanner.nextLine();

             if (!escolhaAcelerar.equalsIgnoreCase("sim")) {
                continuar = false;
                }

            }

        }

          System.out.println("Carro parou de acelerar. Velocidade final: " + getVelocidade() + " km/h");

        if(escolha.equalsIgnoreCase("Não")){
            System.out.println("O carro não esta acelerando.");
        }
        
    }
    
}
