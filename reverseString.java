import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        StringBuilder ans = new StringBuilder();

        for(int i=name.length()-1;i>=0;i--)
        {
            ans.append(name.charAt(i));
        }
        System.out.println(ans);
    }
}
