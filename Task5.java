import java.io.*;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File file = new File("Confidential.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }

        System.out.print("Enter designation (Faculty/Student): ");
        String role = sc.nextLine();

        if (role.equalsIgnoreCase("Faculty")) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
        } else if (role.equalsIgnoreCase("Student")) {
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);
        } else {
            System.out.println("Invalid role.");
        }

        
        System.out.println("\nAccess Rights:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
    }
}
