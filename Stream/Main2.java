package Stream;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Vitor", "Triz", "Bruno", "Joao");
        
        palavras.stream()
                .filter( p -> p.length() > 5)
                .forEach(System.out::println);

                
    }
    
}
