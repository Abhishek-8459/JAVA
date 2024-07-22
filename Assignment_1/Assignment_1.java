package Assignment_2;
import java.util.Scanner;
class Complex{

    int realpart;
    int imaginarypart;

    int realpart1;
    int imaginarypart1;
    Complex(int i , int j ,int k ,int h){
        this.realpart=i;
        this.imaginarypart=j;
        this.imaginarypart1=h;
        this.realpart1=k;
    }

    void add(){
        System.out.println("The complex 1st number is:  "+realpart+"+i"+imaginarypart);
        System.out.println("The complex 2st number is:  "+realpart1+"+i"+imaginarypart1);
        System.out.println("Addition of both the complex numbers is: "+(realpart+realpart1)+"+i"+(imaginarypart+imaginarypart1));
    }

    void multiply(){
        System.out.println("The complex 1st number is:  "+realpart+"+i"+imaginarypart);
        System.out.println("The complex 2st number is:  "+realpart1+"+i"+imaginarypart1);
        System.out.println("Addition of both the complex numbers is: "+(realpart*realpart1)+"+i"+(imaginarypart*imaginarypart1));
    }


}
public class Assignment_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first number ");
        int i = sc.nextInt();
        System.out.println("Enter imaginary part of first number ");
        int j = sc.nextInt();
        System.out.println("Enter real part of second number ");
        int k = sc.nextInt();
        System.out.println("Enter imaginary part of second number ");
        int h = sc.nextInt();
        Complex c = new Complex(i,j,k,h);
        c.add();
        c.multiply();
    }

}
