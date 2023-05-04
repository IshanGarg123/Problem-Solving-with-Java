
import java.util.Scanner;
public class anagramStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();

        int len1 = name1.length();
        int len2 = name2.length();

        boolean ans = true;

        for(int i=0;i<len1;i++)
        {
            char temp = name1.charAt(i);
            boolean temp1 = false;
            for(int j=0;j<len2;j++)
            {
                if(temp == name2.charAt(j))
                {
                    temp1 = true;
                    break;
                }
            }
            if(!temp1)
            {
                ans = false;
                break;
            }
        }
        
        if(ans)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
