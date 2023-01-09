package pom;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuienesSomosPage extends BaseClass {
    WebDriver driver;

    //
    @FindBy(xpath = "//h1")
    WebElement ttlQuienesSomos;
    @FindBy(xpath = "(//li[@class='breadcrumb-item']/span)[2]")
    WebElement breadcrumbQuienesSomos;
    @FindBy(xpath = "//img[@alt='Quienes Somos Transbank']")
    WebElement imgBanner;
    @FindBy(xpath = "//img[@alt='Una alianza de los comercios']")
    WebElement imgIzquierda;
    @FindBy(xpath = "//p[contains(text(),'Nuestra compañía nace del esfuerzo')]")
    WebElement parrafo1;
    @FindBy(xpath = "//p[contains(text(),'Somos el mayor ecosistema de soluciones')]")
    WebElement parrafo2;
    @FindBy(xpath = "//p[contains(text(),'Contamos con cerca de 700')]")
    WebElement parrafo3;
    @FindBy(xpath = "//p[contains(text(),'Nos enfocamos en la búsqueda incesante')]")
    WebElement parrafo4;

    @FindBy(xpath = "//p[contains(text(),'Liderar con seguridad,')]")
    WebElement cardMision;
    @FindBy(xpath = "//p[contains(text(),'Conectar personas')]")
    WebElement cardProposito;
    @FindBy(xpath = "//p[contains(text(),'Hoy nos encontramos en un intenso proceso')]")
    WebElement cardSueño;
    //metodos

    public QuienesSomosPage(WebDriver driver) {
            super(driver);
    }

}
