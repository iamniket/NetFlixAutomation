package com.example.stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.example.extent.ExtentReportManager;
import com.example.hooks.Hooks;
import com.example.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    //private WebDriver driver;
    private final Hooks hooks;
    private final LoginPage LoginPage;
    private ExtentTest extentTest;

    public LoginStepDefinitions(Hooks hooks) {
        this.hooks = hooks;
        this.LoginPage = new LoginPage(hooks.driver);
    }

    @Before
    public void setUpScenario() {
        extentTest = ExtentReportManager.getInstance().createTest(getClass().getSimpleName());
    }


    @Given("I am on NetFlix Login page")
    public void iAmOnNetFlixLoginPage() {


    }

    @When("I enter the valid {} and {}")
    public void iEnterTheValidAnd(String username, String password) {
        LoginPage.enterUsername(username);
        LoginPage.enterPassword(password);
        LoginPage.clickLoginButton();
    }


    @Then("I can able to login successfully")
    public void iCanAbleToLoginSuccessfully() {
        LoginPage.clickProfileIcon();
    }


    @And("I as user Able to go to detail page from the search result")
    public void iAsUserAbleToGoToDetailPageFromTheSearchResult() throws InterruptedException {
        LoginPage.clickOnSearchResults();
        Thread.sleep(5000);

    }

    @Then("I as user can able to play the video")
    public void iAsUserCanAbleToPlayTheVideo() {
        LoginPage.playButtonVideo();
        LoginPage.clickLogoutButton();
    }

    @Then("I as User can Able to search for a {}")
    public void iAsUserCanAbleToSearchForA(String Series) {
        LoginPage.clickonSearchIcon();
        LoginPage.searchTextBox(Series);
    }

    @After
    public void tearDownScenario() {
        ExtentReportManager.getInstance().flush();
    }
}
