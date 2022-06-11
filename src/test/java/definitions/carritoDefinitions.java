package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Y;
import pageobjects.carritoPage;
import pageobjects.menuPage;
import pageobjects.pagoPage;
import pageobjects.tarjetaPage;

public class carritoDefinitions {
    /*VARIABLES*/
    menuPage menu;
    tarjetaPage tarjeta;
    carritoPage carrito;
    pagoPage pago;


    public carritoDefinitions() {
        /*Inicializar variables*/
        menu = new menuPage();
        tarjeta = new tarjetaPage();
        carrito = new carritoPage();
        pago = new pagoPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("se genera el número de tarjeta")
    public void seGeneraElNumeroDeTarjeta() {
        menu.clickGenCard();
        menu.activeWindow();
        tarjeta.getCardNumber();
        tarjeta.getCardCVV();
        tarjeta.getCardExp();
        tarjeta.defaultWindow();
    }

    @Y("selecciona la cantidad {string}")
    public void seleccionaLaCantidad(String cant) {
        carrito.selectQuantity(cant);

    }

    @Y("realiza la compra")
    public void realizaLaCompra() {
        carrito.clickBuy();
    }

    @E("ingresa datos de la tarjeta")
    public void ingresaDatosDeLaTarjeta() {
        pago.setCardNum(tarjetaPage.numCard);
        pago.setMonthExp(tarjetaPage.expM);
        pago.setYearExp(tarjetaPage.expA);
        pago.setCardCVV(tarjetaPage.cvv);
    }

    @Y("paga el producto")
    public void pagaElProducto() {
        pago.payProduct();
    }
}
