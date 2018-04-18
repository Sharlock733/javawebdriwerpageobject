package Tests;

import Pages.HomePage;
import Pages.AuthorizationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestLocalization {

    @Test
    public static void TestAuthorization() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexey\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mapsme-locals-qa.ltst.su:9443/ru/");//Переход по ссылке на сайт

        AuthorizationPage login = new AuthorizationPage(driver);
        HomePage home = new HomePage(driver);

        home.clickOnEnterButton();
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();  //Регистрация


        home.clickOnProfile();
        home.clickOnSubparagraphLanguage();
        home.clickOnBoxLanguage();
        home.clickOnFrLanguage();
        home.clickOkOnChangeLanguage(); //FR

        String currentUrlFr = driver.getCurrentUrl();
        String urlFr = "https://mapsme-locals-qa.ltst.su:9443/fr/";

        if (currentUrlFr.equals(urlFr)) {
            System.out.println("Выбор французской локализации сайта работает");
        } else {
            System.out.println("Выбор французской локализации сайта не работает");
        }//Проверка, соответствует ли текущий URL страницы, URL страницы с французской локализацией сайта.


        home.clickOnProfile();
        home.clickOnSubparagraphLanguage();
        home.clickOnBoxLanguage();
        home.clickOnEsLanguage();
        home.clickOkOnChangeLanguage(); // ES

        String currentUrlEs = driver.getCurrentUrl();
        String urlEs = "https://mapsme-locals-qa.ltst.su:9443/es/";

        if (currentUrlEs.equals(urlEs)) {
            System.out.println("Выбор испанской локализации сайта работает");
        } else {
            System.out.println("Выбор испанской локализации сайта не работает");
        }//Проверка, соответствует ли текущий URL страницы, URL страницы с испанской локализацией сайта.


        home.clickOnProfile();
        home.clickOnSubparagraphLanguage();
        home.clickOnBoxLanguage();
        home.clickOnEnLanguage();
        home.clickOkOnChangeLanguage(); // En

        String currentUrlEn = driver.getCurrentUrl();
        String urlFr2 = "https://mapsme-locals-qa.ltst.su:9443/en/";

        if (currentUrlEn.equals(urlFr2)) {
            System.out.println("Выбор английской локализации сайта работает");
        } else {
            System.out.println("Выбор английской локализации сайта не работает");
        }//Проверка, соответствует ли текущий URL страницы, URL страницы с английской локализацией сайта.


        home.clickOnProfile();
        home.clickOnSubparagraphLanguage();
        home.clickOnBoxLanguage();
        home.clickOnRuLanguage();
        home.clickOkOnChangeLanguage(); // RU


        String currentUrlRu = driver.getCurrentUrl();
        String urlRu = "https://mapsme-locals-qa.ltst.su:9443/ru/";

        if (currentUrlRu.equals(urlRu)) {
            System.out.println("Выбор Русской локализации сайта работает");
        } else {
            System.out.println("Выбор Русской локализации сайта не работает");
        }//Проверка, соответствует ли текущий урл страницы - урлу страницы с Русской локализацией сайта


        home.clickOnProfile();
        home.clickOnSubparagraphLanguage();
        home.clickOnBoxLanguage();
        home.clickOnDeLanguage();
        home.clickOkOnChangeLanguage(); // DE

        String currentUrlDe = driver.getCurrentUrl();
        String urlDe = "https://mapsme-locals-qa.ltst.su:9443/de/";

        if (currentUrlDe.equals(urlDe)) {
            System.out.println("Выбор немецкой локализации сайта работает");
        } else {
            System.out.println("Выбор немецкой локализации сайта не работает");
        }//Проверка, соответствует ли текущий URL страницы, URL страницы с немецкой локализацией сайта.


    }

}
