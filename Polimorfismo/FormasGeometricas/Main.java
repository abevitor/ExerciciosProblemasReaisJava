package Polimorfismo.FormasGeometricas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1- Circulo");
        System.out.println("2- Quadrado");
        System.out.println("3- Triangulo");
        System.out.println("4- Todos");

        System.out.println("=========================");

        System.out.println("Digite o numero do escolhido");
        int escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.println("Digite o raio do circulo:");
            double raio = scanner.nextDouble();
            Formas circulo = new Circulo(raio);
            System.out.println("Área do círculo: " + circulo.calcular());
        }

        if(escolha == 2){
            System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble();
            Formas quadrado = new Quadrado(lado);
            System.out.println("Área do quadrado: " + quadrado.calcular());
          
        }

        if(escolha == 3){
            System.out.println("Digite o lado do triangulo:");
            double ladoT = scanner.nextDouble();
            System.out.println("Digite a altura do triangulo:");
            double altura = scanner.nextDouble();
            Formas triangulo = new Triangulo(altura, ladoT);
            System.out.println("Área do círculo: " + triangulo.calcular());
            
        }
    

        if(escolha == 4){
             System.out.println("Digite o raio do circulo:");
            double raio = scanner.nextDouble();
            Formas circulo = new Circulo(raio);

              System.out.println("Digite o lado do quadrado:");
            double lado = scanner.nextDouble();
            Formas quadrado = new Quadrado(lado);

             System.out.println("Digite o lado do triangulo: ");
            double ladoT = scanner.nextDouble();
            System.out.println("Digite a altura do triangulo:");
            double altura = scanner.nextDouble();
            Formas triangulo = new Triangulo(altura, ladoT);

            Formas[] formas = {circulo, quadrado, triangulo};
            System.out.println("\nÁreas calculadas:");
            for (Formas z : formas) {
                System.out.println(z.getClass().getSimpleName() + ":" + z.calcular());
            } 
            scanner.close();
        }      
    }
    
}
