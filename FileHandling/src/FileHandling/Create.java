package FileHandling;

import java.io.File;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File f=new File("WebServices");
			System.out.println(f.exists());
			f.mkdir();
			System.out.println(f.exists());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	

}
