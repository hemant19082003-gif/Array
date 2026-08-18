package string;
import java.util.Scanner;
public class stringprint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String print = sc.nextLine();


        // 1st character print

        char first = print.charAt(0);
        char second = print.charAt(1);

        // last latter
        char last = print.charAt(print.length()-1);
        System.out.println("String "+ " " + first +" " + second +" " + print + " "+ last);
    }
}
