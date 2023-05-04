
import java.util.Scanner;
public class swapString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();

        int len1 = name1.length();
        int len2 = name2.length();

        name1 = name1+name2;

        name2 = name1.substring(0,len1);
        name1 = name1.substring(len1,len1+len2);

        System.out.println(name2);
        System.out.println(name1);
    }
}
