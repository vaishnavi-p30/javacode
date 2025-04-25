import java.util.Scanner;
public class RotationOfAnotherString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(isRotation(str1,str2)){
            System.out.println("Yes it is an rotation");
        }
        else
        {
           System.out.println("Not a roation"); 
        }
    }
        public static boolean isRotation(String str1,String str2){
            if(str1.length()!= str2.length() || str1.length()==0){
                return false;
            }
            String combined=str1+str1;
            return combined.contains(str2);
        }
}

