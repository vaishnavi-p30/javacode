import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        String str="madam";
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                
                System.out.println("No");
                return ;
            }
            
            i++;
            j--;
        }
        System.out.println("Yes");
    }
}


