import java.util.Scanner;
public class MaxProduct{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int maxproduct=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int product=arr[i]*arr[j];
                if(product>maxproduct){
                    maxproduct=product;
                }
            }
        }
        System.out.print(maxproduct+" ");
    }
    
}
