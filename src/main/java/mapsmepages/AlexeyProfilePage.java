package mapsmepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlexeyProfilePage {

    public WebDriver driver;
    By SendOfferButtonOnAlexeyProfile = By.xpath("/html/body/div/div[1]/main/div/div[2]/div/div[1]/div/section/div[2]/div/div[1]/button");//-


    public static final String GECODR  = "webdriver.gecko.driver";
    public static final String GECODRPATH  = "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe";
    //Глобальное описание путей к драйверу



    public AlexeyProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnSendOfferButtonOnAlexeyProfile() {
        driver.findElement(SendOfferButtonOnAlexeyProfile).click(); //Клик на кнопку "Показать всех"
    }
}
