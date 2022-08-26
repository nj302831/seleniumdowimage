import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finalImageFolder {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TS\\browserDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://techstalwarts.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("img"));
		int count = 1;
		for (WebElement element : list) {
			String src = element.getAttribute("src");
			System.out.println(src);
			URL imageURL = new URL(src);
			// read image from given web URL
			BufferedImage saveImage = ImageIO.read(imageURL);
			// writing the image on desk
			ImageIO.write(saveImage, "jpg", new File(".jpg"));
			ImageIO.write(saveImage, "png",new File("C:\\Users\\TS\\eclipse-workspace\\SeleniumDemo\\resources\\Imagefile.png"));
			count++;
	// now we will click on that link
		}

	}

}
