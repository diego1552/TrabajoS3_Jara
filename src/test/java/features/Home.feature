Feature: Home Portal Publico
  Yo Como: usuario de Portal Público
  Quiero: poder acceder al header del portal
  Para: poder ver los principales produtos de trasnsbank y encontrar informacion de los demas productos

 # Seccion Hero
  Scenario: Validar despliegue seccion Hero
    Given Se abre portal publico en navegador Google Chrome
    Then Se despliega seccion Hero correctamente

  Scenario: Validar despliegue landing Hero
    Given Se abre portal publico en navegador Google Chrome
    When Presiono boton la Quiero del Hero
    Then Se despliega Landing producto Hero de transbank

    #Seccion Banner Home
  Scenario: Validar Funcion Banner Home 1
    Given Se abre portal publico en navegador Google Chrome
    When Presiono boton del Primer banner
    Then Se despliega Landing producto con titulo POS móvil con chip | Transbank - Portal Publico - Transbank

  Scenario: Validar Funcion Banner Home 2
    Given Se abre portal publico en navegador Google Chrome
    When Presiono boton del Segundo banner
    Then Se despliega Landing producto con titulo Link de pago Webpay.cl | Transbank - Portal Publico - Transbank

  Scenario: Validar Funcion Banner Home 3
    Given Se abre portal publico en navegador Google Chrome
    When Presiono boton del Tercer banner
    Then Se despliega nueva pestaña con titulo Transbank - Charlas T

    #Seccion Tu elijes como vender
  Scenario: Validar despliegue seccion Tu eliges como vender
    Given Se abre portal publico en navegador Google Chrome
    Then Se despliega seccion Tu eliges como vender correctamente

  Scenario: Validar funcion tu elijes como vender Webpay
    Given Se abre portal publico en navegador Google Chrome
    When Presiono Link quiero ver detalle del producto Webpay
    Then Se despliega Landing producto con titulo Webpay Plus - Carrito de compra | Transbank - Portal Publico - QA1 Transbank

  Scenario: Validar funcion tu elijes como vender Wix
    Given Se abre portal publico en navegador Google Chrome
    When Presiono Link quiero ver detalle del producto Wix
    Then Se despliega Landing producto con titulo ecommerce-wix - Portal Publico - QA1 Transbank

  Scenario: Validar funcion tu elijes como vender WebpayCL
    Given Se abre portal publico en navegador Google Chrome
    When Presiono Link quiero ver detalle del producto WebpayCL
    Then Se despliega Landing producto con titulo Link de pago Webpay.cl | Transbank - Portal Publico - QA1 Transbank

  Scenario: Validar funcion tu elijes como vender PosMovil
    Given Se abre portal publico en navegador Google Chrome
    When Cambio al tab Equipos
    And Presiono Link quiero ver detalle del producto PosMovil
    Then Se despliega Landing producto con titulo POS móvil con chip | Transbank - Portal Publico - QA1 Transbank

  Scenario: Validar funcion tu elijes como vender MobilePos
    Given Se abre portal publico en navegador Google Chrome
    When Cambio al tab Equipos
    And Presiono Link quiero ver detalle del producto MobilePos
    Then Se despliega Landing producto con titulo Compra aquí la nueva Maquinita Mobile POS | Transbank - Portal Publico - QA1 Transbank

  Scenario: Validar funcion tu elijes como vender CobroQR
    Given Se abre portal publico en navegador Google Chrome
    When Cambio al tab Equipos
    And Presiono Link quiero ver detalle del producto CobroQR
    Then Se despliega Landing producto con titulo Cobroqr - Portal Publico - QA1 Transbank

    # Seccion Descarga la App
  Scenario: Validar despliegue seccion Descarga la APP
    Given Se abre portal publico en navegador Google Chrome
    Then Se despliega seccion Descarga la App correctamente

  Scenario: Validar Seccion descarga la app google Play
    Given Se abre portal publico en navegador Google Chrome
    When Presiono boton descarga por google play
    Then Se despliega nueva pestaña con titulo App Transbank - Apps en Google Play

  Scenario: Validar Seccion descarga la app Apple store
    Given Se abre portal publico en navegador Google Chrome
    When Presiono boton descarga por App Store
    Then Se despliega nueva pestaña con titulo App Transbank: ventas y abonos en App Store

    #Seccion Lo que tu negocio Necesita
  Scenario: Validar despliegue seccion Lo que tu negocio Necesita
    Given Se abre portal publico en navegador Google Chrome
    Then Se despliega seccion Tenemos todo lo que tu negocio necesita

  Scenario: Validar funcion Tenemos lo que necesitas MobilePos
    Given Se abre portal publico en navegador Google Chrome
    When Presiono Link ver mas del producto MobilePos
    Then Se despliega Landing producto con titulo Compra aquí la nueva Maquinita Mobile POS | Transbank - Portal Publico - QA1 Transbank

  Scenario: Validar funcion Tenemos lo que necesitas PosMovil
    Given Se abre portal publico en navegador Google Chrome
    When Presiono Link ver mas del producto PosMovil
    Then Se despliega Landing producto con titulo POS móvil con chip | Transbank - Portal Publico - QA1 Transbank

  Scenario: VValidar funcion Tenemos lo que necesitas Wix
    Given Se abre portal publico en navegador Google Chrome
    When Cambio al tab Venta Online
    And Presiono Link ver mas del producto Wix
    Then Se despliega Landing producto con titulo ecommerce-wix - Portal Publico - QA1 Transbank

  Scenario: Validar funcion Tenemos lo que necesitas WebpayPlus
    Given Se abre portal publico en navegador Google Chrome
    When Cambio al tab Venta Online
    And Presiono Link ver mas del producto WebpayPlus
    Then Se despliega Landing producto con titulo Webpay Plus - Carrito de compra | Transbank - Portal Publico - QA1 Transbank

  Scenario: Validar funcion Tenemos lo que necesitas WebpayCL
    Given Se abre portal publico en navegador Google Chrome
    When Cambio al tab Link de Pago
    And Presiono Link ver mas del producto WebpayCL
    Then Se despliega Landing producto con titulo Link de Pago Transbank - Webpay.cl