import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver; 
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
public class exam {
	


		String myWebSite = "https://magento.softwaretestingboard.com/";


		
		WebDriver driver = new ChromeDriver();

		@BeforeTest
		public void mySetup() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.manage().window().maximize();
			driver.get(myWebSite);
		}

		@Test()
		public void LoginTest() throws InterruptedException {
			WebElement EmailInput = driver.findElement(By.xpath("//input[@id='email']"));
	//input[@id='email'])[1]"));
			WebElement PasswordInput = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));
			WebElement SignInButton = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));
			EmailInput.sendKeys("sss@gmail.com");
			PasswordInput.sendKeys("Password");
			SignInButton.click();}
			



@AfterTest
public void postTesting(){


}
 
}
