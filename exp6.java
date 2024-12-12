import java.util.Scanner;

class AE{
    Scanner sc = new Scanner(System.in);
    int a ;
    int b;

    void perform(){
        try{

            System.out.println("enter first number");
            a= sc.nextInt();
            System.out.println("enter second number");
            b= sc.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
class AIOOB{
    Scanner sc = new Scanner(System.in);

   void accept() {
       try {


           System.out.println("Enter the size of the array");
           int n = sc.nextInt();
           int[] arr = new int[n];
           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
           }
           System.out.println("enter the element of the array to access");
           n = sc.nextInt();
           System.out.println(arr[n]);
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);

       }
   }

}
public class exp6 {
    public static void main(String[] args) {
        System.out.println("select an exception to perform\n1.Arithmetic exception\n2.Array index Out Of Bounds Exception\n3.Number format Exception");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1: AE a = new AE();
                        a.perform();
                        break;
            case 2: AIOOB ai = new AIOOB();
                        ai.accept();
                        break;
            case 3:try{
                System.out.println("Enter the Numbers");
                String s = sc.next();
                String b = sc.next();
                int num1 = Integer.parseInt(s);
                int num2= Integer.parseInt(b);
                System.out.println("the numbers are:"+num1+" and "+num2);
                break;
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
        }
    }
}
