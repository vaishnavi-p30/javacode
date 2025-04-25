import java.util.Scanner;
public class VowelsCount{
    public static void main(String[] args){
        String str="vaishnavi";
        int vowelcount=0;
        int consonantscount=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A' || ch=='a' || ch=='E' || ch=='e'
            || ch=='I' ||ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
                vowelcount ++;
            }
            else if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z'){
            consonantscount++;
        }
            System.out.print(ch);
        }
        System.out.println("\nNumber of vowel count:"+vowelcount);
        System.out.print("Number of consonants count:"+consonantscount);
        
    }
}

