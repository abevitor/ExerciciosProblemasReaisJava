package Stream;

import java.util.Arrays;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 3, 4, 4, 3, 4, 5, 6, 14, 20, 44, 45, 21);

        numeros.stream()
               .sorted()
               .distinct()
               .forEach(System.out::println);
    }
    
}
