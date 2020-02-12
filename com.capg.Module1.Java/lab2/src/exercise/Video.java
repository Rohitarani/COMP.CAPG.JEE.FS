package exercise;

public class Video extends MediaItem {
	private String director;
    private String genre;
    private int year;
	public Video(String uID, String title, int numberOfCopies, int runTime,String director,String genre,int year) {
		super(uID, title, numberOfCopies, runTime);
		this.director=director;
		this.genre=genre;
		this.year=year;
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	void printDetails()
	{
		super.printDetails();
		System.out.print("Director: "+getDirector()+" Genre: "+getGenre()+" Year: "+getYear()+" ");
	}
	
}
