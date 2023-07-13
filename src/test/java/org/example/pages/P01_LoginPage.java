package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_LoginPage {

    // elements
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButtonField = By.id("login-button");

    // actions
    public WebElement username (){
        return Hooks.driver.findElement(usernameField);
    }

    public WebElement password (){
        return Hooks.driver.findElement(passwordField);
    }

    public WebElement loginButton (){
        return Hooks.driver.findElement(loginButtonField);
    }
}
