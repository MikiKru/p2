package w8;

import java.io.*;
import java.time.LocalTime;
import java.util.Scanner;

public class ExceptionHandler {
    private Integer getNumberFromString(String text){
        try {
            // tutaj zjanduje się kod, ktróry może generować wyjątek
            return Integer.valueOf(text);
        } catch (NumberFormatException ex){
            // tutaj znajduje się obsług wyjątku
//            ex.printStackTrace();
            System.err.println("Błąd parsowania string to integer");
            return null;
        }
    }
    private void writeToFile(String text){
        try {
            PrintWriter pw = new PrintWriter("test.txt");
            pw.println(text);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void appendToFile(String text){
        try {
            FileWriter fw = new FileWriter("test_append.txt", true);
            fw.append(text + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void printDataFromFile(String filePath){
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()){                  // sprawdza czy są dane do wczytania lone by line
                System.out.println(scanner.nextLine());     // pobiera dane i przesuwa kursor
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Błędny adres pliku");
//            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionHandler eh = new ExceptionHandler();
        System.out.println(eh.getNumberFromString("123mklsd"));
        System.out.println(eh.getNumberFromString("123"));
        eh.writeToFile("test info");
        eh.appendToFile("append test " + LocalTime.now());
        eh.printDataFromFile("xxx");
        eh.printDataFromFile("test_append.txt");
    }
}
