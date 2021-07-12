package logPack;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;



public class hiveLogIn {
	
	
	
	
	
	
	public WebDriver driver;
	 public void openUrl() {
		//login start
		 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://fdev.i.hiveos.farm/login");
		 driver.manage().window().maximize();
		 
		 
		 
		 
	 }
	 public void hiveLogIn() {
		 WebElement emailLogin = driver.findElement(By.name("login"));
		 WebElement passwordLogin = driver.findElement(By.name("password"));
		 WebElement logInButtn = driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/form/button/div/div"));
		 emailLogin.sendKeys("allomant@ukr.net");
		 passwordLogin.sendKeys("FUdegs8ons");
		 logInButtn.click();
		 String testLogin = "Serggg";
			//wait till dropdown appear
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 if(driver.findElements(By.xpath("//div[@id='app-header']//div/span//div/strong[' + testLogin + ']")).size() != 0){
				 System.out.println("login successful");
				 }else{
				 System.out.println("login unsuccessful");
				 }
	 }
	 public void hiveLogOut() {
		 driver.findElement(By.xpath("//div[@id='app-header']//div/span//div/strong[' + testLogin + ']")).click();
		 driver.findElement(By.xpath("//*[@id='tip-body']/div/ul/div/li[6]")).click();
		 if(driver.findElements(By.xpath("//*[@id='app']/div/div/div[1]/form/button/div/div")).size() != 0){
			 System.out.println("logout successful");
			 }else{
			 System.out.println("logout unsuccessful");
			 }
	 }
	 
	public static void main(String[] args) throws InterruptedException {
		
		hiveLogIn startAutomation = new hiveLogIn();
		startAutomation.openUrl();
		startAutomation.hiveLogIn();
		startAutomation.hiveLogOut();
		
		/*
		String testLogin = "Serggg";
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		
		 
		 driver.get("https://fdev.i.hiveos.farm/login");
		 WebElement emailLogin = driver.findElement(By.name("login"));
		 WebElement passwordLogin = driver.findElement(By.name("password"));
		 WebElement logInButtn = driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/form/button/div/div"));
		 //driver.findElement(By.name("login")).sendKeys("allomant@ukr.net");
		 //driver.findElement(By.name("password")).sendKeys("FUdegs8ons");
		 emailLogin.sendKeys("allomant@ukr.net");
		 passwordLogin.sendKeys("FUdegs8ons");
		 logInButtn.click();
		 driver.manage().window().maximize();
		 //wait till dropdown appear
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@id='app-header']//div/span//div/strong[' + testLogin + ']")).click();
		 
		 //validate that login was successful

		 if(driver.findElements(By.xpath("//div[@id='app-header']//div/span//div/strong[' + testLogin + ']")).size() != 0){
			 System.out.println("login successful");
			 }else{
			 System.out.println("login unsuccessful");
			 }
		 //logout
		 driver.findElement(By.xpath("//*[@id='tip-body']/div/ul/div/li[6]")).click();
		 if(driver.findElements(By.xpath("//*[@id='app']/div/div/div[1]/form/button/div/div")).size() != 0){
			 System.out.println("logout successful");
			 }else{
			 System.out.println("logout unsuccessful");
			 }
		*/
		
	}

}
