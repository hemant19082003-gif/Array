package string;
import java.util.Scanner;
public class digitcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String str =sc.nextLine();

        int count =0;
        int space =0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                count++;
            }
            else if(str.charAt(i)==' '){     // space count
                space++;
            }
        }
        System.out.println("Digit:"+" "+count);
        System.out.println("Space:"+" "+space);
    }
}
