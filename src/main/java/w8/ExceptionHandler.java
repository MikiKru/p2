package w8;

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

    public static void main(String[] args) {
        ExceptionHandler eh = new ExceptionHandler();
        System.out.println(eh.getNumberFromString("123mklsd"));
        System.out.println(eh.getNumberFromString("123"));
    }
}
