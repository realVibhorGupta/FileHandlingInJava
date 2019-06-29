package FileHandling;
import java.io.*;
public class BufferedReader1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("vibhor2.txt"));
		String line=br.readLine();
		
		while(line != null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
