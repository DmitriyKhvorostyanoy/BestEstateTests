package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.exist;
import static org.junit.Assert.assertEquals;
import static pages.FavoritesPage.*;
import static pages.HeaderPage.favoritesBTN;
import static pages.SearchResultPage.codeOnPropertyCard;
import static tests.BaseTest.header;
import static tests.BaseTest.mainPage;

public class TestAddToFaforitesFromList extends BaseTest{
    @Test
    public void addToFavoritesFromList() throws InterruptedException {
        favoritesBTN.shouldNotHave(Condition.attribute("class","active"));
        header.fillAndSubmitSearchField("дом");
        searchResultPage.likeFlagOnProprtyCard.click();
        String code = codeOnPropertyCard.getAttribute("title");
        //System.out.println(code);
        header.favoritesBTN.shouldHave(Condition.attribute("class","active")).click();
        favoritesPage.favoritesPageTitle.should(exist);
        String codeOnFavPg = codeOnPropertyCardOnFavoritesPAge.getAttribute("title");
        System.out.println(codeOnFavPg);
        assertEquals(code,codeOnFavPg);
       // Thread.sleep(9999999);
    }
    @Test
    public  void deletePropFromFavorites() throws InterruptedException {
        flagDeletefromFavoritesOnCard.click();
        favoritesBTN.shouldNotHave(Condition.attribute("class","active"));
        Selenide.refresh();
        codeOnPropertyCardOnFavoritesPAge.shouldNot(exist);
    }
}