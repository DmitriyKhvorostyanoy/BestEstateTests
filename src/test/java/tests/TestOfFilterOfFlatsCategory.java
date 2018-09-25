package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import pages.CategoryFilterResultPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static org.junit.Assert.assertTrue;

public class TestOfFilterOfFlatsCategory extends BaseTest {
    @Test
    public void flatsFilter() throws InterruptedException {
        header.menuHeaderBTN.click();
        header.categoryFlatsInMenu.click();

        categoryFilterPage.typeOfFlatsFilter.hover();
        categoryFilterPage.ekonomKlassCheckBox.click();
        categoryFilterPage.bisnessKlassCheckBox.click();
        categoryFilterPage.number_rooms_filter.hover();
        categoryFilterPage.one_room_chckbx.click();
        categoryFilterPage.three_room_chckbx.click();
        categoryFilterPage.setting_area_and_price_filter("40", "180", "100000", "210000");
        categoryFilterPage.district_filter.hover();
        categoryFilterPage.district1.click();
        categoryFilterPage.district2.click();
        categoryFilterPage.findBTN.click();
        Thread.sleep(5000);
        categoryFilterResultPage.titleFlatsCategoryResultPage.shouldHave(Condition.exactText("Квартиры"));
        categoryFilterResultPage.objects_with1_FlatsInTitle.shouldHave(CollectionCondition.sizeGreaterThan(1));
        categoryFilterResultPage.objects_with3_FlatsInTitle.shouldHave(CollectionCondition.sizeGreaterThan(1));
        categoryFilterResultPage.objects_with2_FlatsInTitle.shouldHave(size(0));
        categoryFilterResultPage.objects_with4_FlatsInTitle.shouldHave(size(0));

        int priceDigit = CategoryFilterResultPage.getPriceDigitOnFirstObject();
        int areaDigit=CategoryFilterResultPage.getAreaDigit();

        assertTrue(priceDigit >= 100000 & priceDigit <= 210000);
        assertTrue(areaDigit >= 40 & areaDigit <=180);

    }

}
