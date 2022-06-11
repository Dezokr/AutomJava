package definitions;

import io.cucumber.java.es.*;
import pageobjects.*;

import java.io.IOException;

import static support.util.getEvidences;

public class carritoDefinitions {
    /*VARIABLES*/
    menuPage menu;
    tarjetaPage tarjeta;
    carritoPage carrito;
    pagoPage pago;
    confirmacionPage confirmacion;


    public carritoDefinitions() {
        /*Inicializar variables*/
        menu = new menuPage();
        tarjeta = new tarjetaPage();
        carrito = new carritoPage();
        pago = new pagoPage();
        confirmacion = new confirmacionPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("se genera el número de tarjeta")
    public void seGeneraElNumeroDeTarjeta() throws IOException {
        menu.clickGenCard();
        menu.activeWindow();
        tarjeta.getCardNumber();
        tarjeta.getCardCVV();
        tarjeta.getCardExp();
        tarjeta.scrollVertical();
        getEvidences();
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
    public void ingresaDatosDeLaTarjeta() throws IOException {
        pago.setCardNum(tarjetaPage.numCard);
        pago.setMonthExp(tarjetaPage.expM);
        pago.setYearExp(tarjetaPage.expA);
        pago.setCardCVV(tarjetaPage.cvv);
        getEvidences();
    }

    @Y("paga el producto")
    public void pagaElProducto() {
        pago.scrollVertical();
        pago.payProduct();
    }

    @Entonces("validar mensaje de pago {string}")
    public void validarMensajeDePago(String msg) throws IOException {
        confirmacion.getConfirm(msg);
        getEvidences();
        confirmacion.getOrder();
    }
}
