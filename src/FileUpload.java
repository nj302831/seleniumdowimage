import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TS\\\\browserDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://techstalwarts.com/contact-us/");

		JavascriptExecutor js = (JavascriptExecutor) driver; // Scrolling using JavascriptExecutor
		js.executeScript("window.scrollBy(0,500)"); // Scroll Down
		Thread.sleep(2000);
		
//	driver.findElement(By.xpath("//*[@id=\"cname\"]")).sendKeys("nikita");		
//      driver.findElement(By.xpath("//*[@id=\"cemail\"]")).sendKeys("nikita.jain@techstalwarts.com");
//      driver.findElement(By.xpath("//*[@id=\"cmno\"]")).sendKeys("8269709975");
//      driver.findElement(By.xpath("//*[@id=\"chelpmsg\"]")).sendKeys("Completed");

		WebElement browse = driver.findElement(By.xpath("//*[@id=\"file\"]"));
	browse.sendKeys("C:\\Users\\TS\\nikita.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contact\"]")).click();
		Thread.sleep(2000);
//		driver.close();

		System.out.println("File is Uploaded Successfully");

	}

}
