package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class carritoPage extends util {
    @FindBy(name = "quantity") protected WebElement cb_quantity;
    @FindBy(xpath = "//input[@value='Buy Now']") protected  WebElement btn_buy;

    public carritoPage() {
        PageFactory.initElements(driver,this);
    }

    public void selectQuantity(String cant){
        wait30.until(ExpectedConditions.elementToBeClickable(cb_quantity));
        new Select(cb_quantity).selectByValue(cant);
    }

    public void clickBuy(){
        wait30.until(ExpectedConditions.elementToBeClickable(btn_buy)).click();
    }


}

