package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestSearchByCode extends BaseTest {
    @DisplayName("Поиск по коду недвижимости")
    @Description("вводим в поле поиска в хедере валидный код и на  страице результатов поиска смотрим чтоб было найдена одна карточка с таким кодом")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void searchByCodeOfProperty() {
        header.fillAndSubmitSearchField("32654");//код самого дорого проперти на сайте
        searchResultPage.pageTitle.shouldHave(Condition.exactText("Результаты поиска"));
        assertEquals("Код: 32654",searchResultPage.codeOnPropertyCard.getText());

    }
}
