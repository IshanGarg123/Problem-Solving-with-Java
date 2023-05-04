
import java.util.Scanner;
public class removeChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        char x = input.next().charAt(0);

        int len = name.length();

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<len;i++)
        {
            if(name.charAt(i)!=x)
            {
                ans.append(name.charAt(i));
            }
        }

        System.out.println(ans);
    }
}
