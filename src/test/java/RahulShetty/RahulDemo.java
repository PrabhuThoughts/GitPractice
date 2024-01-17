package RahulShetty;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.util.FileCopyUtils;

public class RahulDemo {
	
	public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
     //driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//     driver.findElement(By.xpath("//input[@value='radio1']")).click();
//     driver.findElement(By.id("autocomplete")).sendKeys("India");
//    //Method 1 to select dropdown
//     WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//     Select drpdown = new Select(dropdown);
//     drpdown.selectByVisibleText("Option1");
     
     //Method 2 to select dropdown
    /*driver.findElement(By.id("dropdown-class-example")).click();
    String option="Option2";
    WebElement dropdown=driver.findElement(By.xpath("//select/option[contains(text(),'"+option+"')]"));
    dropdown.click();
    System.out.println("Dropdown is clicked");*/
    
     //Window handling
     
		/*
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * driver.findElement(By.id("opentab")).click();
		 * 
		 * String ParentWindow=driver.getWindowHandle();
		 * 
		 * System.out.println("Parent window : "+ParentWindow);
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * Set<String> Windows=driver.getWindowHandles();
		 * 
		 * List<String> list=new ArrayList<String>(Windows);
		 * 
		 * driver.switchTo().window(list.get(1));
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.switchTo().window(list.get(0));
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.close();
		 */
    
    //Table handling
     //Print the headers
     //dummy//driver.switchTo().alert().accept();
     boolean flag= false;
     WebElement tablerow = driver.findElement(By.id("product"));
     List<WebElement> Headers=tablerow.findElements(By.tagName("th"));
     for (WebElement Header : Headers) {
    	 String header =Header.getText();
    	 
		System.out.println(header);
	}
     
     
     
     List<WebElement> allrows= tablerow.findElements(By.xpath("//table[@id='product']/tbody/tr"));
     
     int rowsize=allrows.size();
     System.out.println("Size of Rows : "+rowsize);
     
     for (WebElement row : allrows) {
		List<WebElement> columns=row.findElements(By.xpath("//table[@id='product']/tbody/tr/td"));
		WebElement column2= columns.get(2);
		System.out.println(column2.getText());
	}
    // System.out.println(column2.getText());
     
   /*  for (int i = 0; i < rowsize; i++) {
    	 List<WebElement> row=allrows.get(i).findElements(By.xpath("//table[@id='product']/tbody/tr/td"));
    	 WebElement secondcolumn= row.get(1);
    	 String text=secondcolumn.getText();
    	 if(text.equals("Appium (Selenium) - Mobile Automation Testing from Scratch")) {
    		 System.out.println(text);
    		 
    	 }*/
    	 
    	 
		
	}
     //print all the coloumns
		/*
		 * List<WebElement> datas=tablerow.findElements(By.tagName("td")); for
		 * (WebElement data : datas) { String Content =data.getText();
		 * 
		 * System.out.println(Content); }
		 */
     
	/*
	 * List<WebElement> allrow=
	 * driver.findElements(By.xpath("//table[@id='product']//tr//td")); int size=
	 * allrow.size(); System.out.println(size); for (WebElement row : allrow) {
	 * List<WebElement>columns= row.findElements(By.tagName("td")); WebElement
	 * Fcolumn=columns.get(0); System.out.println(Fcolumn.getText());
	 * 
	 * }
	 */
     
    
     
    // File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    // File
     
    // driver.close();

 }


