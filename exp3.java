import java.util.Scanner;

abstract class employee{
    Scanner sc = new Scanner(System.in);
    String emp_name;
    int  emp_id;
    String email_id;
    String add;
    int mobile_no;
    abstract void get_data();
    abstract void display();
    abstract void calculate_salary();
    abstract void salary_slip();
    
}

class programmer extends employee{
    double basic_pay,gross,net_salary;
    double da = 97,hra=10,pf=12,scf=0.1;

    void get_data(){
        System.out.println("Enter Name of programmer");;
        emp_name=sc.next();
        System.out.println("enter email id of programmer");;
        email_id= sc.next();
        System.out.println("Enter employee id ");
        emp_id=sc.nextInt();
        System.out.println("Enter Mobile Number");
        mobile_no=sc.nextInt();
        System.out.println("Enter Basic Pay of Programmer");
        basic_pay=sc.nextDouble();
    }
     void calculate_salary(){
       gross=basic_pay+(basic_pay*(da+hra))/100;
       net_salary=gross-(basic_pay*(pf+scf))/100;
    }
    void display(){
        System.out.println("***********************************************************************");
        System.out.println("Emp_name\tEmp_id\tMobile_no\tEmail_address1");
        System.out.println("***********************************************************************");
        System.out.println(emp_name+"\t"+emp_id+"\t"+mobile_no+"\t"+email_id);
        System.out.println("***********************************************************************");
    }
    void salary_slip(){
        System.out.println("Basic Pay                    :           "+basic_pay);
        System.out.println("Gross                        :           "+gross);
        System.out.println("Net                          :           "+net_salary);
        System.out.println("hra                          :           "+hra);
        System.out.println("pf                           :           "+pf+"\n");
        System.out.println("         ************* End of receipt ***************");
    }
}
public class exp3 {
    public static void main(String[] args) {
        employee prog = new programmer();
        prog.get_data();
        prog.calculate_salary();
        prog.display();
        prog.salary_slip();
    }
}
