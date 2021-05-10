// Gotovo!!!

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class GsonTest {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/zeka/IdeaProjects/HW-9/src/main/resources/file1.txt");
        Scanner sc = new Scanner(reader);
        String nameAge = sc.nextLine();

        User user = new User(sc.next(),sc.nextInt());
        User user1 = new User(sc.next(),sc.nextInt());

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        String json1 = gson.toJson(user1);
        System.out.println(json + ",\n" + json1);

        File file = new File("/Users/zeka/IdeaProjects/HW-9/src/main/resources/user.json");
        FileWriter writer = new FileWriter(file);
        writer.write(json + ",\n" + json1);
        writer.flush();
        writer.close();

    }
    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name=" + name +
                    ", age=" + age + '\'' +
                    '}';
        }
    }
}


