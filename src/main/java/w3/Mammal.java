package w3;

import lombok.Data;

@Data
public class Mammal extends Animal {

    public Mammal(String species, int noOfLegs, float height, char sex, boolean carnivorous) {
        super(species, noOfLegs, height, sex, carnivorous);
    }

    @Override
    public String toString() {
        return "Mammal{} " + super.toString();
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal("Kot", 4, 0.35f,'1', true);
        System.out.println(mammal);
    }
}
