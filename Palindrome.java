import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        int len = name.length();

        int i=0;
        int j=len-1;

        boolean ans  = true;

        while(j>i)
        {
            if(name.charAt(i) != name.charAt(j))
            {
                ans = false;
                break;
            }
            i++;
            j--;
        }
        if(ans)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
