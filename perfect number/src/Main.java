import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s,i;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number N : ");
        int n =scanner.nextInt();
        s=0;
        for (i=1;i<=n/2;i++){
            if (n%i==0)
                s+=i;
        }
        if (n==s)
            System.out.println(n + " is a perfect number .");
        else
            System.out.println(n + " isn't a perfect number .");
    }
}