import java.util.Scanner;
public class LargestSubString{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int maxlength=0,left=0; 
        boolean[] visited=new boolean[256];
        for(int right=0;right<str.length();right++){
            char currentcharacter=str.charAt(right);
            while(visited[currentcharacter]){
                visited[str.charAt(left)]=false;
                left++;
            }
            visited [currentcharacter]=true;
            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.print(maxlength);
        
    }
}