import java.util.Scanner;

public class menu_driven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int choice;

        while (true){

            System.out.println("Press 1 for calculate volume of cylinder :- ");
            System.out.println("Press 2 for find factorial of a given number :- ");
            System.out.println("Press 3 for check number is armstrong or not :- ");
            System.out.println("Press 4 for Quit\n\n");

            System.out.println("Enter your choice :- ");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    double r,h;
                    float PI=3.14f;
                    System.out.println("Enter the radius : ");
                    r=sc.nextDouble();
                    System.out.println("Enter the height : ");
                    h=sc.nextDouble();
                    double formula=PI*r*r+h;
                    System.out.println("Volume of cylinder is : "+formula);
                    break;

                case 2:
                    System.out.println("Enter the number : ");
                    int n=sc.nextInt();

                    int f=1;
                    for(int i=1;i<=n;i++){
                        f=f*i;
                    }
                    System.out.println(f);
                    break;

                case 3:
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
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!!! Please make a valid choice.\\n\\n");
                   // System.exit(0);

            }
        }





    }
}
