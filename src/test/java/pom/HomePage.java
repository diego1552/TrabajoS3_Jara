package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Hero de la pagina
    @FindBy(xpath = "//h1")
    WebElement ttlHero;
    @FindBy(xpath = "(//button[contains(text(),'La Quiero')])[1]")
    WebElement btnLaQuieroHero;

    // Seecion banners Home
    @FindBy(xpath = "//h2[contains(text(),'Obtén un 50% dcto.')]/following::button[1]")
    WebElement btnBanner1;
    @FindBy(xpath = "//h2[contains(text(),'Cobra con tu link de pago Webpay.cl')]/following::button[1]")
    WebElement btnBanner2;
    @FindBy(xpath = "//h2[contains(text(),'Inspira a otros emprendedores')]/following::button[1]")
    WebElement btnBanner3;

    // Seccion Tu elijes como vender
    @FindBy(xpath = "//*[contains(text(),'Tú eliges cómo quieres')]")
    WebElement ttlComoVender;
    @FindBy(xpath = "//*[contains(text(),'Tú eliges cómo quieres')]/following::p[2]")
    WebElement subTtlComoVender;

    @FindBy(xpath = "//h2[contains(text(),'Vende tu sitio con WebPay')]//following::a[contains(text(),'Ver detalle del producto')]")
    WebElement btnWebpay;
    @FindBy(xpath = "//h2[contains(text(),'Crea tu tienda online con Wix')]//following::a[contains(text(),'Ver detalle del producto')]")
    WebElement btnWix;
    @FindBy(xpath = "//h2[contains(text(),'Link de pago Webpay.cl')]//following::a[contains(text(),'Ver detalle del producto')]")
    WebElement btnWebpayCL;
    @FindBy(xpath = "//a[contains(text(),'Equipos')]")
    WebElement tabEquipos;
    @FindBy(xpath = "//h2[contains(text(),'La maquinita')]//following::a[contains(text(),'Ver detalle del producto')]")
    WebElement btnPosMovil;
    @FindBy(xpath = "//h2[contains(text(),'Vende en cualquier lugar')]//following::a[contains(text(),'Ver detalle del producto')]")
    WebElement btnMobilePos;
    @FindBy(xpath = "//h2[contains(text(),'Cobra con tu celular')]//following::a[contains(text(),'Ver detalle del producto')]")
    WebElement btnLinkQr;


    // seccion descarga la app
    @FindBy(xpath = "//h2[contains(text(),'Descarga la App')]")
    WebElement ttlDescargaApp;

    @FindBy(xpath = "//h2[contains(text(),'Descarga la App')]/following::p")
    WebElement subTtlDescargaApp;

    @FindBy(xpath = "//*[@data-title='Descárgala en: Google Play Transbank']")
    WebElement btnGooglePlay;

    @FindBy(xpath = "//*[@data-title='Descárgala en: App Store Transbank']")
    WebElement btnAppStore;

    //lo que tu negocio Necesita
    @FindBy(xpath = "//h2[contains(text(),'Tenemos todo')]")
    WebElement ttlTenemosTodo;
    @FindBy(xpath = "//h2[contains(text(),'Tenemos todo')]/following::p")
    WebElement subTtlTenemosTodo;

    @FindBy(xpath = "//h3[contains(text(),'Venta online')]")
    WebElement tabVentaOnline;
    @FindBy(xpath = "//h3[contains(text(),'Link de pago')]")
    WebElement tabLinkPago;


    @FindBy(xpath = "//a[@data-product='Mobile POS']")
    WebElement btnVerMobilePos;
    @FindBy(xpath = "//a[@data-product='POS Móvil']")
    WebElement btnVerPosMovil;
    @FindBy(xpath = "//a[@data-product='Crea tu sitio web con alianza WIX']")
    WebElement btnVerWix;
    @FindBy(xpath = "//a[@data-product='Webpay Plus']")
    WebElement btnVerWebpayPlus;
    @FindBy(xpath = "//a[@data-product='Link de pago Webpay.cl']")
    WebElement btnVerWebpayCL;


    //Definir acciones en el sitio

    public String obtenerEncabezado(){
        return obtenerTexto(esperarAElementoWeb(ttlHero));
    }
    public void irLandingPosMobile(){
        click(esperarAElementoWeb(btnLaQuieroHero));
    }

    public void validarHero() {
        
        esperarAElementoWeb(ttlHero);
        validarTextoElemento("Tu máquina móvil POS sin costo de arriendo a solo $4.990", ttlHero);
    }

    public void irLandingProductoHero(){
        
        click(btnLaQuieroHero);
    }

    //Seccion Banner Home

    public void irLandingBanner1(){
        
        click(btnBanner1);
    }

    public void irLandingBanner2(){
        
        click(btnBanner2);
    }

    public void irLandingBanner3(){
        
        click(btnBanner3);
    }

    // Seccion Como quieres vender
    public void validarComoVender() {
        esperarAElementoWeb(ttlComoVender);
        esperarAElementoWeb(subTtlComoVender);
        validarTextoElemento("Tú eliges cómo quieres vender,\nte damos las opciones", ttlComoVender);
        validarTextoElemento("¿Necesitas vender por internet o de forma presencial?\nEn Transbank tenemos opciones que se ajustan a tu necesidad", subTtlComoVender);
    }

    public void cambiarTabEquipos() {
        
        click(tabEquipos);
    }

    public void irLandingWebpay(){
        click(esperarAElementoWeb(btnWebpay));
    }

    public void irLandingWix(){
        
        click(btnWix);
    }

    public void irLandingWebpayCL(){
        
        click(btnWebpayCL);
    }

    public void irLandingPosMovil(){
        
        click(btnPosMovil);
    }

    public void irLandingMobilePos(){
        
        click(btnMobilePos);
    }

    public void irLandingCobroQR(){
        
        click(btnLinkQr);
    }

    //Seccion Descarga la App

    public void validarDescargaLaApp() {
        
        esperarAElementoWeb(ttlDescargaApp);
        esperarAElementoWeb(subTtlDescargaApp);
        validarTextoElemento("Descarga la App Transbank, visualiza tus ventas y abonos", ttlDescargaApp);
        validarTextoElemento("Si ya eres cliente y parte del mundo Transbank, te invitamos a descargar nuestra App, donde podrás revisar tus ventas, abonos y el crecimiento de tu negocio desde celulares.", subTtlDescargaApp);
    }

    public void descargaGooglePlay(){
        
        esperarAElementoWeb(btnGooglePlay);
        scrollElementoWeb(btnGooglePlay);
        click(btnGooglePlay);
    }

    public void descargaAppStore(){
        
        esperarAElementoWeb(btnAppStore);
        scrollElementoWeb(btnAppStore);
        click(btnAppStore);
    }

    public void validarCargaLandingProducto(String titlePage){
        esperarXSegundos(5);
        validarVistaPagina(titlePage);
    }

    public void validarCargaNuevaPestaña(String titlePage) throws InterruptedException {
        
        esperarXSegundos(3);
            changeTab();
            validarVistaPagina(titlePage);
    }

    //Seccion lo que tu negocio necesita

    public void validarNegocioNecesita() {
        esperarAElementoWeb(ttlTenemosTodo);
        esperarAElementoWeb(subTtlTenemosTodo);
        validarTextoElemento("Tenemos todo lo que tu negocio necesita", ttlTenemosTodo);
        validarTextoElemento("Cuéntanos como quieres vender y te recomendamos lo que necesitas", subTtlTenemosTodo);
    }

    public void cambiarTabVentaOnline() {
        
        click(tabVentaOnline);
    }
    public void cambiarTabLinkDePago() {
        
        click(tabLinkPago);
    }


    public void irVerProductoMobilePos(){
        
        click(btnVerMobilePos);
    }

    public void irVerProductoPosMovil(){
        
        click(btnVerPosMovil);
    }

    public void irVerProductoWix(){
        
        click(btnVerWix);
    }


    public void irVerProductoWebpayPlus(){
        
        click(btnVerWebpayPlus);
    }

    public void irVerProductoWebpayCL(){
        
        click(btnVerWebpayCL);
    }


    public void validarCargaAppIos() {
        esperarXSegundos(3);
        changeTab();
        validarNoVistaPagina("Inicio - Portal Publico - QA1 Transbank");
    }
}
