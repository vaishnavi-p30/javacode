import java.util.Scanner;
public class Largestwordstring{
    public static void main(String[] args){
        String str="the java program";
        String largest=" ";
        String[] word=str.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].length()>largest.length()){
                largest=word[i];
            }
        }
            System.out.print("the largest word:"+largest);
    }
}


