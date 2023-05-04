
import java.util.Scanner;
public class firstContainSec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1 = input.next();
        String name2 = input.next();

        if(name1.contains(name2))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
