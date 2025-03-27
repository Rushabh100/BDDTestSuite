package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFunctionality {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@When("user enters username")
	public void user_enters_username() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("rushabh@gmail.com");
		Thread.sleep(3000);

	}

	@When("user enters password")
	public void user_enters_password() throws InterruptedException {

		driver.findElement(By.id("password")).sendKeys("Rushabh@12345");
		Thread.sleep(3000);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

	}

	@Then("user verifies the title of the page")
	public void user_verifies_the_title_of_the_page() throws InterruptedException {

		String title = driver.getTitle();

		System.out.println("Title of the page is: " + title);

		Thread.sleep(3000);
		driver.close();
	}

}
