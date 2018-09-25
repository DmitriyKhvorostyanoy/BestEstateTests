package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSortingByDescendingPrice extends BaseTest {

    @Test
    public void sortingByDescendingPrice(){
        header.menuHeaderBTN.click();
        header.categoryHousesInMenu.click();
        categoryFilterPage.findBTN.click();
        categoryFilterResultPage.titleFlatsCategoryResultPage.shouldHave(Condition.exactText("Дома"));
        categoryFilterResultPage.default_value_of_dropdown_list_of_sorting.shouldBe(Condition.visible);
        categoryFilterResultPage.open_sorting_filter.click();
        categoryFilterResultPage.sort_by_Descending_price.click();
        Selenide.sleep(3000);
        int price1=categoryFilterResultPage.getPriceDigitOnFirstObject();
        int price4=categoryFilterResultPage.getPriceDigitOnFourthObject();
        assertTrue(price1>price4);
    }
}

