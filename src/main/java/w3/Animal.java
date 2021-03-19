package w3;

import lombok.*;

@NoArgsConstructor  // automatycznie dodaje w kodzie konstruktor domyślny
@AllArgsConstructor // automatycznie dodaje w kodzie konstruktor inicjalizujący wszystkie pola
@Getter             // automatycznie dodaje w kodzie gettery
@Setter             // automatycznie dodaje w kodzie settery
@ToString           // automatycznie dodaje w kodzie toString
public class Animal {
    private String species;
    private int noOfLegs;
    private float height;
    private char sex;
    private boolean carnivorous;
//    private Boolean carniv;
    // inicjalizacja pól
    // typy obiektowe -> null
    // typy proste
    // -> int         -> 0
    // -> float       -> 0.0
    // -> char        -> ''
    // -> boolean     -> false
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Species: " + animal.getSpecies());
        System.out.println("Legs: " + animal.getNoOfLegs());
        System.out.println("Height: " + animal.getHeight());
        System.out.println("Sex: " + animal.getSex());
        System.out.println("Eat meat: " + animal.isCarnivorous());
//        System.out.println("Eat meat: " + animal.getCarniv());
    }
}
