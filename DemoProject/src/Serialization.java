import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class Serialization {
	public static void main(String args[]) {
		Employee object=new Employee(1,"Ram");
		String filename="file.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serializable");
		}
		catch(IOException e) {
			System.out.println(e);
			}
	}

}
