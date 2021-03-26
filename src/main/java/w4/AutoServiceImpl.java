package w4;
// klasa implemnetująca logikę biznesową na podstawie metod abstrakcyjnych zdefiniowanych w interfejsie
// ALT + Enter -> implement metohds
public class AutoServiceImpl implements AutoService {
    @Override       // przysłonięcie
    public void addNewAuto(String brand, String model, double price) {
        Auto auto = new Auto(brand, model, price);
        for (int i = 0; i < (AutoService.autos.length - 1); i++) {
            if(AutoService.autos[i] == null){
                AutoService.autos[i] = auto;
                break;  // przerwanie działania pętli
            }
        }
    }
    @Override
    public Auto updateAutoPrice(int index, double newPrice) {
        AutoService.autos[index].setPrice(newPrice);
        return AutoService.autos[index];
    }
    @Override
    public Auto findAutoByIndex(int index) {
        return AutoService.autos[index];
    }
    @Override
    public Auto[] findAllAutos() {
        return AutoService.autos;
    }
}
