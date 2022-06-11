package support;

import org.openqa.selenium.support.ui.WebDriverWait;
import definitions.hooks;
import java.time.Duration;
import java.util.Set;

public class util extends hooks {
    public static WebDriverWait wait30;

    public util() {
        wait30 = new WebDriverWait(driver, 30);
    }

    /*SELECCIONAR VENTANA ACTIVA*/
    public void activeWindow(){
        Set<String> identifiers = driver.getWindowHandles();
        for(String identify:identifiers){
            driver.switchTo().window(identify);
        }
    }

    public void defaultWindow(){
        driver.close();
        /*Regresa a ventana inicial*/
        driver.switchTo().window("");
    }
}
