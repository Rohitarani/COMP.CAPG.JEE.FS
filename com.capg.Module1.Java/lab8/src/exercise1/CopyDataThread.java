package exercise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread {

	File source,target;

	public CopyDataThread(File source,File target) {
		this.source=source;
		this.target=target;
		start();
	}

	public void run() {
		try {
			FileReader readerObj=new FileReader(source);
			FileWriter writerObj=new FileWriter(target);
			
			int content=readerObj.read();
			int count=0;
			while(content!=-1) {
				if(count>0) {
					writerObj.write(content);
					content=readerObj.read();
					count--;
				}
				else {
					count=10;
					System.out.println("10 haracters copied.");
					sleep(10000);
					
				}
			}
			readerObj.close();
			writerObj.close();
		
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Copied");
		
	}
	}

