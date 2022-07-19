import java.util.Scanner;

/**********************************************************************************/
/* Prime Number !!! */
public class Main {
    public static void main(String[] args) {
        int d=2,i;
        boolean prime=true;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter N :");
        int n= scanner.nextInt();
        if (n==1 || n==0)
            prime=false;
        else{
            for (i=2;i<=n/2; i++){
                if (n % i==0)
                    d++;
            }
            if (d>2)
                prime=false;
        }
        if (prime)
            System.out.println("The number "+ n + " is prime .");
        else
            System.out.println("The number "+ n + " is not prime .");
    }
}

/**********************************************************************************/