import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        Person person = new Person(name, height, weight);

        double bmi = person.calculateBMI();
        String classification = person.classifyBMI();

        System.out.printf("Hello %s your BMI is: %.2f (%s)%n", person.getName(), bmi, classification);

    }
}