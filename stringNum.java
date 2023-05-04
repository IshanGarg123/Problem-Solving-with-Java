import java.util.Scanner;
public class stringNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        int count=1;
        char temp = name.charAt(0);
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<name.length()-1;i++)
        {
            if(name.charAt(i)==name.charAt(i+1))
            {
                count++;
            }
            else {
                if(count > 1) {
                    ans.append(temp).append(count);
                } else {
                    ans.append(temp);
                }
                count = 1;
                temp = name.charAt(i+1);
            }
        }
        if(count > 1) {
            ans.append(temp).append(count);
        } else {
            ans.append(temp);
        }

        System.out.println(ans);

    }
}
