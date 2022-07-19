import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int u=1;
        int ch1, ch2,m,f;
        System.out.print("Hey dude , enter a number please bro : ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ch1=n%10;
        boolean unit =false;
        while (!unit){
            if (n/u==0)
                unit=true;
            else
                u*=10;
        }
        u/=10;
        ch2=n/u;
        m=(n-ch2*u)/10;
        f=m*10+ch2+ch1*u;
        System.out.println("Here is your stupid number after Swapping : "+f);
    }
}