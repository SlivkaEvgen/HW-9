package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Words2 {
    public Words2() {
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add(0, "the");
        words.add(1, "day");
        words.add(2, "is");
        words.add(3, "sunny");
        words.add(4, "the");
        words.add(5, "the");
        words.add(6, "the");
        words.add(7, "sunny");
        words.add(8, "is");
        words.add(9, "is");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        map.forEach((String, Integer) -> System.out.println(String + " " + Integer));
    }
}
