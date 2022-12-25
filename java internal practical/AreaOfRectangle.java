import java.util.Scanner;

class perimeter{
    double length;
    double breadth;

    void data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle :");
        length=sc.nextDouble();
        System.out.println("Enter the breadth of the Rectangle :");
        breadth=sc.nextDouble();
    }

    void areaofrect(){
        System.out.println("Area of rectangle is : "+length*breadth);
    }
    void findperimeter(){
        double p=2*(length+breadth);
        System.out.println("perimeter of rectangle is : " + p);
    }
}

class AreaOfRectangle{
    public static void main(String args[]){
        perimeter p1=new perimeter();
        p1.data();
        p1.areaofrect();
        p1.findperimeter();
    }
}