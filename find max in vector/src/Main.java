import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] V= new int[100];
        Scanner scanner=new Scanner(System.in);
        /*let's first read the number of elements in this vector ! */
        System.out.print("Please, set the number of elements : ");
        int nb_elem =scanner.nextInt();
        for (int i=0;i<nb_elem;i++){
            System.out.print("V [ "+i+" ] = ");
            int element = scanner.nextInt();
            V[i]=element;
        }
        /*Now, let's find the max ! "*/
        int max=V[0];
        for (int i=1;i<nb_elem;i++){
            if (V[i]>max)
                max =V[i];
        }
        System.out.println("The max is : "+ max);

    }
}