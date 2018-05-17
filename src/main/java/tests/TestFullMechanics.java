package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static mapsmepages.AlexeyProfilePage.GECODR;
import static mapsmepages.AlexeyProfilePage.GECODRPATH;
import static org.openqa.selenium.Keys.CONTROL;
// НЕ РЕФАКТОРИЛСЯ, НО РАОТАЕТ

@Test
public class TestFullMechanics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(GECODR, GECODRPATH);
        WebDriver driver = new FirefoxDriver();   // Объявляю драйвер
        driver.get("https://mapsme-locals-qa.ltst.su:9443/ru/");//Переход по ссылке на сайт
        WebElement TabButtonLogin = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[4]/a")));
        TabButtonLogin.click();
        driver.findElement(By.name("email")).sendKeys("qavkvirt@yandex.ru");
        driver.findElement(By.name("pass")).sendKeys("gRiboder27");
        driver.findElement(By.id("install_allow")).click();//Авторизация

        driver.findElement(By.xpath("/html/body/div/div[1]/main/div[2]/section[3]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"id_place\"]")).sendKeys("Омск");
        Thread.sleep(1000);
        driver.findElement(By.id("id_place")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div/div[1]/main/div/section[2]/div/form/div[6]/button")).click();
        //Создание трипа

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();   // Создаю драйвер Chrome
        driver2.get("https://mapsme-locals-qa.ltst.su:9443/ru/");
        driver2.manage().window().maximize();//Разворачивание окна на весь экран
        WebElement TabButtonLogin2 = (new WebDriverWait(driver2, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[4]/a")));
        TabButtonLogin2.click();//20 секунд ожидаю появления кнопки "Войти" и жму на неё

        driver2.findElement(By.name("email")).sendKeys("89139790895"); //Ввод номера телефона для авторизации
        driver2.findElement(By.name("pass")).sendKeys("99xZdf"); //Ввод пароля
        driver2.findElement(By.id("install_allow")).click(); //нажатие на кнопку входа


        WebElement TabButtonInbox = (new WebDriverWait(driver2, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[4]/a/div")));
        TabButtonInbox.click();//Переход в инбокс пользователя

        WebElement visiters = (new WebDriverWait(driver2, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/a[1]/div[3]/button")));
        visiters.click();//Переход на страницу визитеров


        WebElement ButtonSendOffer = (new WebDriverWait(driver2, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"localsApp\"]/div[1]/main/div/div/div/div/div[3]/div/div/div/div/div[2]/button")));
        ButtonSendOffer.click();// Нажатие на кнопку "Отправить офер на странице визитеров"

        WebElement ButtonSendOfferOnOffer = (new WebDriverWait(driver2, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"localsApp\"]/div[1]/main/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/form/div[2]")));
        ButtonSendOfferOnOffer.click();// Нажатие на кнопку "Отправить офер на форме офера"

        WebElement TabButtonInbox1 = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[3]")));
        TabButtonInbox1.click();//Переход в инбокс

        WebElement ChatWithUser = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/main/div/div/div/div/div/a[5]")));
        ChatWithUser.click();//Переход в диалоги с пользователем

        WebElement ClickOnAcceptButton = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div[2]/div[2]/div[2]/ul/form[1]/li/button")));
        ClickOnAcceptButton.click();//клик на "договориться"

        if (!driver.findElements(By.xpath("/html/body/div/div[1]/main/div/div/div/div[2]/div[2]/div[2]/div[1]")).isEmpty()) {
            System.out.println("Оффер о прогулке создался корректно на стороне туриста!!!");
        } else {
            System.out.println("Оффер не создался на стороне туриста!!!!");
        }//Проверка, появилась ли форма отправленного офера на строне туриста

        driver2.navigate().refresh();//ОБНОВИТЬ СТРАНИЦУ ДЛЯ ОБНОВЛЕНИЯ ФОРМЫ СОЗДАННОГО ОФФЕРА

        if (!driver2.findElements(By.xpath("//*[@id=\"localsApp\"]/div[1]/main/div/div/div/div[2]/div[2]/div[2]/div[2]/ul/li")).isEmpty()) {
            System.out.println("Оффер о прогулке создался корректно на стороне гида!!!");
        } else {
            System.out.println("Оффер не создался на стороне гида!!!!");
        }//Проверка, появилась ли форма отправленного офера на строне гида

        driver.close();//Закрыть Firefox
        driver2.close();//Закрыть Chrome
    }
}