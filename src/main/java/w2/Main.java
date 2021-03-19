package w2;

public class Main {
    // metoda uruchomieniowa - start programu
    public static void main(String[] args) {
        // nowa instancja klasy Auto
        Auto auto1 = new Auto("BMW", "X5", 300_000);
        Auto auto2 = new Auto("Ford","Mondeo", 180_000);
        // instancja na podstawie ostniejącego obiektu
        Auto auto3 = auto2;
//        System.out.println(auto1);
//        System.out.println(auto2);
//        System.out.println(auto3);
        // nie mam dosępu do składowych prywatnych poza klasą Auto
//        System.out.println(auto1.model);
//        auto1.setBrand("Audi");
//        auto1.setModel("A6");
//        auto1.setPrice(200_000);
//        auto2.setBrand("VW");
//        auto2.setModel("Passat");
//        auto2.setPrice(150_000);
//        System.out.println(auto1.getModel());
//        System.out.println(auto2.getModel());
//        System.out.println(auto3.getModel());
//        System.out.println("Auto 1: " + auto1.toString());
//        System.out.println("Auto 2: " + auto2);
//        System.out.println("Auto 3: " + auto3);
        // listowanie obiektów klasy Auto z tablicy
        Auto [] autos = {auto1, auto2, auto3};
        for(Auto auto : autos){
            System.out.println(auto);
        }

    }

}
