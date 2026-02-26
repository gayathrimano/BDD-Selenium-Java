package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
    WebDriver driver = Hooks.driver;


	@Given("user is on the saucedemo login page")
	public void user_is_on_the_saucedemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com");

	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	    
	    // Using CSS Selector
	    driver.findElement(By.cssSelector("#password")).sendKeys(password);
	    
	    // Using XPath contains
	    driver.findElement(By.xpath("//input[contains(@id,'login')]")).click();

	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
        System.out.println("Page title after login: " + title);

	}




	
	
}
