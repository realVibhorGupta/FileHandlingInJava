package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryCWD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		File f=new File("Helo");
		f.mkdir();
		//File f1=new File("Hello","vibhor.txt");
		File f1=new File(f,"vibhor.txt");
		f1.createNewFile();
		File f2=new File("C:\\Users","EXAMPLE.txt");
		
		f2.createNewFile();
		long l=f1.length();//length of the file
		System.out.println(l);
		String[] s=f.list();//list of the txt files in the directory
		System.out.println(s);//gives the hash code of the address of the file.. 
		for(String s1:s)
		{
			count++;
		System.out.println(s1);
		}
		System.out.println("total number: "+count);
		
	}

}
