import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first born of the interval : ");
        int a = scanner.nextInt();;
        System.out.print("Please enter the second born of the interval : ");
        int b = scanner.nextInt();
        int n1=a;
        int n2=b;
        int c=0;
        int uf=1;
        int ufr=10;
        for (int i=1;i<=4;i++){
            int ch1=n1%10;
            int ch2=n2%10;
            n1/=10;
            n2/=10;
            c+=ch2*uf+ch1*ufr;
            ufr*=100;
            uf*=100;
        }
        System.out.println("Here is your final number : "+c);

    }
}