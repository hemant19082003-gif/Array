package string;
import java.util.Scanner;
public class ADD2string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 =sc.nextLine();
        String str2 =sc.nextLine();

        String result = str1 + str2;
        System.out.println("add"+ " " + result);
    }
}
