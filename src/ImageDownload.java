import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageDownload {

	public static void main(String[] args) throws InterruptedException, IOException, NullPointerException {

		System.setProperty("webdriver.chrome.driver",	"C:\\Users\\TS\\browserDriver\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
       driver.get("https://techstalwarts.com");
    	driver.manage().window().maximize();
  	Thread.sleep(2000);
  	

	URL imageURL =new URL("https://techstalwarts.com/img/Logo.png");
	BufferedImage saveImage =ImageIO.read(imageURL);
	ImageIO.write(saveImage, "png", new File("C:\\Users\\TS\\eclipse-workspace\\SeleniumDemo\\resources\\Imagefile.png"));






	}

}
