package w4;

public class Main {
    public static void main(String[] args) {
        AutoService autoService = new AutoServiceImpl();
        autoService.addNewAuto("VW","Passat",150_000);
        autoService.addNewAuto("Audi","A6",200_000);
        autoService.addNewAuto("BMW","5",220_000);
        autoService.updateAutoPrice(1, 215_000);
        int index = 0;
        for(Auto a : autoService.findAllAutos()){
            System.out.println(index + " " + a);
            index++;
        }
        System.out.println(autoService.findAutoByIndex(2));
        System.out.println(autoService.findAutoByIndex(9));

    }
}
