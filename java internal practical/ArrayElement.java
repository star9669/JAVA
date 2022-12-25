
import java.util.*;
class ArrayElement
{
    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5,90,80,40,55,22,11,33,88,121,10,100};
        System.out.println("Array :-");
        for (int i=0;i<num.length;i++){
            System.out.format("%d\t",num[i]);
        }
        int Find;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the number you want to find in the array :- ");
        Find=sc.nextInt();
        boolean found=false;
        for(int n:num){
            if(n==Find){
                found=true;
                break;
            }
        }
        if(found)
            System.out.println(Find+" is found in the array.");
        else
            System.out.println(Find+" is not found in the array");
    }
}