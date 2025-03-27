package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {

	WebDriver driver;

	@Given("User is on the LoginPage")
	public void user_is_on_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@When("User click on Signup button")
	public void user_click_on_signup_button() throws InterruptedException {

		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);

	}

	@When("User enters fname & lname")
	public void user_enters_fname_lname() throws InterruptedException {

		driver.findElement(By.id("firstName")).sendKeys("Rushabh");
		Thread.sleep(3000);

		driver.findElement(By.id("lastName")).sendKeys("More");
		Thread.sleep(3000);
	}

	@When("User click on the Submitbutton")
	public void user_click_on_the_submitbutton() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

		driver.close();

	}

	@When("User enters email & password")
	public void user_enters_email_password() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("rushabh@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys("Rushabh@12345");
		Thread.sleep(3000);

	}

	@Then("User clicks on Cancel button")
	public void user_clicks_on_cancel_button() throws InterruptedException {

		driver.findElement(By.id("cancel")).click();
		Thread.sleep(3000);

		driver.close();

	}

}
