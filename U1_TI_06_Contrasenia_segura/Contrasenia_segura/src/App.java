import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contrasenia_segura user = new Contrasenia_segura();

        System.out.print("Enter username: ");
        user.setUsername(sc.nextLine());

        while (user.getUserPassword() == null) {
            System.out.print("Enter password: ");
            user.setUserPassword(sc.nextLine());
        }

        if (!user.isInitialized()) {
            System.out.println("User was not initialized correctly.");
            return;
        }

        System.out.print("Enter your password to authenticate: ");
        String correct = sc.nextLine();
        if (user.authenticate(correct)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        sc.close();
    }
}