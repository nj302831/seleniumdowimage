import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class screensort {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\TS\\browserDriver\\chromedriver_win32\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//	driver.get("https://techstalwarts.com");
	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String RS = RandomString.make();
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\TS\\screensort" + RS + ".jpg");
		Files.copy(source, dest);  
//		driver.close();
	System.out.println("-------Process end-------");
	
//	File screenshotLocation = new File("C:\\Users\\TS\\page1sort.png");
//    FileUtils.copyFile(source, screenshotLocation);
////
//    String excelPath = "C:\\Users\\TS\\exceldata\\SaveData.xlxs";
//   File file = new File(excelPath);
//   WritableWorkbook wbook = Workbook.createWorkbook(file);
//    WritableSheet wsheet = wbook.createSheet("Seeds", 0);
////
////    **Label lab = new Label(0, 0, );**
////
//    wsheet.addCell(lab);
//    wbook.write();
//    wbook.close();
////						
	}

}
