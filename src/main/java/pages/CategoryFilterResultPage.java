package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CategoryFilterResultPage {
    public static ElementsCollection divWithAllObjectsInCategory = $$(By.xpath("//*[contains(@class,'views-row')]"));
    public static SelenideElement titleFlatsCategoryResultPage=$("#page-title");

public static void getQuantityOfFlats(){
  /*  WebElement divContent = $(By.xpath("//*[contains(@class,'view-id-property_categories')]//*[@class='view-content']"));
    List<WebElement> flatsQuantity = divContent.findElements(By.xpath("//*[contains(@class,'views-row')]"));
    int flatsCount =flatsQuantity.size();
    System.out.println(flatsCount);*/

    String flatsCountityOnFilterResultPage= String.valueOf(divWithAllObjectsInCategory.size());
    System.out.println(flatsCountityOnFilterResultPage);
}
}