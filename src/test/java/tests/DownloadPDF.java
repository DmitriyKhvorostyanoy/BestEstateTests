package tests;

import org.junit.Test;

import java.io.FileNotFoundException;

public class DownloadPDF extends BaseTest {
    @Test
    public void downloadPDF() throws FileNotFoundException, InterruptedException {
        mainPage.fillAndSubmitSearchField("дом");
        searchResultPage.podrobneeBTNonPropertyCard.click();
        propertyPage.dwnldPDF();
    }
}
