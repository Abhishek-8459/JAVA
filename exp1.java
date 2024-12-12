//complex number operations
import java.util.Scanner;
class complex{
    Scanner sc = new Scanner(System.in);

    int r1;
    int i1;
    int r2;
    int i2;
    public complex(){
        r1=i1=r2=i2=0;
    }
    void accept(){
        System.out.println("enter the first number real part");
        r1=sc.nextInt();
        System.out.println("enter the first number imaginary part");
        i1=sc.nextInt();
        System.out.println("enter the second number real part");
        r2=sc.nextInt();
        System.out.println("enter the second number real part");
        i2=sc.nextInt();
    }
    String display(int a , int b){
        if(b>0) {
            return (a) + "+i" + (b);
        }
         return (a) + "-i" + Math.abs((b));
    }
    void display(){

        System.out.println("The First number is: "+r1+"+i"+i1);
        System.out.println("The Second number is: "+r2+"+i"+i2);

    }
    void add(){

        System.out.println("The addition of the complex number is: "+(display(r1+r2,i1+i2)));
    }
    void sub(){

        System.out.println("The subtraction of the complex number is: "+(display(r1-r2,i1-i2)));
    }
    void multiply(){
        System.out.println("The subtraction of the complex number is: "+(display(r1*r2,i1*i2)));
    }
    void opreation(){
        int n = -1;
        System.out.println("Enter opreation to perform:\n1.Add\n2.subtract\n3.Multiply\n4.exit");
        n=sc.nextInt();
        switch (n){
            case 1: add();opreation();break;
            case 2: sub();opreation();break;
            case 3: multiply();opreation();break;
            case 4: break;
            default:
                opreation();
        }
    }


}
public class exp1 {
    public static void main(String[] args) {
        complex c = new complex();
        c.accept();
        c.display();
        c.opreation();
    }
}
