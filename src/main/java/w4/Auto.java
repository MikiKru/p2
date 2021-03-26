package w4;
// każda klasa dziedziczy składowe po nadklasie Object
public class Auto extends Object{
    // pola klasowe -> dostępne tylko dla obiektów klasy Auto
    // privte -> pola są dostępne tylko w klasie Auto
    private String brand;
    private String model;
    private double price;
    // konstruktor służy do inicjalizacji obiektu
    public Auto(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // toString -> napisowa reprezentacja obiektu
    @Override   // -> przysłonięcie metody z nadklasy Object
    public String toString(){
        return String.format("%10s %10s %10.2f zł", this.brand, this.model, this.price);
    }
    // getter -> metoda zwracająca wartość i nie przyjmująca argumentu
    // public -> dostępna w całym projekcie
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public double getPrice(){
        return this.price;
    }
    // settery -> metoda nie zwracająca wartości i przyjmująca argument
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
