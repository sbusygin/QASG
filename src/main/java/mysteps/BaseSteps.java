package mysteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import org.openqa.selenium.WebElement;
import pages.AdminPage;
import pages.MainPage;
import pages.UserPage;
import utils.Init;
import utils.TestProperties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class BaseSteps {

    protected MainPage mainPage = new MainPage();
    protected AdminPage adminPage = new AdminPage();
    protected UserPage userPage = new UserPage();

    @Before
    public void startScenario() {
        Init.getDriver();
    }


    @Когда("^выполнен переход на страницу \"([^\"]*)\"$")
    public void getPage (String url) {
        Init.getDriver();
        String getUrl = (String) TestProperties.getInstance().getProperties().get(url);
        Init.getDriver().get(getUrl);
    }

    @Когда("^в поле логин введено значение \"(.*)\"$")
    public void setFieldLoginValue(String value) {
        mainPage.login.sendKeys(value);
    }

    @Когда("^в поле пароль введено значение \"(.*)\"$")
    public void setFieldPasswordValue(String value) {
        mainPage.password.sendKeys(value);
    }

    @Тогда("^выполнено нажатие на кнопку Sing In")
    public void clickOnButton() {
        mainPage.buttonSingIn.click();
    }

    @Тогда("^страница администратора загрузилась")
    public void checkAdminPageOk() {
        adminPage.admMenu.isDisplayed();
        adminPage.leftMenu.isDisplayed();
        adminPage.menuUser.isDisplayed();
        adminPage.menuUserSecondLine.isDisplayed();

    }

    @Когда("^выполнено нажатие на кнопку Список игроков")
    public void userList() {
        adminPage.menuUser.click();
        adminPage.menuUserSecondLine.click();
    }


    @Тогда("^страница Список игроков загрузилась")
    public void checkUserPageOk() {
        userPage.admMenu.isDisplayed();
        userPage.leftMenu.isDisplayed();
        userPage.menuUser.isDisplayed();
    }

    @Тогда("^выполнено нажатие на колонку Name")
    public void clickOnNameColumn() {
        userPage.nameColumn.click();
    }

    @Тогда("^колонка Name отфильтрована по возрастанию")
    public void checkFilterNameColumn() {
        List<WebElement> table =  userPage.allRows;
        ArrayList<String> temp = new ArrayList<>();
        for(WebElement element:table) {
            temp.add(element.getText());
        }

        Collections.sort(temp);
    }


    @After
    public void close(){
        Init.getDriver().close();
    }
}
