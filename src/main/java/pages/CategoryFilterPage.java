package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryFilterPage {
    public  static SelenideElement  findBTN=$(By.xpath("//*[text()='Найти']")),
                                    typeOfFlatsFilter=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-type-apartment jquery-once-2-processed']")),
                                    ekonomKlassCheckBox=$(By.xpath("//*[@class='item checkbox inner  ' and contains(text(),'Эконом класс')]")),
                                    bisnessKlassCheckBox=$(By.xpath("//*[@class='item checkbox inner  ' and contains(text(),'Бизнес/Премиум класс')]")),
                                    number_rooms_filter=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-number-rooms jquery-once-2-processed']")),
                                    one_room_chckbx=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-number-rooms jquery-once-2-processed']//*[text()='1 комната']")),
                                    three_room_chckbx=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-number-rooms jquery-once-2-processed']//*[text()='3 комнаты']")),
                                    area_filter=$("#edit-area-wrapper"),
                                    edit_area_min=$("#edit-area-min"),
                                    edit_area_max=$("#edit-area-max"),
                                    price_filter=$("#edit-price-wrapper"),
                                    eur_chckbx=$("#eur"),
                                    min_price=$("#edit-price-min"),
                                    max_price=$("#edit-price-max"),
                                    district_filter=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-district jquery-once-2-processed']")),
                                    district1=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-district jquery-once-2-processed']//*[contains(text(),'зержинский')]")),
                                    district2=$(By.xpath("//*[@class='views-exposed-widget select-rebuild edit-district jquery-once-2-processed']//*[contains(text(),'иевский')]"));

public static void setting_area_and_price_filter (String minArea,String maxArea,String minPrice,String maxPrice){
    area_filter.hover();
    edit_area_min.sendKeys("\b\b");
    edit_area_min.sendKeys(minArea);
    edit_area_max.sendKeys("\b\b\b");
    edit_area_max.sendKeys(maxArea);
    price_filter.hover();
    min_price.sendKeys("\b\b\b\b\b");
    min_price.sendKeys(minPrice);
    max_price.sendKeys("\b\b\b\b\b\b\b");
    max_price.sendKeys(maxPrice);
}
    public static void setFlatsCategory() {
       typeOfFlatsFilter.hover();
       ekonomKlassCheckBox.click();
       bisnessKlassCheckBox.click();
    }

    public void setRoomQuantity() {
        number_rooms_filter.hover();
        one_room_chckbx.click();
        three_room_chckbx.click();
    }

}
