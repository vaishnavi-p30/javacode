import java.util.Scanner;
public class SubstringOfAnotherstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String mainstring=sc.nextLine();
        String substring=sc.nextLine();
        if(mainstring.contains(substring))
        {
            System.out.print("yes it is an Substring");
        }
        else{
            System.out.print("Not a Substring");
        }
    }
}
