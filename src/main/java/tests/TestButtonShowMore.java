package tests;

import mapsmepages.AuthorizationPage;
import mapsmepages.HomePage;
import mapsmepages.InboxPage;
import mapsmepages.TripPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.HomePage.URLMAPSME;

public class TestButtonShowMore {
    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(URLMAPSME);//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);
        TripPage trip = new TripPage(driver);
        InboxPage inbox = new InboxPage(driver);

        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();  //Авторизация

        home.clickOnButtonShowMore();

        Thread.sleep(5000);


        if (!driver.findElements(By.xpath("\n" + "/html/body/div/div[1]/main/div[2]/section[2]/div/div/div/div/div[18]/div/div")).isEmpty()) {
            System.out.println("Кнопка Show more работает!!!");
        } else {
            System.out.println("Кнопка Show more не работает");
        }//Проверка, появилась ли надпись "Изменения настроек профиля успешно сохранены"


    }
}
