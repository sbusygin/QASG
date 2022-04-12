package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Init;

public class AdminPage {

    public AdminPage(){ PageFactory.initElements(Init.getDriver(), this); }

    @FindBy(css = "div[id=\"nav-wrapper\"]")
    public WebElement leftMenu;

    @FindBy(css = "a[class=\"dropdown-toggle\"]")
    public WebElement admMenu;

    @FindBy(css = "a[data-target=\"#s-menu-users\"]")
    public WebElement menuUser;

    @FindBy(css = "li a[href=\"/user/player/admin\"")
    public WebElement menuUserSecondLine;
}
