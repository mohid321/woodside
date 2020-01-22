import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kamrul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAKIB\\eclipse-workspace\\Elmhurst\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/");


driver.findElement(By.name("txtUsername")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
System.out.println(driver.getTitle());
driver.findElement(By.id("welcome")).click();
driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
System.out.println(driver.getTitle());
driver.close();
		
	}

}
