package mapsmepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {


    public WebDriver driver;
    By tabOnFirstRadiobutton = By.xpath("/html/body/div/div[1]/main/div/div[2]/div/div[1]/div/div/div/div/div[2]/form/p[1]/label[1]");//-
    By tabOnFirstSendOffer = By.xpath("/html/body/div/div[1]/main/div/div[2]/div/div[1]/div/div/div/div/div[2]/form/div[2]/button");

    public OfferPage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickOnFirstRadiobutton() {
        driver.findElement(tabOnFirstRadiobutton).click(); //Клик на первый радиобатон
    }
    public void clickOnFirstSendOffer() {
        driver.findElement(tabOnFirstSendOffer).click(); //Клик на кнопку "Отправить оффер"
    }
}