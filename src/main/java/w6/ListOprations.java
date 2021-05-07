package w6;

import w5.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOprations {
    private User[] usersArr = new User[10];
    // deklaracja
    private List<User> usersList = new ArrayList<>();

    public static void main(String[] args) {
        ListOprations lo = new ListOprations();
        System.out.println("Tablica");
        Arrays.stream(lo.usersArr).forEach(System.out::println);
        System.out.println("Lista");
        lo.usersList.forEach(System.out::println);
        User user1 = new User(1, "mk@mk.pl", "mk", LocalDate.of(2000, 1, 1), true);
        User user2 = new User(2, "mk1@mk.pl", "mk1", LocalDate.of(2000, 1, 1), false);
        User user3 = new User(3, "mk2@mk.pl", "mk2", LocalDate.of(2000, 1, 1), true);
        // dodawanie elementów do listy
        lo.usersList.addAll(Arrays.asList(user1, user2, user3));
        user1.setStatus(false);
        // modyfikacja
        lo.usersList.set(0, user1);
        System.out.println("Po modyfikacji: " + lo.usersList);
        // długość listy
        for (int i = 0; i < lo.usersList.size(); i++) {
            // sprawdzanie przynależności
            if (lo.usersList.contains(user2)) {
                if(lo.usersList.get(i).equals(user2)) {
                    // pobieranie wartości na indeksie
                    System.out.printf("%2d | %s\n", i, lo.usersList.get(i));
                    break;
                }
            }
        }

    }
}
