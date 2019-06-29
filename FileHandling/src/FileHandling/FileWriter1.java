package FileHandling;

import java.io.*;

public class FileWriter1 {


			// TODO Auto-generated constructor stub


	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//FileOutputStream fw=new FileOutputStream("vibhor.txt");
		FileWriter fw=new FileWriter("vibhor.txt",true);
		 fw.write(100);
		fw.write("abc \n bcs \n vibhor gupta");
		fw.write('\n');
		char[] ch={'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
		
		
		
		
	
			
		
	}

}
