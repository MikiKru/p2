package w4;
// klasa service - klasa dostarczająca logiki biznesowej
public interface AutoService {
    // tablica obikektów Auto

    public static final Auto [] autos = new Auto[10];   // miejsce w pp jest niezmienne
//            {
//            new Auto("VW", "Passat", 150_000),  // index=0
//            new Auto("Audi", "A6", 200_000),
//            new Auto("BMW", "5", 220_000)       // index=autos.length - 1
//    };
    // metody abstrakcyjne -> typ, nazwa, argumenty
    // metoda do utworzenia obiektu auta
    public abstract void addNewAuto(String brand, String model, double price);
    // *** metoda do zmiany ceny auta
    public abstract Auto updateAutoPrice(int index, double newPrice);
    // *** metoda do wyszukiwania auta po indeksie
    public abstract Auto findAutoByIndex(int index);
    // metoda wyszukująca wszystkie auta
    Auto [] findAllAutos();
}
