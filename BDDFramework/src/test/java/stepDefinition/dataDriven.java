package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataDriven {

	WebDriver driver;

	@Given("User is on LoginPage")
	public void user_is_on_login_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@When("User is providing {string} & {string}")
	public void user_is_providing(String Username, String Password) throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(3000);
	}

	@Then("User is clicking on submitButton")
	public void user_is_clicking_on_submit_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

	}

	@Then("User is Verifying the title of the Page")
	public void user_is_verifying_the_title_of_the_page() throws InterruptedException {

		String title = driver.getTitle();

		System.out.println("Title of the page is: " + title);
		Thread.sleep(3000);
		driver.close();

	}

}
