package mapsmepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public static final String URLMAPSME = "https://mapsme-locals-qa.ltst.su:9443/ru/";
    //Присваиваю переменной URLMAPSME ссылку на нужный сайт


    By enterButton = By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[4]/a");//Кнопка войти
    By inboxButton = By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[4]/a/div");//Кнопка инбокс
    By tabProfile = By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[3]/div/div[1]");//Нажатие на профиль
    By tabOnLanguage = By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[3]/div/div[2]/ul[2]/li[3]/a");//Нажатие на пункт "Язык"
    By tabOnLanguageBox = By.id("language");//Нажатие на выпадающее поле "язык"
    By tabOnFrLanguage = By.xpath("/html/body/div/div[2]/div/form/div/div[2]/select/option[4]");//Выбор Fr в меню
    By tabOnEnLanguage = By.xpath("/html/body/div/div[2]/div/form/div/div[2]/select/option[1]");//Выбор En в меню
    By tabOnEsLanguage = By.xpath("/html/body/div/div[2]/div/form/div/div[2]/select/option[3]");//Выбор Es в меню
    By tabOnDeLanguage = By.xpath("/html/body/div/div[2]/div/form/div/div[2]/select/option[5]");//Выбор De в меню
    By tabOnRuLanguage = By.xpath("/html/body/div/div[2]/div/form/div/div[2]/select/option[2]");//Выбор Ru в меню
    By tabOkOnChangeLanguage = By.xpath("/html/body/div/div[2]/div/form/div/div[2]/button"); //Кнопка ок
    By tabCreateNewTrip = By.xpath("/html/body/div/div[1]/main/div[2]/section[3]/div[2]/a");//Нажатие на кнопку "Создать путешествие"
    By tabOnButtonShowMore = By.xpath("/html/body/div/div[1]/main/div/section[2]/div/div/div/div[2]/button"); // Нажатие на кнопку "Show more"
    By findAlexeyProfile = By.xpath("/html/body/div/div[1]/main/div[2]/section[2]/div/div/div/div[1]/div[4]/div/a");
    By tabProfileSetting = By.xpath("/html/body/div/header/div/div[4]/ul[1]/li[3]/div/div[2]/ul[2]/li[1]/a");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnEnterButton() {
        driver.findElement(enterButton).click(); //Клик на кнопку войти на экране авторизации
    }

    public void clickOnInboxButton() {
        driver.findElement(inboxButton).click();//Клик на кнопку инбокс
    }

    public void clickOnProfile() {
        driver.findElement(tabProfile).click(); //Клик на профиль
    }

    public void clickOnSubparagraphLanguage() {
        driver.findElement(tabOnLanguage).click(); //Клик на подпункт "Язык"
    }

    public void clickOnBoxLanguage() {
        driver.findElement(tabOnLanguageBox).click(); //Клик на поле с выпадающем меню "Язык"
    }

    public void clickOnFrLanguage() {
        driver.findElement(tabOnFrLanguage).click(); //Клик на Французский в выпадающем меню
    }

    public void clickOnEnLanguage() {
        driver.findElement(tabOnEnLanguage).click(); //Клик на английский в выпадающем меню
    }

    public void clickOnEsLanguage() {
        driver.findElement(tabOnEsLanguage).click(); //Клик на испанский в выпадающем меню
    }

    public void clickOnDeLanguage() {
        driver.findElement(tabOnDeLanguage).click(); //Клик на немецкий в выпадающем меню
    }

    public void clickOnRuLanguage() {
        driver.findElement(tabOnRuLanguage).click(); //Клик на Русский в выпадающем меню
    }

    public void clickOkOnChangeLanguage() {
        driver.findElement(tabOkOnChangeLanguage).click(); //Клик на OK после выбора языка
    }

    public void clickOkOnCreateTrip() {
        driver.findElement(tabCreateNewTrip).click(); //Клик на "создать путешествие"
    }

    public void clickOnButtonShowMore() {
        driver.findElement(tabOnButtonShowMore).click(); //Клик на "ShowMore"
    }

    public void clickAlexeyProfile() {
        driver.findElement(findAlexeyProfile).click(); //Клик на профиль "Alexey"
    }

    public void clickProfileSetting() {
        driver.findElement(tabProfileSetting).click(); //Таб на настройки профля в выпадающем меню
    }


}