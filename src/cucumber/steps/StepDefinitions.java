package cucumber.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends SeleniumInit {

	static WebDriver driver;
	String CONTACTLINK = "menu-item-1709";

	@Given("^I am on my website$")
	public void i_am_on_my_zoo_website() throws Throwable {
		SeleniumInit init = new SeleniumInit();
		driver = init.run();
		driver.navigate().to("http://testautomationkgb.blogspot.com.co/");
	}

	@When("^populate the contact form$")
	public void populate_the_contact_form() throws Throwable {
		driver.findElement(By.id("ContactForm1_contact-form-name")).sendKeys("kira");
		driver.findElement(By.id("ContactForm1_contact-form-email")).sendKeys("kgbebesita@test.nn");
		driver.findElement(By.id("ContactForm1_contact-form-email-message")).sendKeys("solo cuando me dan comida en esta casa, los quiero mucho");
		driver.findElement(By.id("ContactForm1_contact-form-submit")).click();
	}

	@Then("^I should be on the contact confirmation page$")
	public void i_should_be_on_the_contact_confirmation_page() throws Throwable {
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Se ha enviado tu mensaje." + "')]"));
		Assert.assertTrue("Text not found!", list.size() > 0);
	}
	
	
}
