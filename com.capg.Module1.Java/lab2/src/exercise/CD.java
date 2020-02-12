package exercise;

public class CD extends MediaItem
{
	private String genre;

	public CD(String uID, String title, int numberOfCopies, int runTime,String genre) {
		super(uID, title, numberOfCopies, runTime);
		// TODO Auto-generated constructor stub
		this.genre=genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	 void printDetails()
	 {
		 super.printDetails();
		 System.out.print("Genre: "+getGenre()+" ");
	 }
}
