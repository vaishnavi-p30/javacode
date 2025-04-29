import java.util.Scanner;
public class RemoveSpecialCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String cleanString=str.replaceAll("[^A-Za-z0-9]","");
        System.out.print(cleanString);
    }
}
