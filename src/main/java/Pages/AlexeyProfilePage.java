package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlexeyProfilePage {

    public WebDriver driver;
    By SendOfferButtonOnAlexeyProfile = By.xpath("/html/body/div/div[1]/main/div/div[2]/div/div[1]/div/section/div[2]/div/div[1]/button");//-

    public AlexeyProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnSendOfferButtonOnAlexeyProfile() {
        driver.findElement(SendOfferButtonOnAlexeyProfile).click(); //Клик на кнопку "Показать всех"
    }
}
