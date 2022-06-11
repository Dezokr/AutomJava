package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class tarjetaPage extends util {
    /*VARIABLES DE ELEMENTOS WEB*/
    public static String numCard;
    public static String cvv;
    public static String expM;
    public static String expA;
    @FindBy(xpath = "//*[contains(text(),'Card Number:')]") protected WebElement lbl_cardNumber;
    @FindBy(xpath = "//*[contains(text(),'CVV:')]") protected WebElement lbl_cardCvv;
    @FindBy(xpath = "//*[contains(text(),'Exp')]") protected WebElement lbl_cardExp;

    public tarjetaPage() {
        PageFactory.initElements(driver,this);
    }

    public void getCardNumber(){
        wait30.until(ExpectedConditions.visibilityOf(lbl_cardNumber));
        String cNumber = lbl_cardNumber.getText();
        numCard = cNumber.replace("Card Number:- ","");
        System.out.println(numCard);
    }

    public void getCardCVV(){
        wait30.until(ExpectedConditions.visibilityOf(lbl_cardCvv));
        String cCvv = lbl_cardCvv.getText();
        cvv = cCvv.replace("CVV:- ","");
        System.out.println(cvv);
    }

    public void getCardExp(){
        wait30.until(ExpectedConditions.visibilityOf(lbl_cardExp));
        String cExp = lbl_cardExp.getText();
        String fecha[] = cExp.replace("Exp:- ","").split("/");
        expM = fecha[0];
        expA = fecha[1];
        System.out.println("El mes es: "+expM);
        System.out.println("El anio es: "+expA);
    }
}
