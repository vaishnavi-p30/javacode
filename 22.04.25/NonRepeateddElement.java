import java.util.Scanner;
public class NonRepeateddElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
         boolean isUnquie=true;
         for(int j=0;j<str.length();j++){
             if(i!=j && str.charAt(i)==str.charAt(j)){
                 isUnquie=false;
                 break;
             }
            }
             if(isUnquie){
                 System.out.print(str.charAt(i));
                 return;
             }
         }
             System.out.print("Non duplicate Element");
        
    }
}

