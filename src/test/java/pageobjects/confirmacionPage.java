package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class confirmacionPage extends util {
    @FindBy(xpath = "//*[text()='Order ID']//preceding::h2") protected WebElement lblConfirm;
    @FindBy(xpath = "//*[text()='Order ID']//following::h3/strong") protected WebElement lblOrderId;

    public confirmacionPage() {
        PageFactory.initElements(driver,this);
    }

    public void getConfirm(String msg){
        String txtConfirm = wait30.until(ExpectedConditions.visibilityOf(lblConfirm)).getText();
        /*Assert sirve para definir condiciones*/
        Assert.assertEquals(msg,txtConfirm);
    }

    public void getOrder(){
        System.out.println("Su numero de orden es: " + lblOrderId.getText());
    }

}


