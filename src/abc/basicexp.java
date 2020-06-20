package abc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class basicexp 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("abcd.properties");
		
		Properties properties=new Properties();
		properties.load(fis);
		
		String val = properties.getProperty("url");
		System.out.println(val);
		/*
		WebDriver webdriver=new WebDriver();
		driver.get(val);
		
		String take=properties.getProperty("takescreenshot");
		System.out.println(take);
		if (take.equals("Y")) {
			
			//take screenshot
		}*/
		
		/*int a = 0;
		while ((a = fis.read())!=-1) 
		{
			char cc = (char) a;
			System.out.println(cc);
		}*/
		
		/*int y =fileInputStream.read();
		char cc=(char)y;
		System.out.println(cc);
		System.out.println(y);

		int y1 =fileInputStream.read();
		char cc1=(char)y1;
		System.out.println(cc1);
		System.out.println(y1);

		int y2 =fileInputStream.read();
		char cc2=(char)y2;
		System.out.println(cc2); 
		System.out.println(y2);

		int y3 =fileInputStream.read();
		char cc3=(char)y3;
		System.out.println(cc3);
		System.out.println(y3);*/

	}
}
