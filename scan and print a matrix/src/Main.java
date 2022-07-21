import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] T=new int[100][100];
        int i,r,c,j;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Set the number of rows : ");
        r= scanner.nextInt();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.print("Set the number of columns : ");
        c= scanner.nextInt();
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print("T [ "+ i +" , "+j+" ] = ");
                T[i][j]=scanner.nextInt();
            }
        }
        /*Now let's print the matrix */
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print(T[i][j]+" | ");
            }
            System.out.println(" ");
            for (int k=0;k<r;k++)
                System.out.print("*-*-");
            System.out.println();
        }
    }
}