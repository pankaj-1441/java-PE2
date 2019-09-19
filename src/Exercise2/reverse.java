package Exercise2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string to get reverse: ");

        String in=sc.nextLine();
        String rev="";
        for(int i=in.length()-1; i>= 0; i--)
        {
            rev= rev + in.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(in)) {
            System.out.println("Palindrome");
        }
        else System.out.println("not Palindrome");
    }
}
