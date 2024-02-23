package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
 
	public static WebDriver driver;
 
	@Given("user is on homepage")

	public void homepage() {
  System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
  driver=new FirefoxDriver() ;
  driver. get("http://facebook.com");}

	@When("user enter username and password")

	public void login() 
     {
		driver.findElement(By.id("email")).sendKeys("Emmanuvel");
        driver.findElement(By.id("pass")).sendKeys("012345");
      }

	@Then("user assert the title")
 
	public void asserttitle() {
	 String actual=driver.getTitle();
	 String expected="Facebook-log in or sign up";
	 //Assert.assertEquals(expected,actual);
	 driver.close();
 
	 
	 
 }
}
