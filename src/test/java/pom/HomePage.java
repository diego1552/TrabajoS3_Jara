package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.BaseClass;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadores de la page y las acciones
    By locatorTtlEncabezado = By.xpath("//h1[contains(text(),'Tu máquina móvil POS sin costo de arriendo a solo $9.990')]");
    By locatorBtnLaQuieroMobilePos = By.xpath("(//button[contains(text(),'La Quiero')])[1]");
    By locatorBtnLaQuieroWebpayCl = By.xpath("//h2[contains(text(),'Link de pago Webpay.cl con vitrina web')]/following::button[1]");
    By locatorLinkServiciosTarifas = By.xpath("//a[contains(text(),'Servicios y Tarifas')]");
    By locatorLinkCanalDenuncias = By.xpath("//a[contains(text(),'Canal de Denuncias Ley N°20.393')]");
    By locatorLinkWix = By.xpath("//h2[contains(text(),'Crea tu tienda online con Wix')]//following::a[contains(text(),'Ver detalle del producto')]");
    By locatorLinkQR = By.xpath("//h2[contains(text(),'Cobra con tu celular')]//following::a[contains(text(),'Ver detalle del producto')]");
    By locatorImgGooglePlay = By.xpath("//*[@data-title='Descárgala en: Google Play Transbank']");
    By locatorTabEquipos = By.xpath("//a[contains(text(),'Equipos')]");
    By locatorTtlApp = By.xpath("//h2[contains(text(),'Descarga la App')]");



    //Definir acciones en el sitio

    public String obtenerEncabezado(){
        return obtenerTexto(esperarAElementoWeb(locatorTtlEncabezado));
    }
    public String obtenerTituloDescargaApp(){
        return obtenerTexto(esperarAElementoWeb(locatorTtlApp));
    }


    public void irLandingPosMobile(){
        click(esperarAElementoWeb(locatorBtnLaQuieroMobilePos));
    }

    public void irLandingWebpayCl(){
        click(esperarAElementoWeb(locatorBtnLaQuieroWebpayCl));
    }

    public void irPaginaServicioTarifa(){
        click(esperarAElementoWeb(locatorLinkServiciosTarifas));
    }

    public void irPaginaCanalDenuncias(){
        click(esperarAElementoWeb(locatorLinkCanalDenuncias));
    }

    public void irPaginaWix(){
        click(esperarAElementoWeb(locatorLinkWix));
        esperarXSegundos(2000);
    }

    public void irPaginaQR(){
        click(esperarAElementoWeb(locatorLinkQR));
        esperarXSegundos(2000);
    }

    public void irPaginaDescargaGooglePlay(){
        click(esperarAElementoWeb(locatorImgGooglePlay));
        esperarXSegundos(4000);
    }

    public void clickPestañaEquipos(){
        click(esperarAElementoWeb(locatorTabEquipos));
    }




}
