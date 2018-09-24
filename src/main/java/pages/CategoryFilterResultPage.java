package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CategoryFilterResultPage {
    public static ElementsCollection divWithAllObjectsInCategory = $$(By.xpath("//*[contains(@class,'views-row')]")),
                                    objects_with3_FlatsInTitle=$$(By.xpath("//*[contains(@class,'views-row views-row')]//*[contains(text(),'3 комн')]")),
                                    objects_with2_FlatsInTitle=$$(By.xpath("//*[contains(@class,'views-row views-row')]//*[contains(text(),'2 комн')]")),
                                    objects_with4_FlatsInTitle=$$(By.xpath("//*[contains(@class,'views-row views-row')]//*[contains(text(),'4 комн')]")),
                                    objects_with1_FlatsInTitle=$$(By.xpath("//*[contains(@class,'views-row views-row')]//*[contains(text(),'1 комн')]"));
    public static SelenideElement   titleFlatsCategoryResultPage=$("#page-title"),
                                    priceOnFirstObject=$(By.xpath("//*[contains(@class,'views-row views-row-1 views-row-odd views-row-first')]//*[@class='fix-price']/span[1]")),
                                    areaOnFirstObject=$(By.xpath("//*[contains(@class,'views-row views-row-1 views-row-odd views-row-first')]//*[@class='options-property']/span[1]"));


    public static int getPriceDigit() {
        String stringPrice = priceOnFirstObject.getText();
        System.out.println(stringPrice);
        String price1 = stringPrice.replaceAll("[^0-9]", "");
        System.out.println(price1);
        int priceDigit = Integer.parseInt(price1);
        System.out.println(priceDigit);
        return priceDigit;
    }
    public static int getAreaDigit(){
        String stringArea=areaOnFirstObject.getText();
        String area1 = stringArea.replaceAll("[^0-9\\.]", "");// в кавычках прописываются символы какие нужно остаавить
        System.out.println("this is String "+area1);
        Double area2=Double.parseDouble(area1);
        System.out.println("this is Double "+area2);
        int areaDigit= area2.intValue();
        System.out.println("this is integer "+areaDigit);
        return areaDigit;
    }
}