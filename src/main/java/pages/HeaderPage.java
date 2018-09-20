package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {
    public static SelenideElement searchHeaderField = $("#edit-search-api-views-fulltext"),
            submitSearchField=$("#edit-submit-search-page"),
            favoritesBTN=$("#flag-counter-favorites"),
            menuHeaderBTN=$(By.xpath("//*[@class='text' and text()='Меню']")),
            categoryFlatsInMenu=$(By.xpath("//*[@id='main-menu-links']//*[text()='Квартиры']"));

    public static void fillAndSubmitSearchField(String text) {
        searchHeaderField.sendKeys(text);
        submitSearchField.click();

    }
}
