package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FavoritesPage {
    public static SelenideElement favoritesPageTitle=$("#page-title"),
                                    addedToFavoritesCard=$(By.xpath("//*[@class='views-row views-row-1 views-row-odd views-row-first views-row-last']//*[contains(text(),'дом')]")),
            codeOnPropertyCardOnFavoritesPAge=$(By.xpath("//*[@class='views-row views-row-1 views-row-odd views-row-first views-row-last']//*[@class='code option']")),
            flagDeletefromFavoritesOnCard=$(By.xpath("//*[contains(text(),'Удалить из избранного')]"));
}
