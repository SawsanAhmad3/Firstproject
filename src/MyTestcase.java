import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcase {
WebDriver driver=new ChromeDriver();
@BeforeTest

public void sitUp() {
driver.get("http://127.0.0.1:5500/index.html");
}
@Test ()  

public void myFirstTest() throws InterruptedException {

driver.findElement(By.name("inputForTheName")).sendKeys("ahmad");
driver.findElement(By.name("inputForThePassword")).sendKeys("ahmadgggf");
driver.findElement(By.name("InputForTheEmail")).sendKeys("ahmadgg@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("submitButtonsoso")).click();

}
@AfterTest
public void postTesting(){


}
 
}
