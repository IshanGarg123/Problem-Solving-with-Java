import java.util.Scanner;
public class removeKlement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        String ans = name.replaceAll("e","");
        System.out.println(ans);
    }
}
