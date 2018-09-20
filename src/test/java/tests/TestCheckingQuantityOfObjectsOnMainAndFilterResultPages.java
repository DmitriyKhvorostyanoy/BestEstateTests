package tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static pages.CategoryFilterResultPage.divWithAllObjectsInCategory;
import static pages.MainPage.quantityOfObjectsInFlatsBlock;

public class TestCheckingQuantityOfObjectsOnMainAndFilterResultPages extends BaseTest {

   @Test
    public void testFlatsFilter() {
        mainPage.flatsBlock.hover();
         mainPage.quantityOfObjectsInFlatsBlock.shouldBe(Condition.visible);
        String countOfFlatsInBlockOn_MainPage = quantityOfObjectsInFlatsBlock.getText();
         System.out.println(countOfFlatsInBlockOn_MainPage);
        mainPage.showBTNinFlatsBlock.click();
         // header.menuHeaderBTN.click();
        //  header.categoryFlatsInMenu.click();
        categoryFilterPage.findBTN.click();
        categoryFilterResultPage.titleFlatsCategoryResultPage.shouldHave(Condition.exactText("Квартиры"));
        String flatsCountityOnFilterResultPage= String.valueOf(divWithAllObjectsInCategory.size());
       System.out.println(flatsCountityOnFilterResultPage);
        assertEquals(countOfFlatsInBlockOn_MainPage,flatsCountityOnFilterResultPage);
    }
}