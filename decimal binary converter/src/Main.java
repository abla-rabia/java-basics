import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int u=1;
        int b=0;
        int d;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Hey you ! enter a number or i'll kill u : ");
        int n=scanner.nextInt();
        d=n;
        while (d != 0){
            b=d%2 * u+b;
            d=d /2;
            u=u*10;
        }
        System.out.println("The binary version of "+n + " is : "+b);
    }
}