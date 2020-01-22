package PackageRakibJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "./driver/.chromedriver.exe");
		WebDriver rakib = new ChromeDriver();
		
		rakib.get(url);

	}

}
