package w5;

import java.util.Arrays;

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

    }
}
