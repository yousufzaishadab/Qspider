package ABCD;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class FirstProject {

	public void launch()
	{
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("");
		Reporter.log(" Ferari lanched succesful",true);
		
	}
}
