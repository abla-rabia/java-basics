import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text,abla,newString="";
        int i,cmp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please set your text here :");
        text=scanner.nextLine();
        System.out.println("Please set your substring here : ");
        abla=scanner.nextLine();
        for (i=0;i< text.length();i++){
            newString= newString+text.charAt(i);
            if (newString.contains(abla)){
                cmp++;
                newString="";
            }
        }
        System.out.println("The number of occurrence of your substring in texte is : "+cmp);

    }
}