package HotelBooking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class temp {
	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///D:/Materials/New%20folder/Module%203/hotelBooking/hotelbooking.html");
	String title=driver.getTitle();
	System.out.println(title);
	//blank first name
	driver.findElement(By.name("txtFN")).sendKeys("");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg=driver.switchTo().alert();
	Thread.sleep(3000);
	msg.accept();
	
//first name
	driver.findElement(By.name("txtFN")).sendKeys("Suresh");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg1=driver.switchTo().alert();
	Thread.sleep(3000);
	msg1.accept();
	
	//last name blank
	driver.findElement(By.name("txtLN")).sendKeys("");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg2=driver.switchTo().alert();
	Thread.sleep(3000);
	msg2.accept();
	
	//last name
	driver.findElement(By.name("txtLN")).sendKeys("Nanavath");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg21=driver.switchTo().alert();
	Thread.sleep(3000);
	msg21.accept();
	
	//Email wrong format
	driver.findElement(By.name("Email")).sendKeys("Suresh");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg3=driver.switchTo().alert();
	Thread.sleep(3000);
	msg3.accept();
	
	//blank 4email
	driver.findElement(By.name("Email")).sendKeys("");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg31=driver.switchTo().alert();
	Thread.sleep(3000);
	msg31.accept();
	
	//correct email
	driver.findElement(By.name("Email")).sendKeys("nsuresh687@gmail.com");
	driver.findElement(By.className("btn")).click();
	Alert msg32=driver.switchTo().alert();
	Thread.sleep(3000);
	msg32.accept();
	
	//wrong mobile no format
	driver.findElement(By.name("Phone")).sendKeys("809648");
	Thread.sleep(3000);
	driver.findElement(By.className("btn")).click();
	Alert msg4=driver.switchTo().alert();
	Thread.sleep(3000);
	msg4.accept();
	driver.findElement(By.name("Phone")).clear();
	//correct mobile no. &7 blank address
		driver.findElement(By.name("Phone")).sendKeys("8096484499");
		Thread.sleep(3000);
		//driver.findElement(By.className("btn")).click();
		//Alert msg41=driver.switchTo().alert();
		//Thread.sleep(3000);
		//msg41.accept();
		
		//Correct Address and blank city
//		driver.findElement(By.xpath("html>body>div>div>form>table>tbody>tr>td>textarea")).sendKeys("h.no 3-4-234435, Hydergugda");
//		Thread.sleep(3000);
//		driver.findElement(By.className("btn")).click();
//		Alert msg5=driver.switchTo().alert();
//		Thread.sleep(3000);
//		msg5.accept();
		
		// blank city drop down select
		Select drpcity=new Select(driver.findElement(By.name("city")));
		drpcity.selectByVisibleText("Select City");
		driver.findElement(By.className("btn")).click();
		Alert msg6=driver.switchTo().alert();
		Thread.sleep(3000);
		msg6.accept();
		
		//Select drpcity=new Select(driver.findElement(By.name("city")));
		//slect pune as city
		drpcity.selectByVisibleText("Pune");
		driver.findElement(By.className("btn")).click();
		Alert msg7=driver.switchTo().alert();
		Thread.sleep(3000);
		msg7.accept();
		
		// blank state drop down select
				Select drpstate=new Select(driver.findElement(By.name("state")));
				drpstate.selectByVisibleText("Select State");
				driver.findElement(By.className("btn")).click();
				Alert msg71=driver.switchTo().alert();
				Thread.sleep(3000);
				msg71.accept();
//select state
				drpstate.selectByVisibleText("Maharashtra");
				driver.findElement(By.className("btn")).click();
				Alert msg8=driver.switchTo().alert();
				Thread.sleep(3000);
				msg8.accept();
		//select rooms
				Select drproom=new Select(driver.findElement(By.name("persons")));
				drproom.selectByVisibleText("3");
		//card holder name
				driver.findElement(By.className("btn")).click();
				Alert msg9=driver.switchTo().alert();
				Thread.sleep(3000);
				msg9.accept();
				driver.findElement(By.id("txtCardholderName")).sendKeys("saaa");
				Thread.sleep(3000);
		//card number		
				driver.findElement(By.className("btn")).click();
				Alert msg91=driver.switchTo().alert();
				Thread.sleep(3000);
				msg91.accept();
				driver.findElement(By.name("debit")).sendKeys("1234567890");
				Thread.sleep(3000);
				driver.findElement(By.className("btn")).click();
				Alert msg10=driver.switchTo().alert();
				Thread.sleep(3000);
				msg10.accept();
		//card cvv
				driver.findElement(By.name("cvv")).sendKeys("123");
				Thread.sleep(3000);
				driver.findElement(By.className("btn")).click();
				Alert msg11=driver.switchTo().alert();
				Thread.sleep(3000);
				msg11.accept();
	   //card expiry month
				driver.findElement(By.name("month")).sendKeys("1");
				Thread.sleep(3000);
				driver.findElement(By.className("btn")).click();
				Alert msg12=driver.switchTo().alert();
				Thread.sleep(3000);
				msg12.accept();
		//card expiry year
				driver.findElement(By.name("year")).sendKeys("2020");
				Thread.sleep(3000);
				driver.findElement(By.className("btn")).click();
				Thread.sleep(3000);
				driver.navigate().to("file:///D:/Materials/New%20folder/Module%203/hotelBooking/success.html");
				Thread.sleep(3000);
				
		
	//close the browser
	driver.close();
	//
//	driver.findElement(By.name("txtFN")).sendKeys("Suresh");
//	driver.findElement(By.name("txtFN")).sendKeys("");
//	Thread.sleep(5000);
//	driver.findElement(By.className("btn")).click();
//	Alert msg4=driver.switchTo().alert();
//	Thread.sleep(5000);
//	msg4.accept();
//	driver.findElement(By.name("txtFN")).sendKeys("Suresh");

}
}
