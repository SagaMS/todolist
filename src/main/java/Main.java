import java.util.Scanner;

public class Main {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       boolean flag =true;
        while (flag){
            System.out.println("Welcome to simple todo list");
            System.out.println("Chose some options \n" +
                    "Press 1 for saying hello \n" +
                    "Press 2 for exit \n");

            int inputOption = sc.nextInt();

            switch(inputOption){

                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    flag = false;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Something went wrong");


            }
        }

        System.out.println("We managing the exit");
    }
}
