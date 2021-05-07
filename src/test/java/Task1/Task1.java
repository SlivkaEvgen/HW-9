package module09.Task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

class WriteRead {

    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();
    }
    public static void readFile() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\1\\Desktop\\file1.txt");
        Scanner sc = new Scanner(reader);
        while (sc.hasNextLine()) {
            String str = sc.nextLine().strip();
            if (Pattern.matches(".[0-9]{3}.\\s[0-9]{3}-[0-9]{4}", str)) {
                System.out.println(str);
            }
            if (Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}", str)) {
                System.out.println(str);
            }
        }
    }

    private static void writeFile() throws IOException {
        File file = new File("C:\\Users\\1\\Desktop\\file1.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("""
                987-123-4567\s
                123 456 7890\s
                (123) 456-7890""");
        writer.flush();
        writer.close();
    }
}


