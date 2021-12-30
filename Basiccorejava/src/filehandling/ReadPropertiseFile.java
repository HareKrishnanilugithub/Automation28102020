package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiseFile {

	public static void main(String[] args) throws IOException {
		//step1-filepath

  String filepath="C:\\Users\\Admin\\eclipse-workspace\\Basiccorejava\\src\\filehandling\\Users.propertise";
 // step-2
  FileInputStream file=new FileInputStream(filepath);
  
  
  Properties or= new Properties();
  or.load(file);
  System.out.println(or.get("surname"));
		
	}

}
