//package Task2;  // Gotovo!!!
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//class GsonTest {
//    public static void main(String[] args) throws IOException {
//        User user = new User("alice", 21);
//        User user1 = new User("ryan", 30);
//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(user);
//        String json1 = gson.toJson(user1);
//        System.out.println(json + ",\n" + json1);
//
//        File file = new File("C:\\Users\\1\\Desktop\\user.json");
//        FileWriter writer = new FileWriter(file);
//        writer.write(json + ",\n" + json1);
//        writer.flush();
//        writer.close();
//
//    }
//    static class User {
//        String name;
//        int age;
//
//        public User(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        @Override
//        public String toString() {
//            return "User{" +
//                    "name=" + name +
//                    ", age=" + age + '\'' +
//                    '}';
//        }
//    }
//}
//
//
