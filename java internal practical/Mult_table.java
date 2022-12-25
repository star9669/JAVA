public class Mult_table {
    public static void main(String args[]){
       System.out.println("\tTable From 1 to 15 ");
        for(int i=1;i<=10;i++){
            for(int j=1;j<=15;j++){
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}
