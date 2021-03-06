package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    public static SelenideElement   podrobneeBTNonPropertyCard=$(By.xpath("//*[@class='views-row views-row-1 views-row-odd views-row-first']/descendant::a[contains(text(),'Подробнее')]")),
                                    likeFlagOnProprtyCard=$(By.xpath("//*[@class='views-row views-row-1 views-row-odd views-row-first']/descendant::a[contains(text(),'В избранное')]")),
                                    codeOnPropertyCard=$(By.xpath("//*[contains(@class,'views-row views-row-1 views-row-odd views-row-first')]//*[@class='code option']")),
                                    pageTitle=$("#page-title");
    public static ElementsCollection cardsWithSearchedStreet=$$(By.xpath("//*[contains(text(),'Яроша')]"));

}
