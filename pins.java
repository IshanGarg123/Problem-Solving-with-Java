import java.util.Scanner;
public class pins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int []arr = new int[8];

        int index = 0;

        for(int i=n;i>0;i=i/2)
        {
            if(i%2==1)
            {
                arr[index] = 1;
            }
            index++;
        }

        for(int i=0;i<8;i++) {
            if (arr[i] == 0) {
                System.out.println("the pin is " + i + " low");
            } else {
                System.out.println("the pin is " + i + " high");
            }
        }
    }
}
