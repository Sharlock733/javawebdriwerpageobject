package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxPage {
    public WebDriver driver;
    By goToViseters = By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/a[1]/div[3]/button");//Кнопка войти
    By getGoToDialog = By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[4]/a");

    public InboxPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnViseters() {
        driver.findElement(goToViseters).click(); //Клик на кнопку "Показать всех"
    }

    public void clickOnDialog() {
        driver.findElement(getGoToDialog).click(); //Клик на кнопку перейти в диалог
    }


}
