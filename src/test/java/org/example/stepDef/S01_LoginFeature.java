package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S01_LoginFeature {
    P01_LoginPage loginPage = new P01_LoginPage();

    @When("i enter username {string}")
    public void iEnterValidUsername(String username) {
        loginPage.username().sendKeys(username);
    }

    @And("i enter password {string}")
    public void iEnterValidPassword(String password) {
        loginPage.password().sendKeys(password);
    }

    @Then("i will click on login button")
    public void iWillBeAbleToLogin() {
        loginPage.loginButton().click();
    }





}
