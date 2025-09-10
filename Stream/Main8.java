package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main8 {
    public static void main(String[] args) {

         List<String> nomes = Arrays.asList("Vitor", "Ana", "Carlos", "Beatriz");

        String resultado = nomes.stream()
                                .collect(Collectors.joining(", ")); 

        System.out.println("Nomes: " + resultado);
        
    }
    
}
