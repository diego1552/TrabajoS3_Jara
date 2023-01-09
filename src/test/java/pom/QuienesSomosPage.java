package pom;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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
    public void validarDesplieguePagina() {
        esperarAElementoWeb(ttlQuienesSomos);
        validarTextoElemento("Una alianza de los comercios", ttlQuienesSomos);
        validarTextoElemento("Quiénes somos", breadcrumbQuienesSomos);
        esperarAElementoWeb(breadcrumbQuienesSomos);
        esperarAElementoWeb(imgBanner);

    }

    public void validarDespliegueContenido() {

        esperarAElementoWeb(imgIzquierda);

        String contenido1="Nuestra compañía nace del esfuerzo por desarrollar la industria de medios de pago electrónicos en Chile. Desde hace más de tres décadas trabajamos para apoyar el crecimiento y la digitalización de todos los comercios del país, adaptando nuestros servicios a sus necesidades, tamaños y rubros.";
        String contenido2="Somos el mayor ecosistema de soluciones tecnológicas para el desarrollo del comercio, dedicado a conectar comercios y personas mediante soluciones de pago sin efectivo, o cashless, que faciliten y garanticen sus transacciones a través de plataformas amigables, confiables y seguras.";
        String contenido3="Contamos con cerca de 700 colaboradores comprometidos en ofrecer soluciones innovadoras a nuestra red de más de 200.000 emprendedores y negocios –pequeños, medianos o grandes— incluyendo Fintechs conectadas a nuestra red. Junto a ellos, formamos una red que crece día a día, con un promedio de 8 millones de transacciones diarias.";
        String contenido4="Nos enfocamos en la búsqueda incesante de tecnología que facilite las transacciones de compraventa en la vida cotidiana, y buscamos la colaboración para crecer junto con nuestros clientes. Por eso, nuestras soluciones son diseñadas en alianza con expertos, además de otros actores de la sociedad, con el objetivo de aportar al desarrollo de comercios y emprendedores, y así, continuar liderando el mercado.";

        validarTextoElemento(contenido1, parrafo1);
        validarTextoElemento(contenido2, parrafo2);
        validarTextoElemento(contenido3, parrafo3);
        validarTextoElemento(contenido4, parrafo4);
    }

    public void validarDespliegueCards() {
        String mision="Liderar con seguridad, agilidad y eficiencia las soluciones de pago, sirviendo con excelencia a nuestros clientes, innovando constantemente y aportando al desarrollo de nuestro entorno con equipos altamente motivados y comprometidos.";
        String proposito="Conectar personas y negocios a través de soluciones flexibles e innovadoras, aportando así al desarrollo y la evolución del país y la sociedad.";
        String sueño="Hoy nos encontramos en un intenso proceso de transformación organizacional para ser líderes digitales de soluciones para el comercio regional.";
        validarTextoElemento(mision, cardMision);
        validarTextoElemento(proposito, cardProposito);
        validarTextoElemento(sueño, cardSueño);
    }

}
