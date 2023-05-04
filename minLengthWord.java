import java.util.Scanner;
public class minLengthWord{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String[] arr = name.split(" ");
        int ans = 1000000;
        String ans1="";

        for (String s : arr) {
            if (s.length() < ans) {
                ans = s.length();
                ans1 = s;
            }
        }
        System.out.println(ans1);

    }
}
