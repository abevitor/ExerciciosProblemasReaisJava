package Stream;

import java.util.Arrays;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        
         List<String> palavras = Arrays.asList("Vitor", "Triz", "Bruno", "Joao");

                      palavras.stream()
                              .sorted()
                              .forEach(System.out::println);
    }
    
}
