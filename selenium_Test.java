package javaInternship;    
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\Desktop\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://vprismqc.vidgyor.com/");
	Thread.sleep(5000);
	
	//Find Email Address,password and sign in.
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	WebElement username= (WebElement) jse.executeScript("return document.querySelector(\"#root > div > section > main > center > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"#email\")" );
	WebElement password = (WebElement) jse.executeScript("return document.querySelector(\"#root > div > section > main > center > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"#password\")");
	WebElement sign_in = (WebElement) jse.executeScript("return document.querySelector(\"#root > div > section > main > center > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > form > amplify-section > section > div:nth-child(4) > div > slot > div > slot > amplify-button > button\")");
	
	
	String js= "arguments[0].setAttribute('value','aayurotu@gmail.com')";
	String jst= "arguments[0].setAttribute('value','1@Aayushanand')";
	((JavascriptExecutor)driver).executeScript(js, username);
	((JavascriptExecutor)driver).executeScript(jst, password);
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", sign_in);
	}

}
