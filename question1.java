import java.util.Scanner;

class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("No 1 is Maximum");
        } else if (b > a && b > c) {
            System.out.println("No 2 is Maximum");
        } else {
            System.out.println("No 3 is maximum");
        }

    }
}