import java.util.Scanner;
public class SecondlargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int secondlargest=0;
        int largest=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>largest){
                    secondlargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]>secondlargest && arr[i]!=largest){
                    secondlargest=arr[i];
                }
                
            }
        }
        System.out.print(secondlargest+" ");
    }
}
