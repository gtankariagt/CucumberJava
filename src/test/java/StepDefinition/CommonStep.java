package StepDefinition;

import TestCases.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStep {
	Login lg = new Login();

	@Given("open the browser")
	public void open_the_browser() {

		lg.setUp();
	}

	@Given("^Open the url \"([^\"]*)\"$")
	public void open_the_url(String url) {

		lg.openTheURL(url);

	}

	@Then("Verify the page title")
	public void  Verify_the_page_title() {
		System.out.println(" Verify the page title");
	}

	@Then("Close the browser")
	public void Close_the_browser() {
		System.out.println("close the browser");
		lg.closeBrowser();
	}



}
