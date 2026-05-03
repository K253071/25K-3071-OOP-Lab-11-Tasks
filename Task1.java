import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        String path = System.getProperty("user.home") + "/Desktop/list.txt";

        // Write to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String item : list) {
                bw.write(item);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        // Read from file
        System.out.println("\nReading from file:");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        // Delete file
        File file = new File(path);
        if (file.delete()) {
            System.out.println("\nFile deleted.");
        } else {
            System.out.println("\nFile not deleted.");
        }
    }
}