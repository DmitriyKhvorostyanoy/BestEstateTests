package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class PropertyPage {
    public  static SelenideElement  contactMeBTN = $ (By.xpath("//*[@class='row']//*[contains(text(),'Связаться с агентом')]")),
                                    modalNameField=$ ("#edit-submitted-name"),
                                    modalPhoneField=$ ("#edit-submitted-phone"),
                                    modalMessageField=$ ("#edit-submitted-message"),
                                    modalCheckbox=$ ("#edit-submitted-soglashenie-1"),
                                    modalSubmitBTN=$("#edit-webform-ajax-submit-9"),
                                    modalConfirmationAfterSubmiting=$(By.xpath("//*[@class='webform-confirmation']//*[contains(text(),'Cпасибо за заявку')]")),
                                    //pressOkToCloseForm=$(By.xpath("//*[contains(text(),'Вернуться к форме')]")),
                                    pressOkToCloseForm=$(By.xpath("//*[@class='close']")),
                                    PDFdownload=$(By.xpath("//a[contains(text(),'Скачать PDF')]"));

public static void fillContactForm(String name, String phone, String message){
    modalNameField.sendKeys(name);
   // modalMessageField.sendKeys("\b\b\b\b\b");
    modalPhoneField.setValue(phone);
    modalMessageField.sendKeys(message);
    modalCheckbox.click();
    modalSubmitBTN.shouldBe(Condition.enabled).click();
    modalConfirmationAfterSubmiting.should(Condition.exist);
    pressOkToCloseForm.click();
}
public static void dwnldPDF() throws FileNotFoundException, InterruptedException {
   File pdf = PDFdownload.download();
    System.out.println("FILE Path: " + pdf.getPath());
    pdf.exists();
    Thread.sleep(3000);
    pdf.delete();
}

}
