package tests;

import mapsmepages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.HomePage.URLMAPSME;

public class TestChangeSettingsAndSave {

    @Test
    public void TestAuthorization() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLMAPSME);//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);
        TripPage trip = new TripPage(driver);
        InboxPage inbox = new InboxPage(driver);
        AlexeyProfilePage alexPage = new AlexeyProfilePage(driver);
        OfferPage offer = new OfferPage(driver);
        SettingPage setting = new SettingPage(driver);


        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();  //Авторизация

        home.clickOnProfile();
        home.clickProfileSetting(); // Переход в настройки профиля

        setting.clickOnNameField();
        setting.CntrlAOnNameField();
        setting.DeleteOnNameField();
        setting.EnterToOnNameField();
        setting.clickOnSaveSettings(); //Изменяю имя и пытаюсь сохранить


        if (!driver.findElements(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div/p")).isEmpty()) {
            System.out.println("Изменения настроек профиля успешно сохранены!");
        } else {
            System.out.println("Настройки профиля не сохранены!!!!");
        }//Проверка, появилась ли надпись "Изменения настроек профиля успешно сохранены"
    driver.close();
    }
}