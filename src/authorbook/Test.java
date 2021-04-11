package authorbook;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		boolean go = true;
		while (go) {
			System.out.println("Enter your choice(1,2,3 or -1) :" + "\n 1 - Save a Book " + "\n 2 - Calculate royalties"
					+ "\n 3 - Display a book" + "\n -1 - stop");
			choice = scanner.nextInt();
			if (choice == 1) {
				BookTester.bookList.add(BookTester.getBook());

			} else if (choice == 2) {
				scanner = new Scanner(System.in);
				System.out.println("Enter a book title :");
				String booktitle = scanner.nextLine();

				if (BookTester.searchBook(booktitle) != -1) {
					System.out.println("Quantity :");
					int Quantity = scanner.nextInt();
					BookTester.bookList.get(BookTester.searchBook(booktitle)).setQuantitySold(Quantity);

					System.out.println("position is :" + BookTester.searchBook(booktitle));
					System.out.println("Quantity of book : "
							+ BookTester.bookList.get(BookTester.searchBook(booktitle)).quantitySold);
					System.out.println("Royalties : R"
							+ BookTester.bookList.get(BookTester.searchBook(booktitle)).calcRoyalties());

				} else {
					System.err.println("Book does not exist");
				}

			} else if (choice == 3) {
				System.out.println("------ Display Book ------ ");
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a book title :");
				String booktitle = scan.nextLine();
				
				if (BookTester.searchBook(booktitle) != -1) {

					System.out.println("Title : " + BookTester.bookList.get(BookTester.searchBook(booktitle)).getTitle());
					System.out.println(BookTester.bookList.get(BookTester.searchBook(booktitle)));
				} else {
					System.err.println("Book does not exist");
				}
			} else if (choice == -1) {
				
				
				try {
			        FileWriter writer = new FileWriter("Book.txt", true);
			        for (int i = 0; i < BookTester.bookList.size(); i++) {
			           
			                writer.write(BookTester.bookList.get(i).toString());
			                writer.write("\r\n");   
			        }
			        
			        writer.close();
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
				
				go = false;
			}

		}
	}
}
