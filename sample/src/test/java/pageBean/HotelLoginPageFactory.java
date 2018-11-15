package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPageFactory {
	
	WebDriver driver;
	
	@FindBy(name = "userName")
	@CacheLookup //The identified element will be stored temporarily till the operation is performed on the particular element
	WebElement pfuName;
	
	// How is used to identify or make specific which type of identifier should be used
	@FindBy(how = How.NAME, using = "userPwd")
	@CacheLookup
	WebElement pfuPwd;

	@FindBy(className= "btn")
	@CacheLookup //The identified element will be stored temporarily till the operation is performed on the particular element
	WebElement pfLogin;
	
	public HotelLoginPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPfuName() {
		return pfuName;
	}

	public void setPfuName(String sName) {
		pfuName.sendKeys(sName);
	}

	public WebElement getPfuPwd() {
		return pfuPwd;
	}

	public void setPfuPwd(String sPwd) {
		pfuPwd.sendKeys(sPwd);
	}

	public WebElement getPfLogin() {
		return pfLogin;
	}

	public void setPfLogin() {
		pfLogin.click();
	}

	
}
