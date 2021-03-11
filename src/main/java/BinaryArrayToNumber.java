import java.util.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        HashMap<Integer,Integer> pos = new HashMap<>();
        int p =binary.size()-1;
        for (Integer integer : binary) {
            pos.put(p, integer);
            p--;
        }
       return pos.entrySet().stream().mapToInt( x -> (int)Math.pow(2, x.getKey())*x.getValue()).sum();
    }
}