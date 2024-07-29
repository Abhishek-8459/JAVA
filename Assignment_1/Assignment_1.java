package Assignment_1;
import java.util.Scanner;
import java.util.SortedMap;

//Assignment no. 1 : To perform various mathematical opreations on complex numbers
class Opreations{
    Scanner sc = new Scanner(System.in);
    int real1;
    int imaginary1;
    int real2;
    int imaginary2;
    void accept(){
        System.out.print("Enter the real part of first number: ");
        real1=sc.nextInt();
        System.out.println();
        System.out.print("Enter the imaginary part of first number: ");
        imaginary1=sc.nextInt();
        System.out.println();
        System.out.print("Enter the real part of second number: ");
        real2= sc.nextInt();
        System.out.println();
        System.out.print("Enter the imaginary part of second number: ");
        imaginary2= sc.nextInt();
        System.out.println();
    }

    void display(){
        System.out.println("The first complex number is:"+real1+"+i"+imaginary1);
        System.out.println("The second complex number is:"+real2+"+i"+imaginary2);

    }
    void add(){
        System.out.println("The addition of the complex number is: "+(real1+real2)+"+i"+(imaginary1+imaginary2));
    }

    void subtract(){
        System.out.println("The Subtraction of the complex number is: "+(real1-real2)+"+i"+(imaginary1-imaginary2));

    }

    void multiplication(){
        System.out.println("The Multiplication of two complex numbers is: "+(real1*real2 - imaginary1*imaginary2) + "+i"+(real1*imaginary2 + imaginary1*real2));
    }

    void division(){
        System.out.println("The division of the complex number is: "+(real1*real2+imaginary1*imaginary2)/(real2*real2+imaginary2*imaginary2)+"+i"+((imaginary1*real2-real1*imaginary2)/(real2*real2+imaginary2*imaginary2)) );
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Opreations S = new Opreations();
        S.accept();
        S.display();
    Scanner sc = new Scanner(System.in);
        System.out.println("Select an opreation to perform");
        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.All Opreations\n");
        System.out.print("Enter your choise: ");
        int n = sc.nextInt();
        System.out.println();

        switch (n){
            case 1:
                S.add();
                break;
            case 2:
                S.subtract();
                break;
            case 3:
                S.multiplication();
                break;
            case 4:
                S.division();
                break;
            case 5:
               S.add();
               S.subtract();
               S.multiplication();
               S.division();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
