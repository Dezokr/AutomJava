package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {

    /*VARIABLES DE ELEMENTOS WEB*/
    @FindBy(linkText = "Generate Card Number") protected WebElement genCard_link;
    @FindBy(css = "#nav > a:nth-child(2)") protected WebElement genCard_css;
    /*https://www.guru99.com/xpath-selenium.html*/
    @FindBy(xpath = "//nav/a[@href='cardnumber.php']") protected WebElement genCard_xpath;

    /*CONSTRUCTOR*/
    public menuPage() {
        PageFactory.initElements(driver, this);
    }

    /**/
    public void clickGenCard(){
        wait30.until(ExpectedConditions.elementToBeClickable(genCard_link));
        genCard_link.click();
    }

    public void selectQuantity(){
        /*wait30.until(ExpectedConditions.elementToBeClickable(()))*/
    }
}
