package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryFilterPage {
    public  static SelenideElement findBTN=$(By.xpath("//*[text()='Найти']"));
}
