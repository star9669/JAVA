import java.io.*;
import java.util.Scanner;
public class Employee {
    int id;
    String name, deptname;
    float salary;
    static int cnnt=0;
    Scanner sc=new Scanner(System.in);

    Employee(){
        id=11;
        name="Pramod";
        deptname="Clark";
        salary=20000f;
        cnnt++;
    }

    public Employee(int id,String name,String deptname, float salary){
    this.id=id;
    this.name=name;
    this.deptname=deptname;
    this.salary=salary;
    cnnt++;
    }

    void displaydata(){
        System.out.println(id+" \t "+name+" \t "+deptname+" \t "+salary);

    }

    public static void main(String args[]){
        Employee e1=new Employee();
        Employee e2= new Employee(12,"ram","Ex-manager",70000f);
        Employee e3= new Employee(13,"Krushna","Manager",80000f);
        Employee e4= new Employee(14,"Amit","Producer",30000f);
        Employee e5= new Employee(15,"Harsh","Director",50000f);


        System.out.println("ID"+"\t"+ "Name"+"\t"+"Dept Name"+"\t"+"Salary");
        System.out.println("- - - - - - - - - - - - - - - - - - - ");
        e1.displaydata();
        e2.displaydata();
        e3.displaydata();
        e4.displaydata();
        e5.displaydata();
        System.out.println("\n");
        System.out.println(e5.cnnt+" objects are created.");

    }
}
