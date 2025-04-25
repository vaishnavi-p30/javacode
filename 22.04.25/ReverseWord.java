import java.util.Scanner;
public class ReverseWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  sentence =sc.nextLine();
        String[] word=sentence.split("");
        for(int i=word.length-1;i>=0;i--){
            System.out.print(word[i]);
            if(i!=0){
                System.out.print("");
            }
        }
    }
}