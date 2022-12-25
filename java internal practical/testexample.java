import java.util.Scanner;

public class testexample {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the number : ");
        int n=sc.nextInt();

        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f); */

       /* double r,h;
        float PI=3.14f;
        System.out.println("Enter the radius : ");
        r=sc.nextDouble();
        System.out.println("Enter the height : ");
        h=sc.nextDouble();
        double formula=PI*r*r+h;
        System.out.println("Volume of cylinder is : "+formula); */

        int num, originalNumber,remainder,result=0;
        System.out.println("Enter the number :");
        num=sc.nextInt();
        originalNumber=num;
        while (originalNumber!= 0){
            remainder=originalNumber % 10;
            result+=Math.pow(remainder,3);
            originalNumber/=10;
        }
        if (result==num){
            System.out.println(num+" is Armstrong number.");
        }
        else {
            System.out.println(num+ " is not an Armstrong number.");
        }
    }
}