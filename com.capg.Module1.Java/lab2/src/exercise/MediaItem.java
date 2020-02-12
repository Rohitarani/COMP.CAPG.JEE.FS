package exercise;

public abstract class MediaItem extends Item {
	private int runtime;
	public MediaItem(String uID, String title, int numberOfCopies,int runTime) {
		super(uID, title, numberOfCopies);
		this.runtime=runTime;
		// TODO Auto-generated constructor stub
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Media iten deatils: ");
		System.out.print("Title: "+getTitle()+" Unique Id: "+getuID()+" Run Time: "+getRuntime()+" ");
	}
}
