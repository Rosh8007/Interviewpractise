package Demo.cjc.stefdef;

import java.util.NoSuchElementException;

import javax.swing.text.html.parser.DTD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {

	static WebDriver driver;
	
	@Given("^User navigate to DemowebshopRegistration$")
	public void DemowebNevigation() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Crmdriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
	    driver.manage().window().maximize();
		
	}
	
	@When("^User click on Gender male$")
	public void click() 
	{
		driver.findElement(By.name("Gender")).click();
	}
	@And("^User enters Firstname as \"(.*)\"$")
	public void firstname(String A) 
	{
		driver.findElement(By.name("FirstName")).sendKeys(A);
	}
	@And("^User enters Lastname as \"(.*)\"$")
	public void lastname(String B) 
	{
		driver.findElement(By.name("LastName")).sendKeys(B);
	}
	
	@And("^User enters email as \"(.*)\"$")
	public void email(String  C) 
	{
		driver.findElement(By.name("Email")).sendKeys(C);
	}
	@And("^User enters password \"(.*)\"$")
	public void password(String ps) 
	{
		driver.findElement(By.name("Password")).sendKeys(ps);
		
	}
	@And("^User enters Conform password \"(.*)\"$")
	public void conformPass(String pss) 
	{
		driver.findElement(By.name("ConfirmPassword")).sendKeys(pss);
	}
	@And("^User clicks on Register Button$")
	public void register() 
	{
		
		driver.findElement(By.name("register-button")).click();
		
	}
	
	
	@Then("^User Complete Registration$")
	public void success() {
		System.out.println("Success");
	}
	
	
	@Given("^User navigate to Books$")
	public void books() 
	{
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
	}
	
	@And("^Click on book of his choice$")
	public void bookofchoice() 
	{
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
		
	}
	
	@And("^Click on addtocart$")
	public void addtocart() 
	{
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-13\"]")).click();
		
	}
	@And("^User navigate to cart$")
	public void viewcatr() 
	{
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
	}
	
	@And("^User accept Terms of policy$")
	public void Terms() 
	{
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
	}
	
	@And("^User clicks on Checkout$")
	public void checkout() 
	{
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	}
	@And("^User clicks on checkoutasGuest$")
	public void guest() 
	{
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]")).click();
	}
	
	@Given("^User enters firstname as \"(.*)\"$")
	public void fistname(String A) 
	{
		driver.findElement(By.name("BillingNewAddress.FirstName")).sendKeys(A);
	}
	@And("^User enters lasname as \"(.*)\"$")
	public void Lastname(String B) 
	{
		driver.findElement(By.name("BillingNewAddress.LastName")).sendKeys(B);
	}
	@And("^User enters Email as \"(.*)\"$")
	public void Email( String ss) 
	{
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys(ss);
	}
	@And("^User enters name of the Company as \"(.*)\"$")
	public void Company(String D) 
	{
		driver.findElement(By.name("BillingNewAddress.Company")).sendKeys(D);
	}
	@And("^User Select country as \"(.*)\"$")
	public  void Country(String E)
	{
	Select sel=new Select(	driver.findElement(By.name("BillingNewAddress.CountryId")));
	sel.selectByVisibleText(E);
	
	}
	
	@And("^User select State as \"(.*)\"$")
	public void state(String F) throws InterruptedException
	{
		Thread.sleep(2000);
        Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]")));
        sel1.selectByIndex(0);
	}	
	@And("^User enters City as \"(.*)\"$")
	public void city(String G) 
	{
		driver.findElement(By.name("BillingNewAddress.City")).sendKeys(G);
	}
	@And("^User enters address1 as \"(.*)\"$")
	public void address(String H) 
	{
		driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys(H);
	}
	@And("^User enters address2 as \"(.*)\"$")
	public void address2(String I) 
	{
		driver.findElement(By.name("BillingNewAddress.Address2")).sendKeys(I);
	}
	@And("^User enters zip/postal code as \"(.*)\"$")
	public void zip(String J) 
	{
		driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys(J);
	}
	@And("^User enters Phone number as \"(.*)\"$")
	public void phone(String K) 
	{
		driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys(K);
	}
	@And("^User enters Fax as \"(.*)\"$")
	public void fax(String L) 
	{
		driver.findElement(By.name("BillingNewAddress.FaxNumber")).sendKeys(L);
	}
	@And("^User Clicks on Continue$")
	public void Continue() throws InterruptedException  
	{
		Thread.sleep(2000);;
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
	}
	@Given("^user clicks on continue second time$")
	public void continue2() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
	}
	@And("^user clicks on continue third time$")
	public void continue3() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
	}
	@And("^user clicks on coninue fourth time$")
	public void continue4() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
	}
	
	@And("^user clicks on continue fifth time$")
	public void continue5() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
	}
	
    @And("^user clicks on continue sixth time$")
    public void continue6() throws InterruptedException 
    {
    	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
    }
	
	
	
	
	
	
	
}
