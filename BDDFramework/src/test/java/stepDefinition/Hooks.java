package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	WebDriver driver;

	@Before
	public void before() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		System.out.println("BEFORE-METHOD");
	}

	@After
	public void after() {

		System.out.println("AFTER-METHOD");

		driver.close();
	}

	@BeforeStep
	public void beforeStep() {

		System.out.println("BEFORE-STEP");

	}

	@AfterStep
	public void afterStep() {

		System.out.println("AFTER-STEP");

	}

	@Given("user is on the lpage")
	public void user_is_on_the_lpage() {

		System.out.println("User is on the login page");

	}

	@When("user enters email")
	public void user_enters_email() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("rushabh@gmail.com");
		Thread.sleep(3000);
	}

	@When("user enters the password")
	public void user_enters_the_password() throws InterruptedException {

		driver.findElement(By.id("password")).sendKeys("Rushabh@12345");
		Thread.sleep(3000);

	}

	@Then("user click on the sButton")
	public void user_click_on_the_s_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

	}
}
