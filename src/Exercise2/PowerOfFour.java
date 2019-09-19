package Exercise2;
import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        powerOfFour(num);
    }
    public static void powerOfFour(int num) {
        if (num ==4) {
            System.out.println("Number entered is a power of 4");
        } else if (num % 4 != 0) {
            System.out.println("Number entered is NOT a power of 4");
        } else if (num % 4 == 0 && num != 4) {
            powerOfFour(num / 4);
        }
    }

}
