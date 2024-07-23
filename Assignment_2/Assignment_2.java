
package Assignments;

import java.util.Scanner;





class Publication

{

	int copies;

	String title;

	int price;

	

	void accept() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Title: ");

		title = sc.nextLine();

		System.out.println("");

		System.out.print("Enter Numbers of copies: ");

		copies = sc.nextInt();

		System.out.println("");

		System.out.print("Enter the price: ");

		price = sc.nextInt();

		System.out.println("");

		

	}

		void display() {

			System.out.println("Title: "+title);

			System.out.println("Copies: "+copies);

			System.out.println("Price: "+price);

			

		

	}

		

}

class Book extends Publication

{

		private String author;

		int total ;

		

		void ordercopies() {

			 Scanner sr = new Scanner(System.in);

			 System.out.print("Enter Author name: ");

			 author = sr.nextLine();

			 System.out.println("");

			 System.out.println("Enter number of copies orderd: ");

			 total = sr.nextInt();

			 System.out.println("");





		}

		

	void remain() {

		System.out.println("The total sale of publication is: "+total);

		System.out.println("The stock of book remaining is is: "+ (this.copies-total));



		

	}

}

class Magzine extends Book

{

		int quantity;

		

		void orderquantity() {                                                                                                                                                                                                                                       

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of copies to order: ");

			quantity = sc.nextInt();

			System.out.println("");

		}

	void currentissue() {

		System.out.println("Currently issued book: "+super.title);

	}

	void reciveissue() {

		System.out.println("Recived Issued Book: "+super.title);

		System.out.println("Number of copies ordered are: "+this.quantity);

		

	}

//	Override

	public int saleCopy(int orders) {

		System.out.println("Total magzine"+ this.title +"sold"+orders );

		return orders;

	}



}

public class Assignment_2

{

public static void main(String[] args)

	{

	Publication P = new Publication();

	System.out.println("***Enter the publication details***");

	P.accept();

	System.out.println("***Displaying details of publication***");

	P.display();

	Book b = new Book();

	System.out.println("***Enter the Book details***");

	b.accept();

	b.ordercopies();

	 System.out.println("***Displaying Book Details");

	 b.display();

	

	 

	 Magzine m = new Magzine();

	 System.out.println("***Entering details of magzine***");

	 m.accept();

	 m.ordercopies();

	 m.orderquantity();

	 System.out.println("***Displaying magzine details***");

	 m.display();

	 System.out.println("***Displaying current issue of magzines***");

	 m.currentissue();

	 System.out.println("Displaying recive issue of magzines");

	 m.reciveissue();	

	 System.out.println("Displaying total sale of Publication: ");

	 b.remain();

	 

	}

}

