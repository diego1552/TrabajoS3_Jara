package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.BaseClass;

public class ServicioTarifasPage extends BaseClass {

    public ServicioTarifasPage(WebDriver driver) {
        super(driver);
    }

    By locatorTtlServiciosTarifas = By.xpath("//h2[contains(text(),'Servicios y Tarifas')]");
    By locatorBtnContinuar = By.xpath("//a[contains(text(),'Continuar')]");
    By locatorBtnAceptarPoliticas = By.xpath("//a[contains(text(),'Acepto')]");
    By locatorTtlServiciosTransbank = By.xpath("//h2[contains(text(),'Servicios que presta')]");


    //Acciones de página

    public String obtenerTitulo(){
        return obtenerTexto(esperarAElementoWeb(locatorTtlServiciosTarifas));
    }

    public void continuarServicioTarifa(){
        click(esperarAElementoWeb(locatorBtnContinuar));
    }

    public void aceptarPolitica(){
       click(esperarAElementoWeb(locatorBtnAceptarPoliticas));
    }

    public String obtenerTituloServiciosTarifasFinal(){
        return obtenerTexto(esperarAElementoWeb(locatorTtlServiciosTransbank));
    }

}
