package exercise;

public abstract class WrittenItem extends Item{
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem(String uID, String title, int numberOfCopies,String author) {
		super(uID, title, numberOfCopies);
		this.author=author;
		// TODO Auto-generated constructor stub
	}
	public boolean equalsAuthor(String author)
	{
		if(this.author==author)return true;
		return false;
	}
	void printDetails()
	{   System.out.println("Written Item details: ");
		System.out.print("Title: "+getTitle()+" Unique Id: "+getuID()+" Author: "+getAuthor()+" ");
	}
}
