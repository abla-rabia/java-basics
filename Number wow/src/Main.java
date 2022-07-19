/*************************************************************************/
/* something ; the solution isn't general ok? */

public class Main {
    public static void main(String[] args) {
        int i,ch1,ch2,ch3,s;
        int cmp=0;
        System.out.print("The 4 numbers are : ");
        for (i=100;i<=500;i++){
            ch1=i%10;
            ch2=i/10%10;
            ch3=i/100%10;
            s=(int)Math.pow(ch1,3)+(int)Math.pow(ch2,3)+(int)Math.pow(ch3,3);
            if (s==i) {
                cmp++;
                System.out.print(i+" ,");
            }
            if (cmp==4)
                break;
        }

    }
}