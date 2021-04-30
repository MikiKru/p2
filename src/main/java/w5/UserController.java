package w5;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class UserController {
    private static List<User> users = new ArrayList<>(Arrays.asList(
            new User(1,"m@m.pl","m", LocalDate.of(2000,4,3), true),
            new User(2,"e@e.pl","eee", LocalDate.of(2001,1,4), true),
            new User(3,"r@r.pl","rr", LocalDate.of(2002,12,7), false),
            new User(4,"q@q.pl","q", LocalDate.of(1987,5,8), true),
            new User(5,"b@b.pl","bbb", LocalDate.of(1999,2,11), true)
    ));

    public static void main(String[] args) {
        System.out.println("Wypisz użytkowników");
        users.stream().forEach(user -> System.out.println(user));
        System.out.println("Wypisz tylko użytkowników aktywnych");
        users.stream().filter(user -> user.isStatus()).forEach(user -> System.out.println(user));
        System.out.println("Wypisz tylko użytkowników aktywynch posortowanych po dacie urodzenia malejąco");
        users.stream()
                .filter(user -> user.isStatus())
                .sorted(Comparator.comparing(User::getBithDate).reversed())
                .forEach(user -> System.out.println(user));
        System.out.println("Wypisz użytkoników posortowanych po loginie od a do z");
        users.stream()
                .sorted(Comparator.comparing(User::getEmail))
                .forEach(user -> System.out.println(user));
        String usersToCSV = users.stream()
                .sorted(Comparator.comparing(User::getEmail))
                .map(user -> String.format("%s;%s;%s;%s", user.getId(), user.getEmail(), user.getBithDate(), user.isStatus()))
                .collect(Collectors.joining("\n"));
        System.out.println("TO FILE .csv");
        System.out.println("id;email;bithdate;status\n"+usersToCSV);
        System.out.println("logowanie");
        Optional<User> isUser = users.stream()
                .filter(user -> user.getEmail().equals("m@m.pl") && user.getPassword().equals("m"))
                .findFirst();
        System.out.println("Czy zalogowano: " + isUser.isPresent());
    }
}
