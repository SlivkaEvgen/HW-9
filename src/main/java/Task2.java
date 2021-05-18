// Gotovo!!!

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GsonTest {
    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();

        String json = "";
        FileReader reader = new FileReader("src/main/resources/file1.txt");
        Scanner sc = new Scanner(reader);
        String nameAge = sc.nextLine();
        while (sc.hasNext()) {
            User user = new User(sc.next(), sc.nextInt());
            users.add(user);
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        json = gson.toJson(users);
        System.out.println(json);
        File file = new File("src/main/resources/user.json");
        FileWriter writer = new FileWriter(file);
        writer.write(String.valueOf(json));
        writer.flush();
        writer.close();
        sc.close();
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


