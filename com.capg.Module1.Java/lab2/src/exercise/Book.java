package exercise;

public class Book extends WrittenItem
{
	public Book(String uID, String title, int numberOfCopies, String author) {
		super(uID, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}
	void printDetails()
	{   super.printDetails();
		System.out.print("Author: "+getAuthor());
	}
}
