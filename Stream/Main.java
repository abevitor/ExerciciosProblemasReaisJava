package Stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        //Filtrar números pares de uma lista de inteiros e imprimir.
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 14, 20, 44, 45, 21);
        

        
                               numeros.stream()
                                      .filter(n -> n % 2 == 0)
                                      .forEach(System.out::println);

    }
    
}
