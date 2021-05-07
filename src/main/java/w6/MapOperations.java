package w6;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        Map<String, Integer> romanToDecimalMapper = new HashMap<String, Integer>(){{
            put("0", 0);
            put("I", 1);
            put("II", 2);
            put("III", 3);
            put("IV", 4);
        }};
        Map<Integer, String> decimalToRomanMapper = new HashMap<>();
        decimalToRomanMapper.put(0,"0");
        decimalToRomanMapper.put(1,"I");
        decimalToRomanMapper.put(2,"II");
        decimalToRomanMapper.put(3,"III");
        decimalToRomanMapper.put(4,"IV");
        decimalToRomanMapper.put(5,"V");
        System.out.println(decimalToRomanMapper);
        // mapowanie
        int num = 5;
        System.out.printf("%d - %s\n", num, decimalToRomanMapper.get(num));
        String rom = "IV";
        System.out.printf("%s - %d\n", rom, romanToDecimalMapper.get(rom));
    }
}
