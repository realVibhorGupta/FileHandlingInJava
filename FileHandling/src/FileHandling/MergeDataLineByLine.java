package FileHandling;
import java.io.*;
public class MergeDataLineByLine {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("vibhor.txt");
		@SuppressWarnings("resource")
		BufferedReader br1=new BufferedReader(new FileReader("vibhor1.txt"));
		@SuppressWarnings("resource")
		BufferedReader br2=new BufferedReader(new FileReader("vibhor2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while((line1!=null) || (line2!=null))
		{
			if(line1!=null)
			{
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		pw.flush();
		pw.close();
	}

}
