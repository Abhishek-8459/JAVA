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

        br.close();
        fr.close();
        int z=1;
        do{
            System.out.println("Select an opreation to preform\n1.display\n2.clear\n3.search\n4.modify\n5.exit");
            int n = sc.nextInt();
            switch(n){
                case 1: display();break;
                case 2: clear();break;
                case 3:
                    System.out.println("Enter roll no to search: ");
                    int ro = sc.nextInt();
                    search(ro); break;
                case 4:
                    System.out.println("Enter roll no to modify: ");
                     ro = sc.nextInt();
                    mod(ro); break;
                case 5:
                    z=0;
                    break;
            }
        }while(z!=0);

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
            FileReader fr = new FileReader("Student_database.txt");
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
            Scanner sc  = new Scanner(System.in);
            FileReader fr = new FileReader("Student_database.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("copy.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String line;
            while((line= br.readLine())!=null){
                if(line.contains("rollno: "+roll)){
                    System.out.println("Enter the new fields: ");
                    System.out.print("Enter name of the student: ");
                    String name=sc.next();
                    System.out.print("\nEnter marks of student: ");
                    int marks=sc.nextInt();
                    System.out.print("\nEnter address of the student: ");
                    String address=sc.next();
                    bw.write(line);
                    bw.newLine();
                    bw.write("name: "+name);
                    bw.newLine();
                    bw.write("marks: "+marks);
                    bw.newLine();
                    bw.write("address: "+address);
                    bw.newLine();
                    br.readLine();
                    br.readLine();
                    br.readLine() ;

                }
                else{
                    bw.write(line);
                    bw.newLine();
                    bw.write(br.readLine());
                    bw.newLine();

                    bw.write(br.readLine());
                    bw.newLine();

                    bw.write(br.readLine());
                    bw.newLine();


                }
            }
            System.out.println("data udated successfully");
            bw.flush();
            fr.close();br.close();
            fw.close();bw.close();
            File originalFile = new File("Student_database.txt");
            File newFile = new File("copy.txt");
           if( originalFile.delete()) {
               if (newFile.renameTo(originalFile)) {
                   System.out.println("File renamed successfully!");
               } else {
                   System.out.println("Failed to rename the file.");
               }
           }
           else {
               System.out.println("failed to delete file");
           }



        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
