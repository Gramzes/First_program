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
        long a = 534234233323422L;
        System.out.println((int)a); //явное преобразование с усечением
        System.out.println((int)56.99);
        System.out.println("Feature branch");
        /*
        Бесконечный цикл
        for (;;){
            System.out.println(1);
        }
        Цикл только с условием
        int i=0;
        for (;i<10;){
            i++;
        }
        Цикл с несколькими переменными
        for (int i=0, int j=0; i<10 and j<100;i++,j++)
        {

        }
         */

        int[][] array = new int[3][2];
        for(int[] i:array){      //замена foreach
            for (int j:i){
                System.out.println(j);
            }
        }


    }
}
