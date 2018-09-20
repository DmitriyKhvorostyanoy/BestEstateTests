package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static SelenideElement   flatsBlock=$(By.xpath("//*[@id='block-views-7daa752737706f1d1d68dd608f549f5e']//*[@class='views-row views-row-1 views-row-odd views-row-first']")),
                                    quantityOfObjectsInFlatsBlock=$(By.xpath("//*[@id='block-views-7daa752737706f1d1d68dd608f549f5e']//*[@class='views-row views-row-1 views-row-odd views-row-first']//*[@class='views-field views-field-nid']//strong")),
                                    showBTNinFlatsBlock=$(By.xpath("//*[@id='block-views-7daa752737706f1d1d68dd608f549f5e']//*[@class='views-row views-row-1 views-row-odd views-row-first']//*[contains(text(),'Показать')]"));
}