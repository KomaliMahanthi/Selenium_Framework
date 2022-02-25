package Package;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Scroll {
	WebDriver driver;
	
	String url = "http://demo.guru99.com/test/guru99home/";
	
	@Before
	public void setUp()throws Exception{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);


	}

	@Test
	public void testScroll() throws Exception{

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("window.scrollTo(0,1500)"); //window scroll to this location
		
        executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");  //scroll to the bottom of the page
		Thread.sleep(2000);
		}
	
	
	@After
	public void tearDown()throws Exception{

		    Thread.sleep(2000);
			driver.quit();
		}

}
