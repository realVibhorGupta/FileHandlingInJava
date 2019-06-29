package FileHandling;
import java.io.*;
public class FileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr =new FileReader("vibhor.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);//typecasting is done otherwise it  will print unicode  value
			i=fr.read();
			
		}
		fr.close();

	}

}
