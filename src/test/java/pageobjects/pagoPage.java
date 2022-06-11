package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

import static pageobjects.tarjetaPage.numCard;

public class pagoPage extends util {
    @FindBy(id = "card_nmuber") protected WebElement txtCardNum;
    @FindBy(id = "month") protected WebElement cbxMonth;
    @FindBy(id = "year") protected WebElement cbxYear;
    @FindBy(id = "cvv_code") protected WebElement txtCVV;
    @FindBy(name = "submit") protected WebElement btnPay;


    public pagoPage() {
        PageFactory.initElements(driver,this);
    }

    public void setCardNum(String cn){
        wait30.until(ExpectedConditions.visibilityOf(txtCardNum)).sendKeys(cn);
    }

    public void setMonthExp(String cm){
        new Select(cbxMonth).selectByValue(cm);
    }

    public void setYearExp(String cy){
        new Select(cbxYear).selectByValue(cy);
    }

    public void setCardCVV(String cvv){
        txtCVV.sendKeys(cvv);
    }

    public void payProduct(){
        btnPay.click();
    }
}
