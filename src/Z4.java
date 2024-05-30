import java.util.Scanner;
public class Z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� ��� ���������� ����������: ");
        int number = scanner.nextInt();

        long factorial = factorial(number);

        System.out.println("��������� ����� " + number + " �����: " + factorial);
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}