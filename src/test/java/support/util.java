package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import definitions.hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class util extends hooks {
    public static WebDriverWait wait30;
    public static JavascriptExecutor js;
    public util() {
        wait30 = new WebDriverWait(driver, 30);
        js = (JavascriptExecutor) driver;
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
    public void scrollVertical(){
        js.executeScript("window.scrollBy(0,1000)");
    }
    public static void getEvidences() throws IOException {
        /*Obtiene fecha actual*/
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
        String path = "target/evidencias/";
        String name = formato.format(fecha)+"_evidencia.jpg";
        /*Toma screenshoot*/
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        /*Crea evidencia*/
        FileUtils.copyFile(file, new File(path+name));
    }
}
