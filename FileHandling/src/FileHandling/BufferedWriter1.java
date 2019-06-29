package FileHandling;
import java.io.*;
public class BufferedWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw =new FileWriter("vibhor2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(120);
		bw.newLine();
		char[] ch={'v','i','b','h','o','r'};
		bw.write(ch);
		bw.newLine();
		bw.write("gupta");
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}
