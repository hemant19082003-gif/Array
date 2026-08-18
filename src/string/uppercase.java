package string;
import java.util.Scanner;
public class uppercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String uppercase = str.toUpperCase();
        String lowercase = str.toLowerCase();

        System.out.println("Uppercase" +  " "+ uppercase);
        System.out.println("Lowercase" +  " "+lowercase);
    }
}
