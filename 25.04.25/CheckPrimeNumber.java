import java.util.Scanner;
public class CheckPrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrimeNumber(n)){
            System.out.println("Yes it is prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    public static boolean isPrimeNumber(int n){
        if(n<=1){
            return false;
    }
    for(int i=0;i<n;i++){
        if(n%2==0){
        }
    }
        return true;
  }
}

