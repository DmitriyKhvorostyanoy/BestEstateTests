package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.Test;

public class TestSearchByStreetName extends BaseTest {

        @Test
        public void searchByCodeOfProperty() {
            header.fillAndSubmitSearchField("отакара яроша");
            searchResultPage.pageTitle.shouldHave(Condition.exactText("Результаты поиска"));
            searchResultPage.cardsWithSearchedStreet.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(1));
        }
    }

