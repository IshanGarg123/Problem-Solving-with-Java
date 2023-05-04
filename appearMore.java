import java.util.Scanner;
public class appearMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        int[] temp = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
            temp[arr[i]]++;
        }

        for(int i=0;i<n;i++)
        {
            if(temp[i]>=2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
