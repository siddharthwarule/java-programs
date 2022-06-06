import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int marks;
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks = sc.nextInt();

            if (marks >= 75 && marks <= 100) {
                System.out.println("1 division!");
            }
            else if (marks >= 60 && marks <= 74) {
                System.out.println("2 division!");
            } else if (marks >= 45 && marks <= 59) {
                System.out.println("3 division!");
            } else if (marks >= 35 && marks <= 44) {
                System.out.println("You are passed!");
            } else {
                System.out.println("Sorry! You can try next year!");
            }


        }
    }
}
