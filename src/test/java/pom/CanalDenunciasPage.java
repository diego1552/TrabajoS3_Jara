package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.BaseClass;

public class CanalDenunciasPage extends BaseClass {
    public CanalDenunciasPage(WebDriver driver) {
        super(driver);
    }
    By locatorTtlCanalDenuncias = By.xpath("//h1");
    By locatorBtnVerFormulario = By.xpath("//a[contains(text(),'Ver formulario de denuncia')]");
    By locatorCheckLavdoActivos = By.xpath("//input[@value='Lavado de activos']");
    By locatorTxtNombre = By.id("pjCF_field_473");
    By locatorTxtCargo = By.id("pjCF_field_475");
    By locatorBtnEnviar = By.xpath("//button[contains(text(),'Enviar')]");
    By locatorMsjError = By.xpath("//li[contains(text(),'Este campo es requerido.')]");

    public String obtenerTitulo(){
        return obtenerTexto(esperarAElementoWeb(locatorTtlCanalDenuncias));
    }

    public void verFormulario(){
        click(esperarAElementoWeb(locatorBtnVerFormulario));
    }

    public void checkLavadoActivos(){
        click(esperarAElementoWeb(locatorCheckLavdoActivos));

    }
    public void ingresoDenunciaFalsa(String nombre,String cargo){
        agregarTexto(esperarAElementoWeb(locatorTxtNombre),nombre);
        agregarTexto(esperarAElementoWeb(locatorTxtCargo),cargo);
        click(esperarAElementoWeb(locatorBtnEnviar));
    }

    public String obtenerMensajeError(){
        return obtenerTexto(esperarAElementoWeb(locatorMsjError));
    }

}
