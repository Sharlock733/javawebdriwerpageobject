package Tests;

import Pages.HomePage;
import Pages.AuthorizationPage;
import Pages.TripPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateTrip {


    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mapsme-locals-qa.ltst.su:9443/ru/");//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);
        TripPage trip = new TripPage(driver);

        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();  //Регистрация

        home.clickOkOnCreateTrip();//Переход в трипы
        Thread.sleep(5000);
        Thread.sleep(5000);
        trip.EnterOmskOnSelectCity();
        Thread.sleep(5000);
        trip.PressEnterOnSelectCity();//создание нового трипа


        driver.findElement(By.xpath("/html/body/div/div[1]/main/div/section[2]/div/form/div[6]/button")).click();
        if (!driver.findElements(By.xpath("/html/body/div/div[1]/main/div/section[3]/div/div/div/div/div/div[2]")).isEmpty()) {
            System.out.println("Новый трип создан");
        } else {
            System.out.println("Новый трип не создан");
        }//проверка

    }
}