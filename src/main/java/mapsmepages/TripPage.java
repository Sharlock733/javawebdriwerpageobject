package mapsmepages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TripPage {
    public WebDriver driver;

    By PressEnterOnSelectorCity = By.xpath("//*[@id=\"id_place\"]");
    By PressEnterOnSelectCity = By.id("id_place");

    public TripPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void EnterOmskOnSelectCity()
    {
        driver.findElement(PressEnterOnSelectorCity).sendKeys("Омск");
    }

    public void PressEnterOnSelectCity()
    {
        driver.findElement(PressEnterOnSelectCity).sendKeys(Keys.ENTER);
    }
}