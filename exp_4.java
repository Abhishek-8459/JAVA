import java.util.Scanner;

abstract class shape{
    Scanner sc = new Scanner(System.in);
    double length;
    double breadth;
    abstract void compute_area();


}
class rectangle extends shape{
    public rectangle(double len, double bre){
        length=len;
        breadth=bre;
    }
    void compute_area(){
        System.out.println( length*breadth);
    }
}
class triangle extends shape{

    public triangle(double len,double hei){
        length=len;
        breadth=hei;
    }
    void compute_area(){
        System.out.println((double) 1/2*(length*breadth)+"cm\u00B2");
    }
}
public class exp_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter figure of which area you want to find\n1.rectangle\n2.triangle");
        int n;
        n= sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter length of rectangle");
                int len = sc.nextInt();
                System.out.println("Enter breadth of the rectangle");
                int bre= sc.nextInt();
                shape rec = new rectangle(len , bre);
                rec.compute_area();

                break;
            case 2:
                System.out.println("Enter height of triangle");
                int hei = sc.nextInt();
                System.out.println("Enter base of the triangle");
                int base= sc.nextInt();
                shape tri = new triangle(hei , base);
                tri.compute_area();

                break;
            case 4:
                break;
            default:
                System.out.println("Enter valid operation");

        }



    }
}
