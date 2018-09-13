package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import pages.MainPage;
import pages.PropertyPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static pages.SearchResultPage.podrobneeBTNonPropertyCard;

public class TestContactForm extends BaseTest {

    @Test
    public void contactMeForm() throws InterruptedException {


        mainPage.fillAndSubmitSearchField("дом");
        searchResultPage.podrobneeBTNonPropertyCard.click();
        propertyPage.contactMeBTN.click();
        propertyPage.fillContactForm("test","0667271805","это тестовое сообщение, его можно удалить");
       // Thread.sleep(999999999);
    }
}