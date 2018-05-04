package tests;

import mapsmepages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static mapsmepages.HomePage.URLMAPSME;

public class SendOffer {

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

            home.clickOnEnterButton();
            login.typeUserName();
            login.typePassword();
            login.clickOnLoginButton();  //Авторизация
Thread.sleep(5000);
            home.clickAlexeyProfile();//Клик на профиль Алексея
            alexPage.clickOnSendOfferButtonOnAlexeyProfile();//Клик "Отправить оффер" в профиле Алексея
            offer.clickOnFirstRadiobutton();
            offer.clickOnFirstSendOffer();


            if (!driver.findElements(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div[2]/div[1]/div[1]")).isEmpty()) {
                System.out.println("Оффер успешно отправлен!");
            } else {
                System.out.println("Оффер не отправлен!!!!");
            }//Проверка, появилась ли форма отправленного офера
            driver.close();
        }


    }


