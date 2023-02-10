package selrevelion.com;

import com.utils.ConfigsReader;
import com.utils.Constants;

public class Test1 {
public static void main(String[] args) {
	
	//We have to create an object if its not static 
	/*Constants c = new Constants();
	String path=c.CHROME_DRIVER_PATH;*/
	
	
	//If it is static we do not need to create an object
	
ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

System.out.println();
String browser = ConfigsReader.getProperty("browser");
System.out.println("browser -> " + browser);

System.out.println("url -> " + ConfigsReader.getProperty("url"));
	
}
}
