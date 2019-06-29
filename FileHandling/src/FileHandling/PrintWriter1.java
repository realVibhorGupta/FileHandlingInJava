package FileHandling;
import java.io.*;
public class PrintWriter1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		PrintWriter pw=new PrintWriter("vibhor1.txt");
		 pw.write(100);
		 pw.println(100);
		 pw.println('v');
		 String x="vibhor";
		 pw.println(x);
		 pw.flush();
		 pw.close();
		
	}

}
