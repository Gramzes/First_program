import java.util.Scanner;

public class First_program {
    public static void main(String ...args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name:");
        String name = scanner.nextLine();
        System.out.println("Input your age:");
        int age = scanner.nextInt();
        System.out.printf("Hi! I'm %s and i'm %d years old. \n", name, age);
        System.out.println(6^1);//xor
    }
}
