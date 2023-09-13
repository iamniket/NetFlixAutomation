package com.example.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    // Define locators for the page elements
    private By usernameField = By.id("id_userLoginId");
    private By passwordField = By.id("id_password");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By profileClick = By.xpath("//li[1]//div[1]//a[1]//div[1]//div[1]");
    private String expectedTitle = "Home - Netflix";
    private By searchButton = By.xpath("//button[@aria-label='Search']//*[name()='svg']");
    private By searchTextBox = By.xpath("//input[@id='searchInput']");
    private By titleBreakingBad = By.xpath("//a[@aria-label='Breaking Bad']//img[@class='boxart-image boxart-image-in-padded-container']");
    private By playButtonVideo = By.xpath("//button[@class='color-primary hasLabel hasIcon ltr-podnco']");
    private By accountDropdown = By.xpath("//div[@class='account-dropdown-button']");
    private By clickSignoutBtn = By.xpath("//a[@class='sub-menu-link ']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter the username
    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }

    //Method to click on the Profile Icon and validation on Title
    public void clickProfileIcon() {
        WebElement profileClickPic = driver.findElement(profileClick);
        profileClickPic.click();
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, expectedTitle);
    }

    //Method to Click on search Icon
    public void clickonSearchIcon() {
        WebElement clickSearchIcon = driver.findElement(searchButton);
        clickSearchIcon.click();
    }

    //Method to Enter the text in the search box
    public void searchTextBox(String Series) {
        WebElement searchBox = driver.findElement(searchTextBox);
        searchBox.sendKeys(Series);

    }

    //Method to Validate the search title and clicking on it
    public void clickOnSearchResults() {
        WebElement seriesTitle = driver.findElement(titleBreakingBad);
        seriesTitle.click();

    }

    //Method to Play the video
    public void playButtonVideo() {
        WebElement playBtnVideo = driver.findElement(playButtonVideo);
        playBtnVideo.click();
        driver.navigate().back();
    }

    //Method to logout from Nextflix
    public void clickLogoutButton() {
        WebElement clickaccBtn = driver.findElement(accountDropdown);
        clickaccBtn.click();
        WebElement clicksignOut = driver.findElement(clickSignoutBtn);
        clicksignOut.click();
    }
}

