package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
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
    //@Ignore
    @DisplayName("Проверка связи с агентом")
    @Description("гость отправляет форму со страницы проперти чтобы агент с ним связался")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void contactMeForm() throws InterruptedException {


        header.fillAndSubmitSearchField("дом");
        searchResultPage.podrobneeBTNonPropertyCard.click();
        propertyPage.contactMeBTN.click();
        propertyPage.fillContactForm("test","667271805000","это тестовое сообщение, его можно удалить");
       // Thread.sleep(999999999);
    }
}