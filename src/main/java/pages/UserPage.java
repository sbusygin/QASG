package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Init;

import java.util.List;

public class UserPage {

    public UserPage(){ PageFactory.initElements(Init.getDriver(), this); }

    @FindBy(css = "div[id=\"nav-wrapper\"]")
    public WebElement leftMenu;

    @FindBy(css = "a[class=\"dropdown-toggle\"]")
    public WebElement admMenu;

    @FindBy(css = "a[data-target=\"#s-menu-users\"]")
    public WebElement menuUser;

    @FindBy(css = "table[class=\"table table-hover table-striped table-bordered table-condensed\"] th[id=\"payment-system-transaction-grid_c1\"]")
    public WebElement nameColumn;

    @FindBy(xpath = "//td //a[count(@*)=1 and contains(@href,'user')] ")
    public List<WebElement> allRows;


}
