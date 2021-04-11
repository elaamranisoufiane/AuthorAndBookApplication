package authorbook;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTester {
	static ArrayList<Book> bookList = new ArrayList<Book>();

	public static Author getAutor() {
		Author author = new Author();
		Scanner scanner = new Scanner(System.in);
		System.out.print("name :");
		author.setName(scanner.nextLine());
		System.out.print("affiliate  :");
		author.setAffiliation(scanner.nextLine());
		System.out.print("Email :");
		author.setEmailAddress(scanner.nextLine());
		
		return author;

	}

	public static Book getBook() {
		 Book finalBook = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type of book (type f:for Fiction ) (type n:for Non-Fiction ):");
		String test = scanner.nextLine();
		if (test.equals("f")) {
			System.out.println("------- Book details --------");
			System.out.println("enter title of book");
			String title = scanner.nextLine();
			System.out.println("------- Author details --------");
			Author author = getAutor();
			System.out.println("Targeted Audience (A) or chlid (C) book? : ");
			String targetAudience = scanner.nextLine();
			System.out.println("Selling price : ");
			float sellingPrice = scanner.nextFloat();
			
			Book book = new FictionBook(title,author, sellingPrice, targetAudience);
			finalBook= book;
		} else if (test.equals("n")) {
			System.out.println("------- Book details --------");
			System.out.println("enter title of book");
			String title = scanner.nextLine();
			System.out.println("------- Author details --------");
			Author author = getAutor();
			System.out.println("Selling price : ");
			float sellingPrice = scanner.nextFloat();
			System.out.println("Dewey Classfication: ");
			int deweyClassfication = scanner.nextInt();
			Book book = new NonFictionBook(title, author, sellingPrice, deweyClassfication);
			finalBook= book;
		}
		return finalBook;
	}

	public static int searchBook(String title) {
		int lookForBook = -1;
		for (int i = 0; i < bookList.size(); i++) {
			if ((bookList.get(i).getTitle()).equals(title) ) {
				lookForBook = i;
			} else {

			}

		}
		return lookForBook;
	}

}
