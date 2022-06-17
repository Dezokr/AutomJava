#language:es
@primerafuncionalidad
  Característica: Funcionalidad del carrito de compra
  @smoke
    Escenario: Compra de un producto
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "5"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Entonces validar mensaje de pago "Payment successfull!"
  @regresion
    Esquema del escenario: : Compra de un producto con varias cantidades
      Dado que la web esta operativa
      Cuando se genera el número de tarjeta
      Y selecciona la cantidad "<cant>"
      Y realiza la compra
      E ingresa datos de la tarjeta
      Y paga el producto
      Entonces validar mensaje de pago "<msg>"
      Ejemplos: Tabla de cantidades
        | cant  |msg|
        |4      |Payment successfull!|
        |6      |Payment Failed!     |

    Escenario: Validacion de tarjeta en blanco
      Dado que la web esta operativa
      Cuando selecciona la cantidad "3"
      Y realiza la compra
      Y selecciona el mes "04"
      Y selecciona el año "2024"
      Entonces validar el mensaje del cuadro de dialogo "Check card number is 16 digits!"