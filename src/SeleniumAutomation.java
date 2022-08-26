import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TS\\browserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.name("q").sendKeys("selenium"));
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Tech Stalwarts image");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.ENTER);
		
		//*[@id="_bUQHY-bPNIWBmgaJtoTQBw22"]/div[1]/div/div[1]/div[2]
		
//		driver.findElement(By.xpath("//*[@id=\"_bUQHY-bPNIWBmgaJtoTQBw22\"]/div[1]/div/div[1]/div[2]")).sendKeys(Keys.ENTER);
		
        driver.findElement(By.linkText("Images")).click();
        driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[2]/a[1]")).sendKeys(Keys.ENTER);
	}

}
