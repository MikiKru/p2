package w6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> roomsNo = new HashSet<>(Arrays.asList(100,101,102,103,104,200,201,202,203));
        Set<Integer> newRoomsNo = new HashSet<>(Arrays.asList(104,105,106,200,201,202,203,300,301,302));
        System.out.println(roomsNo);
        // dodawanie elementów
        roomsNo.add(300);
        roomsNo.add(100);
        System.out.println(roomsNo);
        System.out.println(roomsNo.size());
        for (Integer room : roomsNo){
            System.out.print(room + " | ");
        }
        System.out.println();
        // operacje na zbiorach
        // suma
        Set<Integer> result = new HashSet<>();
        result.addAll(roomsNo);
        result.addAll(newRoomsNo);
        System.out.println(roomsNo);
        System.out.println(newRoomsNo);
        System.out.println("SUMA: " + result);
        Set<Integer> result2 = new HashSet<>();
        result2.addAll(roomsNo);
        result2.retainAll(newRoomsNo);
        System.out.println(roomsNo);
        System.out.println(newRoomsNo);
        System.out.println("SUMA: " + result2);
    }
}
