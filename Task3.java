import java.util.*;

class Login<T, U> {
    private T username;
    private U password;

    public Login(T username, U password) {
        this.username = username;
        this.password = password;
    }

    public void checkLogin(T inputUser, U inputPass) {
        if (username.equals(inputUser) && password.equals(inputPass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Program terminated.");
            System.exit(0);
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login<String, String> obj = new Login<>("admin", "1234");

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        obj.checkLogin(u, p);
    }
}