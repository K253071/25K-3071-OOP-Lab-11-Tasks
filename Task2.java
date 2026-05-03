import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id = sc.nextLine();

        String fileName = name + ".txt";

        System.out.print("Enter PF Lab marks: ");
        int pfLab = sc.nextInt();

        System.out.print("Enter PF Theory marks: ");
        int pfTheory = sc.nextInt();

        ArrayList<String> courses = new ArrayList<>();

        int totalCredits = 0;
        final int maxCredits = 15;

        
        String[] baseCourses = {"Math", "English", "Physics"};

        for (String course : baseCourses) {
            if (totalCredits + 3 <= maxCredits) {
                courses.add(course);
                totalCredits += 3;
            }
        }

        
        if (pfLab >= 50 && pfTheory >= 50) {
            if (totalCredits + 6 <= maxCredits) {
                courses.add("OOP Lab");
                courses.add("OOP Theory");
                totalCredits += 6;
            }
        } else {
            System.out.println("Not eligible for OOP courses.");
        }

        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("ID: " + id);
            bw.newLine();
            bw.write("Courses:");
            bw.newLine();

            for (String c : courses) {
                bw.write("- " + c);
                bw.newLine();
            }

            bw.write("Total Credits: " + totalCredits);

        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        
        System.out.println("\nFile Content:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
