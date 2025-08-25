import java.util.Scanner;
public class ConversorTemp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celcius");
        var c = scanner.nextDouble();

         scanner.nextLine();

        System.out.println("Deseja converter para Fahrenhait ou Kelvin?");
        var escolha = scanner.nextLine();

        if(escolha.equalsIgnoreCase("fahrenhait")){

            var fahrenhait =  c * 9/5 + 32;

            System.out.println("Temperatura em Fahrenhait: " + fahrenhait);

            return;
        }

        if (escolha.equalsIgnoreCase("Kelvin")) {

            var kelvin = c + 273.15;

            System.out.println("Temperatura em Kelvins: " + kelvin);
            
        }

        
        
    }
    
}
