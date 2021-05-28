package w8;

import java.io.*;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {
    private Integer getNumberFromString(String text) {
        try {
            // tutaj zjanduje się kod, ktróry może generować wyjątek
            return Integer.valueOf(text);
        } catch (NumberFormatException ex) {
            // tutaj znajduje się obsług wyjątku
//            ex.printStackTrace();
            System.err.println("Błąd parsowania string to integer");
            return null;
        }
    }

    private void writeToFile(String text) {
        try {
            PrintWriter pw = new PrintWriter("test.txt");
            pw.println(text);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void appendToFile(String text) {
        try {
            FileWriter fw = new FileWriter("test_append.txt", true);
            fw.append(text + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printDataFromFile(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            int i = 0;
            while (scanner.hasNextLine()) {                  // sprawdza czy są dane do wczytania lone by line
                if (i < 3) {
                    scanner.nextLine();
                    try {
                        throw new InputMismatchException();  // zgłaszam wyjątek
                    } catch (InputMismatchException e) {
                        System.err.println("Pominięcie nagłówka"); // obsługuje zgłoszony wyjątek
                    }
                } else {
                    System.out.println(scanner.nextLine());     // pobiera dane i przesuwa kursor
                }
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Błędny adres pliku");
//            e.printStackTrace();
        } catch (IllegalStateException e){
            System.err.println("Skaner jest zamknięty");
        } catch (Exception e){
            System.err.println("Występuje inny błąd");
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
