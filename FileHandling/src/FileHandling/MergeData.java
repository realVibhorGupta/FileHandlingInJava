package FileHandling;
import java.io.*;
public class MergeData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw =new PrintWriter("vibhor.txt");
		@SuppressWarnings("resource")
		BufferedReader bw=new BufferedReader(new FileReader("vibhor1.txt"));
		String line=bw.readLine();
		while(line!= null)
		{
			pw.println(line);
			line=bw.readLine();
		}
		bw=new BufferedReader(new FileReader("vibhor2.txt"));
		line=bw.readLine();
		while(line!= null)
		{
			pw.println(line);
			line=bw.readLine();
		}
		
		pw.flush();
		pw.close();
	}

}
