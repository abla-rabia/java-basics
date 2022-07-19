import java.util.Scanner;

/*************************************************************************************/

/*FIBONACCI Sequence !! */

public class Main {
    public static void main(String[] args) {
        int u0=1;
        int u1=1;
        int i,u=u0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N :");
        int n=scanner.nextInt();
        if (n>1)
            for (i=2;i<n;i++){
                u=u1+u0;
                u0=u1;
                u1=u;
            }
        System.out.println("The "+ n +"th terme of FIBONACCI sequence is : U = "+ u);
    }
}

/*************************************************************************************/