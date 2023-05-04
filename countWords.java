import java.util.Scanner;
public class countWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String[] arr = name.split(" ");
        System.out.println(arr.length);
    }
}
