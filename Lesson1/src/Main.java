import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        String gender;
        int age;

        //Declare scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your gender: ");
        gender = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextByte();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);

    }
}