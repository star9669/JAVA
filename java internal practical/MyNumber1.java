import java.util.Scanner;
class MyNumber{
    private int num;
    MyNumber(){
        num=0;
    }

    MyNumber(int num){
        this.num=num;
    }
    void get(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        this.num=sc.nextInt();
    }
    void isPositive()
    {
        if(num>0)
        {
            System.out.println("Number "+num+" is positive");
        }
        else
        {
            System.out.println("Number "+num+" is not positive");
        }
    }
    void isNegative()
    {
        if(num<0)
        {
            System.out.println("Number "+num+" is negative");
        }
        else
        {
            System.out.println("Number "+num+" is not negative");
        }
    }
    void isZero()
    {
        if(num==0)
        {
            System.out.println("Number "+num+" is zero");
        }
        else
        {
            System.out.println("Number "+num+" is not zero");
        }
    }
    void isOdd()
    {
        if(num%2!=0)
        {
            System.out.println("Number "+num+" is odd");
        }
        else
        {
            System.out.println("Number "+num+" is not odd");
        }
    }
    void isEven()
    {
        if(num%2==0)
        {
            System.out.println("Number "+num+" is even");
        }
        else
        {
            System.out.println("Number "+num+" is not even");
        }
    }


}

public class MyNumber1{

    public static void main(String[] args){
        MyNumber m1=new MyNumber(5);
        m1.isPositive();
        m1.isNegative();
        m1.isZero();
        m1.isEven();
        m1.isOdd();
        MyNumber m2=new MyNumber();
        m2.get();
        m2.isPositive();
        m2.isNegative();
        m2.isZero();
        m2.isEven();
        m2.isOdd();

    }
}