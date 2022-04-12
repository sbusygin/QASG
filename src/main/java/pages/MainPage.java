package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Init;

public class MainPage {

    public MainPage(){ PageFactory.initElements(Init.getDriver(), this); }

    @FindBy(id = "UserLogin_username")
    public WebElement login;

    @FindBy(css = "input[id='UserLogin_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement buttonSingIn;

}
