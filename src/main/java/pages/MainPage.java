package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static SelenideElement searchHeaderField = $("#edit-search-api-views-fulltext"),
                                    submitSearchField=$("#edit-submit-search-page");

    public static void fillAndSubmitSearchField(String text) {
        searchHeaderField.sendKeys(text);
        submitSearchField.click();

    }
}