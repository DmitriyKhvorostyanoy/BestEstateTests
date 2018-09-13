package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import pages.MainPage;
import pages.PropertyPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    static MainPage mainPage;
    static SearchResultPage searchResultPage;
    static PropertyPage propertyPage;

    @BeforeClass
    public static void setUp() {
        mainPage = new MainPage();
        searchResultPage = new SearchResultPage();
        propertyPage = new PropertyPage();

        SelenideLogger.addListener("allure", new AllureSelenide());
        System.setProperty("selenide.browser", "chrome");
        clearBrowserCache();
        Configuration.timeout = 15000;
        open("https://best-estate.net/");
    }
}