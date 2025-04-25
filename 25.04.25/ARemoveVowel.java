import java.util.Scanner;
public class ARemoveVowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             if (ch != 'A' && ch != 'a' &&
                ch != 'E' && ch != 'e' &&
                ch != 'I' && ch != 'i' &&
                ch != 'O' && ch != 'o' &&
                ch != 'U' && ch != 'u'){
            System.out.print(ch+"");
                }
        }
    }
}


