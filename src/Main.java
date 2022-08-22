import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char sym = text.toLowerCase().charAt(i);
            if (!map.containsKey(sym)) {
                map.put(sym, 1);
            } else {
                int value = map.get(sym);
                value++;
                map.put(sym, value);
            }
        }


        int max = -1;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > max) {
                max = kv.getValue();
            } else if (kv.getValue() < min) {
                min = kv.getValue();
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
