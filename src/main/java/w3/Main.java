package w3;

public class Main {
    public boolean hasMoreLegs(Animal a1, Animal a2){
        return a1.getNoOfLegs() > a2.getNoOfLegs();
    }

    public static void main(String[] args) {
        // typujemy klasą nadrzędną, ale wywołujemy konstruktor klasy potomnej
        Animal eagle = new Bird("Orzeł", 2, 0.54f, '0',true,true);
        Object eagle2 = new Bird("Orzeł", 2, 0.54f, '0',true,true);
        Animal cat = new Mammal("Kot", 4, 0.35f,'1', true);
        System.out.println(new Main().hasMoreLegs(eagle, cat));
        System.out.println(new Main().hasMoreLegs(cat, cat));
        System.out.println(new Main().hasMoreLegs(cat, (Animal) eagle2));
    }
}
