package mapsmepages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SettingPage {

    public WebDriver driver;

    By nameField = By.id("id_first_name");//Находим заполненное поле имя
    By saveSettings = By.xpath("/html/body/div[1]/div[1]/main/div/div[2]/div/div[1]/form[1]/button");

    public SettingPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnNameField() {
        driver.findElement(nameField).click(); // Клик на поле имя
    }

    public void CntrlAOnNameField() {
        driver.findElement(nameField).sendKeys(Keys.CONTROL, "a"); //Выделение всего содержимого поля
    }

    public void DeleteOnNameField() {
        driver.findElement(nameField).sendKeys(Keys.DELETE);//Зачистка поля
    }

    public void EnterToOnNameField() {
        driver.findElement(nameField).sendKeys("Евгений"); //Ввод "Евгений" в поля Имя
    }

    public void clickOnSaveSettings() {
        driver.findElement(saveSettings).click(); //Клик "Сохранить настройки"

    }
}