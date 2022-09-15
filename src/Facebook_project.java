import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_project {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

System.setProperty("webdriver.chrome.driver", "C:\\Users\\TS\\browserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyjkhuz"); // using xpath
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("kkhiyh"); // using cla
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(30);

//		 driver.close();

	    String s1 = driver.getCurrentUrl();
	    System.out.println(s1);
         String s2 = driver.getTitle();
		 System.out.println(s2);

	}

}
