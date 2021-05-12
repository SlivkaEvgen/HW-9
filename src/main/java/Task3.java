import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class Words2 {
    public Words2() {
    }
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        FileReader reader = new FileReader("src/main/resources/words.txt");
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            words.add(sc.next());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
