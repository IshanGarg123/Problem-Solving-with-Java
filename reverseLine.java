import java.util.Scanner;
public class reverseLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String[] arr = name.split(" ");
        int len = arr.length;
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
