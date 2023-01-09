package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.BaseClass;

public class FooterPage extends BaseClass {
    WebDriver driver;

    //NUESTRA COMPAÑÍA

    @FindBy(xpath = "//a[@data-title='Quiénes somos']")
    WebElement linkQuienesSomos;

    @FindBy(xpath = "//a[@data-title='Historia']")
    WebElement linkHistoria;

    @FindBy(xpath = "//a[@data-title='Qué hacemos']")
    WebElement linkQueHacemos;

    @FindBy(xpath = "//a[@data-title='Noticias Transbank']")
    WebElement linkNoticias;

    @FindBy(xpath = "//a[@data-title='Trabaja con Nosotros']")
    WebElement linkTrabajaConNosotros;


    //GOBIERNO CORPORATIVO

    @FindBy(xpath = "//a[@data-title='Directorio']")
    WebElement linkDirectorio;

    @FindBy(xpath = "//a[@data-title='Administración']")
    WebElement linkAdministracion;

    @FindBy(xpath = "//a[@data-title='Accionistas']")
    WebElement linkAccionistas;

    @FindBy(xpath = "//a[@data-title='Junta de Accionistas']")
    WebElement linkJuntaAccionistas;

    //RELACIÓN CON INVERSIONISTAS

    @FindBy(xpath = "//a[@data-title='Estados financieros']")
    WebElement linkEstadosFinancieros;

    @FindBy(xpath = "//a[@data-title='Memorias anuales']")
    WebElement linkMemoriasAnuales;

    @FindBy(xpath = "//a[@data-title='Emision Deuda Pública']")
    WebElement linkEmisionDeudaPublica;

    @FindBy(xpath = "//a[@data-title='Contacto Inversionistas']")
    WebElement linkContactoInversionista;

    //SOSTENIBILIDAD

    @FindBy(xpath = "//a[@data-title='Reporte de Sostenibilidad']")
    WebElement linkReporteSostenibilidad;

    //SECCIONES DE INTERÉS
    @FindBy(xpath = "//a[@data-title='Onepay']")
    WebElement linkOnepay;

    @FindBy(xpath = "//a[@data-title='Transnews']")
    WebElement linkTransnews;

    @FindBy(xpath = "//a[@data-title='Transbank Developers']")
    WebElement linkTransbankDeveloper;

    @FindBy(xpath = "//a[@data-title='Servicios y Tarifas']")
    WebElement linkServiciosTarifas;

    @FindBy(xpath = "//a[@data-title='Contratos']")
    WebElement linkContratos;

    @FindBy(xpath = "//a[@data-title='Canal de Denuncias Ley N°20.393 (Responsabilidad Penal de las Personas Jurídicas)']")
    WebElement linkCanalDenuncias;


    //Metodos
    public FooterPage(WebDriver driver) {
        super(driver);
    }


    //Nuestra Compañia
    public void irMenuQuienesSomos() { click(linkQuienesSomos);
    }

    public void irMenuHistoria() {
        click(linkHistoria);
    }

    public void irMenuQueHacemos() {
        click(linkQueHacemos);
    }

    public void irMenuNoticiasTbk() {
        click(linkNoticias);
    }

    public void irMenuTrabajaConNosotros() {
        click(linkTrabajaConNosotros);
    }

    //Gobierno Corporativo

    public void irMenuDirectorio() {
        click(linkDirectorio);
    }

    public void irMenuAdministracion() {
        click(linkAdministracion);
    }

    public void irMenuAccionistas() {
        click(linkAccionistas);
    }

    public void irMenuJuntaAccionistas() {
        click(linkJuntaAccionistas);
    }

    //Relacion Inversionistas
    public void irMenuEstadosFinancieros() {
        click(linkEstadosFinancieros);
    }
    public void irMenuMemoriasAnuales() {
        click(linkMemoriasAnuales);
    }
    public void irMenuEmisionDeudaPublica() {
        click(linkEmisionDeudaPublica);
    }
    public void irMenuContactoInversionista() {
        click(linkContactoInversionista);
    }
    //Sostenibilidad
    public void irMenuReporteSostenibilidad() {
        click(linkReporteSostenibilidad);
    }
    //seccion de interes
    public void irMenuOnepay() {
        click(linkOnepay);
    }
    public void irMenuTransnews() {
        click(linkTransnews);
    }
    public void irMenuTransbankDeveloper() {
        click(linkTransbankDeveloper);
    }
    public void irMenuServiciosTarifas() {
        click(linkServiciosTarifas);
    }
    public void irMenuContratos() {
        click(linkContratos);
    }
    public void irMenuCanalDenuncias() {
        click(linkCanalDenuncias);
    }

}
