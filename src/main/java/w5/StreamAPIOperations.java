package w5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamAPIOperations {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,4,3,2,1,5,6,7,8,7};
        // wypisz liczby
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("STREAM API");
        Arrays                                                        // int []
                .stream(numbers)                                      // Stream<Integer>
                .forEach(number -> System.out.print(number + " "));   // void

        System.out.println();
        System.out.println("LICZBY PARZYSTE");
        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println("LICZBY PARZYSTE - BEZ POWTÓRZEN");
        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .distinct()
                .forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println("LICZBY PARZYSTE - PIERWSZE 3");
        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .limit(3)
                .forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println("KONWERSJA NA LISTĘ ZAWIERAJĄCA TYP STRING");
        List<String> numbersList = Arrays.stream(numbers)   // Stream<Integer>
                .mapToObj(number -> "value: " + number)     // Stream<String>
                .collect(Collectors.toList());              // List<String>
        System.out.println(numbersList);
        System.out.println("STATYSTYKI");
        OptionalInt optionalInt = Arrays.stream(numbers).max();
        if(optionalInt.isPresent()){                        // gdy zwraca nie pustą wartość max
            System.out.println("MAX: " + optionalInt.getAsInt());
        } else {                                            // gdy max jest null
            System.out.println("LISTA PUSTA - NIE MOGĘ ZWRÓCIC WARTOSCI MAX");
        }
        System.out.println("MIN: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("SUM: " + Arrays.stream(numbers).sum());
        System.out.println("AVG: " + Arrays.stream(numbers).average().getAsDouble());
        System.out.println("COUNT: " + Arrays.stream(numbers).count());


    }
}
