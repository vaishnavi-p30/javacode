import java.util.Scanner;
public class TitleCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] word=str.split(" ");
        String result=" ";
        for(int i=0;i<word.length;i++){
         result+=word[i].substring(0,1).toUpperCase()+word[i].substring(1).toLowerCase()+" ";
        }
        System.out.print(result.trim());
    }
}