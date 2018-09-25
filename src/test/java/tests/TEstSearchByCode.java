package tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TEstSearchByCode extends BaseTest {
    @Test
    public void searchByCodeOfProperty() {
        header.fillAndSubmitSearchField("32654");//код самого дорого проперти на сайте
        searchResultPage.pageTitle.shouldHave(Condition.exactText("Результаты поиска"));
        assertEquals("Код: 32654",searchResultPage.codeOnPropertyCard.getText());

    }
}
