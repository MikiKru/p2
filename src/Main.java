// psvm -> public static void main(String[] args) {}
// sout -> System.out.println();
public class Main {
    public static void main(String[] args) {
        System.out.println("START");
        User user1 = new User(
                "mk@mk.pl",
                "mk");
        System.out.println("user 1 is created");
        System.out.println("email: " + user1.getEmail());
        System.out.println("password: " + user1.getPassword());
    }
}
