package ReadDataFromExternalFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFromPropertiesFile {
	public String readDataFromPropertyFile(String key) throws Exception {
		FileInputStream fis=new FileInputStream("./testData/ConfigrationData.properties");
		Properties prp=new Properties();
		prp.load(fis);
		
		String value=prp.getProperty(key);
		return value;                      
	}
}
