package FileHandling;
import java.io.*;
public class FileReader3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f =new File("vibhor.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		fr.close();
	}

}
