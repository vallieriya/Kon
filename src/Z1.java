import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите год: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }
}
