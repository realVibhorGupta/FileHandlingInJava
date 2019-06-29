package FileHandling;
import java.io.*;

public class CreateNewFile {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try{
		File f=new File("vibhor.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
