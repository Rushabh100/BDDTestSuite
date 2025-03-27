package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatable {

	WebDriver driver;

	@Given("User is on loginpage")
	public void user_is_on_loginpage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rushi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@When("User enters username & password")
	public void user_enters_username_password(DataTable dataTable) throws InterruptedException {

		List<List<String>> data = dataTable.cells();

		driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(3000);

	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

	}

	@Then("User verifies the title")
	public void user_verifies_the_title() throws InterruptedException {

		String title = driver.getTitle();

		System.out.println("Title of the page is: " + title);
		Thread.sleep(3000);

	}

	@Then("User click on add new contact button")
	public void user_click_on_add_new_contact_button() throws InterruptedException {

		driver.findElement(By.id("add-contact")).click();
		Thread.sleep(3000);

	}

	@Then("User enters personal information")
	public void user_enters_personal_information(DataTable dataTable) throws InterruptedException {

		List<List<String>> data1 = dataTable.cells();

		driver.findElement(By.id("firstName")).sendKeys(data1.get(0).get(1));
		Thread.sleep(3000);

		driver.findElement(By.id("lastName")).sendKeys(data1.get(1).get(1));
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys(data1.get(3).get(1));
		Thread.sleep(3000);

		driver.findElement(By.id("phone")).sendKeys(data1.get(4).get(1));
		Thread.sleep(3000);

		driver.findElement(By.id("birthdate")).sendKeys(data1.get(2).get(1));
		Thread.sleep(3000);

		driver.close();
	}

}
