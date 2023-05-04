import java.util.Scanner;
public class spiralPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        int top = 0;
        int bottom = m-1;
        int left=0;
        int right = n-1;

        while(bottom>=top && right>=left)
        {
            for(int i=top;i<=right;i++)
            {
                System.out.print(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(arr[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                System.out.print(arr[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                System.out.print(arr[i][left]);
            }
            left++;
        }
    }
}
