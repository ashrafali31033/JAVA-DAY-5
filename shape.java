import java.util.*;
public class shape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.println((char)(64+j)+" ");
            }
        }
        System.out.println();
    }
    
}
