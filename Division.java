import java.util.*;

public class Division {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 Digit:");
        int a = sc.nextInt();
        System.out.print("Enter 2 Digit:");
        int b = sc.nextInt();

        int res = a / b;
        System.out.print("Answer:");
        System.out.print(res);

    }
}
