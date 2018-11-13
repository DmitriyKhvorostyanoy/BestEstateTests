package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    static MainPage mainPage;
    static SearchResultPage searchResultPage;
    static PropertyPage propertyPage;
    static HeaderPage header;
    static FavoritesPage favoritesPage;
    static CategoryFilterResultPage categoryFilterResultPage;
    static CategoryFilterPage categoryFilterPage;
    @BeforeClass
    public static void setUp() {
        categoryFilterResultPage = new CategoryFilterResultPage();
        mainPage = new MainPage();
        searchResultPage = new SearchResultPage();
        propertyPage = new PropertyPage();
        header = new HeaderPage();
        favoritesPage= new FavoritesPage();
        categoryFilterPage = new CategoryFilterPage();


        SelenideLogger.addListener("allure", new AllureSelenide());
        System.setProperty("selenide.browser", "chrome");
        clearBrowserCache();
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        open("https://best-estate.net/");
    }
    @AfterClass
    public static void closeBrowser(){
        Selenide.close();
        //public static boolean holdBrowserOpen = Boolean.getBoolean("selenide.holdBrowserOpen");
    }
}