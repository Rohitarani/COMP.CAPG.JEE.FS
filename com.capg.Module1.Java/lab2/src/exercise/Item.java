package exercise;

public abstract class Item {
	private String uID;
	private String title;
	private int numberOfCopies;
	public Item(String uID, String title, int numberOfCopies) {
		super();
		this.uID = uID;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	public boolean equalsuID(String uID) 
	{
		if(this.uID==uID)return true;
		return false;
	}
	public boolean equalsTitle(String title)
	{
		if(this.title==title)return true;
		return false;
	}
	public boolean equalsNumberOfCopies(int numberOfCopies)
	{
		if(this.numberOfCopies==numberOfCopies)return true;
		return false;
	}
	public String toString() {
		return title.toString();
	}
	abstract void printDetails();
    
}
