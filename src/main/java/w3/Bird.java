package w3;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data   // generuje toString, gettery, settery
public class Bird extends Animal {
    private boolean fly;
    // konstruktor z argumentami klasy Animal i klasy Bird
    public Bird(String species, int noOfLegs, float height, char sex, boolean carnivorous, boolean fly) {
        // wywołanie konstruktora klasy nadrzędnej
        super(species, noOfLegs, height, sex, carnivorous);
        this.fly = fly;
    }
    @Override
    public String toString() {
        return "Bird{" +
                "fly=" + fly +
                "} " + super.toString();    // super wywołuje toString() klasy nadrzędnej
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Orzeł", 2, 0.54f, '0',true,true);
        System.out.println(bird);
    }
}
