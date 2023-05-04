import java.util.Scanner;
public class maxDiff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }

        int ans = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i] && j-i>ans)
                {
                    ans = j-i;
                }
            }
        }
        System.out.println(ans);
    }
}
