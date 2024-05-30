import java.util.Scanner;

public class Z2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("¬ведите число: ");
        int n = sc.nextInt();
        if (n >= 2) System.out.println(findDivisor(n));
    }


    public static int findDivisor (int n){
        for (int i = 2; i < Integer.MAX_VALUE; i++){
            if (n % i == 0) return i;
        }
        return 0;
    }
}