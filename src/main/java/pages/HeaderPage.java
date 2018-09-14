package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {
    public static SelenideElement searchHeaderField = $("#edit-search-api-views-fulltext"),
            submitSearchField=$("#edit-submit-search-page"),
            favoritesBTN=$("#flag-counter-favorites");

    public static void fillAndSubmitSearchField(String text) {
        searchHeaderField.sendKeys(text);
        submitSearchField.click();

    }
}
