package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import java.io.FileNotFoundException;

public class DownloadPDF extends BaseTest {

    @DisplayName("Проверка связи с агентом")
    @Description("гость отправляет форму со страницы проперти чтобы агент с ним связался")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void downloadPDF() throws FileNotFoundException, InterruptedException {
        mainPage.fillAndSubmitSearchField("дом");
        searchResultPage.podrobneeBTNonPropertyCard.click();
        propertyPage.dwnldPDF();
    }
}
