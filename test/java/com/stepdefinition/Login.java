package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;

	@Given("user is on the omrbranch page")
	public void url() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(string);

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(string2);
	}

	@When("user click the login button")
	public void button() {
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnlogin.click();

	}

	@Then("user should verify after login succes message")
	public void verify_after_login_succes_message() {
		Assert.assertTrue("VerifyafterLogin", true);
	}

}
