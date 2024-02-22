import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DriverstreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] byteData=new char[128];
		try {
			FileOutputStream fos=new FileOutputStream("input.txt");
			String str="my name is trisha";
			byte[] data=str.getBytes();
			fos.write(data);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
			
			
		}

	}


