package string;
import java.util.Scanner;
public class vowelconsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.nextLine();
        int vowel = 0;
        int conso =0;

        for(int i=0; i<str.length(); i++){
            char ch= Character.toLowerCase(str.charAt(i));

            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                    vowel++;
                }
                else{
                    conso++;
                }
            }
        }
        System.out.println("Vowel"+ " "+ vowel);
        System.out.println("consonants"+" "+conso);
    }
}
