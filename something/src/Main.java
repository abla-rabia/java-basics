import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first born of the interval : ");
        int a = scanner.nextInt();
        System.out.print("Please enter the second born of the interval : ");
        int b = scanner.nextInt();
        System.out.print("Numbers are : ");
        for (int i=a;i<=b;i++){
            boolean continu=true;
            int f=i;
            while (f!=0 && continu){
                int ch=f%10;
                f/=10;
                if (ch!=0){
                    if (i%ch!=0)
                        continu=false;
                }
            }
            if (f==0 && continu)
                System.out.print(i+" , ");
        }
    }
}