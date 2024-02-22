import java.io.*;
public class FileAvailable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[20];
		try {
			FileInputStream fis=new FileInputStream("input.txt");
			FileOutputStream fos=new FileOutputStream("output.txt");
			System.out.println("Bytes available: "+fis.available());
			int count=0; int read=0;
			while((read=fis.read(b))!=-1) {
				fos.write(b);
				count+=read;
			}
			System.out.println("Total Count: "+count);
			fis.close();
			fos.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
