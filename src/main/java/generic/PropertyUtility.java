package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	public String getDataFromProperty(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream(IConstantUtility.propertyPath);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(data);
		return value;
	}

}
