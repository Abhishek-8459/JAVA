import java.io.*;
import java.util.Scanner;

public class exp8 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fr = new FileWriter("Student_database.txt",true);
        BufferedWriter br = new BufferedWriter(fr);
        String name;
        int rollno;
        int marks;
        String address;
        String ch ="n";
        do{
            System.out.print("Enter name of the student: ");
            name=sc.next();
            System.out.print("\nEnter roll no of student: ");
            rollno=sc.nextInt();
            System.out.print("\nEnter marks of student: ");
            marks=sc.nextInt();
            System.out.print("\nEnter address of the student: ");
            address=sc.next();
            br.write("rollno: "+rollno);
            br.newLine();
            br.write("name: "+name);
            br.newLine();
            br.write("marks: "+marks);
            br.newLine();
            br.write("address: "+address);
            br.newLine();
            System.out.println("data added successfully");
            System.out.println("Want to add more data?");
            ch = sc.next();

        }while(ch.equals("y"));

        System.out.println("Select an opreation to preform\n1.display\n2.clear\n3.search\n4.modify\n5.exit");
        do{
            int n = sc.nextInt();
            switch(n){
                case 1: display();break;
                case 2: clear();break;
                case 3:
                    System.out.println("Enter roll no to search: ");
                    int ro = sc.nextInt();
                    search(ro); break;
                case 4:
                    System.out.println("Enter roll no to search: ");
                     ro = sc.nextInt();
                    mod(ro); break;
            }
        }
        br.close();
        fr.close();
    }
   static void display(){
        try {
            FileReader fr = new FileReader("Student_database.txt");
            BufferedReader br = new BufferedReader(fr);
            String rollno;
            while((rollno=br.readLine())!=null){
                System.out.println("**********");
                System.out.println(rollno);
                System.out.println(br.readLine());
                System.out.println(br.readLine());
                System.out.println(br.readLine());
            }
            br.close();
            fr.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static void clear() {
        try {
            FileWriter fr = new FileWriter("Student_database", false);
            fr.close();
            System.out.println("All data cleared");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    static void search(int roll){
        try {
            FileReader fr = new FileReader("Student_database");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line= br.readLine())!=null){
                if(line.contains("rollno: "+roll)){
                    System.out.println("data found");
                    System.out.println(line);
                    System.out.println(br.readLine());
                    System.out.println(br.readLine());
                    System.out.println(br.readLine());
                    break;
                }
            }
            br.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    static void mod(int roll){
        try {
            FileReader fr = new FileReader("Student_database");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line= br.readLine())!=null){
                if(line.contains("rollno: "+roll)){
                    System.out.println("Enter the new fields: ");

                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }


}
