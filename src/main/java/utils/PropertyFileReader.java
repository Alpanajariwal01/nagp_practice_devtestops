package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static String getdata(String key) throws IOException {
		FileInputStream fs = new FileInputStream(
				new File("D:\\workspace\\NAGP\\selenium\\src\\main\\resources\\data.properties"));
		Properties prop = new Properties();// inbuilt object in java
		prop.load(fs);

		String getval = prop.getProperty(key);
		return getval;
	}
}
