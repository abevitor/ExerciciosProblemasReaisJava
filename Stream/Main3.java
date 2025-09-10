package Stream;

import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        
         List<String> palavras = Arrays.asList("Vitor", "Triz", "Bruno", "Joao");
        

         palavras.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
    
}
