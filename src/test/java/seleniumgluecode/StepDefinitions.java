package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pom.FooterPage;
import pom.HomePage;
import pom.QuienesSomosPage;

public class StepDefinitions {
    public WebDriver driver;

    //Atributos
    HomePage homePage;
    FooterPage footerPage;
    QuienesSomosPage quienesSomosPage;
    @After
    public void quitDriver() {
        driver.quit();
    }

    //Given Estoy en el sitio https://publico.transbank.cl/
    @Given("Se abre portal publico en navegador Google Chrome")
    public void Se_abre_portal_publico_navegador_Google_Chrome() {
        String rutaDriver = System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver",rutaDriver);
        driver = new ChromeDriver();
        homePage= PageFactory.initElements(driver,HomePage.class);
        footerPage= PageFactory.initElements(driver,FooterPage.class);
        quienesSomosPage= PageFactory.initElements(driver,QuienesSomosPage.class);
        homePage.cargarPagina("https://publicoqa.transbank.cl/");
        homePage.maximizarBrowser();
    }
    @Then("Se despliega seccion Hero correctamente")
    public void se_despliega_seccion_hero_correctamente() {
        try {
            homePage.validarHero();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono boton la Quiero del Hero")
    public void presiono_boton_la_quiero_del_hero() {
        try {
            homePage.irLandingProductoHero();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }

    }

    @Then("Se despliega Landing producto Hero de transbank")
    public void se_despliega_landing_producto_hero_de_transbank() {
        try {
            homePage.validarCargaLandingProducto("Compra aquí la nueva Maquinita Mobile POS | Transbank - Portal Publico - Transbank");
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }


    @When("Presiono boton del Primer banner")
    public void presionoBotonDelPrimerBanner() {
        try {
            homePage.irLandingBanner1();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono boton del Segundo banner")
    public void presionoBotonDelSegundoBanner() {
        try {
            homePage.irLandingBanner2();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono boton del Tercer banner")
    public void presionoBotonDelTercerBanner() {
        try {
            homePage.irLandingBanner3();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Then("Se despliega Landing producto con titulo (.*)$")
    public void seDespliegaLandingProductoConTitulo(String titlePage) {
        try {
            homePage.validarCargaLandingProducto(titlePage);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }
    @Then("Se despliega seccion Tu eliges como vender correctamente")
    public void seDespliegaSeccionTuEligesComoVenderCorrectamente() {
        try {
            homePage.validarComoVender();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono Link quiero ver detalle del producto Webpay")
    public void presionoLinkQuieroVerDetalleDelProductoWebpay() {
        try {
            homePage.irLandingWebpay();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono Link quiero ver detalle del producto Wix")
    public void presionoLinkQuieroVerDetalleDelProductoWix() {
        try {
            homePage.irLandingWix();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono Link quiero ver detalle del producto WebpayCL")
    public void presionoLinkQuieroVerDetalleDelProductoWebpayCL() {
        try {
            homePage.irLandingWebpayCL();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Cambio al tab Equipos")
    public void cambioAlTabEquipos() {
        try {
            homePage.cambiarTabEquipos();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @And("Presiono Link quiero ver detalle del producto PosMovil")
    public void presionoLinkQuieroVerDetalleDelProductoPosMovil() {
        try {
            homePage.irLandingPosMovil();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @And("Presiono Link quiero ver detalle del producto MobilePos")
    public void presionoLinkQuieroVerDetalleDelProductoMobilePos() {
        try {
            homePage.irLandingMobilePos();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @And("Presiono Link quiero ver detalle del producto CobroQR")
    public void presionoLinkQuieroVerDetalleDelProductoCobroQR() {
        try {
            homePage.irLandingCobroQR();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Then("Se despliega seccion Descarga la App correctamente")
    public void seDespliegaSeccionDescargaLaAppCorrectamente() {
        try {
            homePage.validarDescargaLaApp();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono boton descarga por google play")
    public void presionoBotonDescargaPorGooglePlay() {
        try {
            homePage.descargaGooglePlay();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono boton descarga por App Store")
    public void presionoBotonDescargaPorAppStore() {
        try {
            homePage.descargaAppStore();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }
    @Then("Se despliega nueva pestaña con titulo (.*)$")
    public void seDespliegaLandingProductoConTituloNuevaPestaña(String titlePage) {
        try {
            homePage.validarCargaNuevaPestaña(titlePage);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Then("Se despliega seccion Tenemos todo lo que tu negocio necesita")
    public void seDespliegaSeccionTenemosTodoLoQueTuNegocioNecesita() {
        try {
            homePage.validarNegocioNecesita();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Presiono Link ver mas del producto MobilePos")
    public void presionoLinkVerMasDelProductoMobilePos() {
        try {
            homePage.irVerProductoMobilePos();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }

    }

    @When("Presiono Link ver mas del producto PosMovil")
    public void presionoLinkVerMasDelProductoPosMovil() {
        try {
            homePage.irVerProductoPosMovil();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Cambio al tab Venta Online")
    public void cambioAlTabVentaOnline() {
        try {
            homePage.cambiarTabVentaOnline();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @And("Presiono Link ver mas del producto Wix")
    public void presionoLinkVerMasDelProductoWix() {
        try {
            homePage.irVerProductoWix();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @And("Presiono Link ver mas del producto WebpayPlus")
    public void presionoLinkVerMasDelProductoWebpayPlus() {
        try {
            homePage.irVerProductoWebpayPlus();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @When("Cambio al tab Link de Pago")
    public void cambioAlTabLinkDePago() {
        try {
            homePage.cambiarTabLinkDePago();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @And("Presiono Link ver mas del producto WebpayCL")
    public void presionoLinkVerMasDelProductoWebpayCL() {
        try {
            homePage.irVerProductoWebpayCL();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Then("Se despliega nueva pestaña APP tbk")
    public void seDespliegaNuevaPestañaAPPTbkAppTransbankVentasYAbonosEnAppStore() {
            homePage.validarCargaAppIos();
    }

    @When("Presiono menu Quienes Somos desde footer")
    public void presionoMenuQuienesSomosDesdeFooter() {
        try {
            footerPage.irMenuQuienesSomos();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }

    }

    @Then("Se despliega contenido de la pagina Quienes Somos correctamente")
    public void seDespliegaContenidoDeLaPaginaQuienesSomosCorrectamente() {
        try {
            quienesSomosPage.validarDespliegueContenido();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Then("Se despliega tres cards sobre mision, proposito y sueño")
    public void seDespliegaTresCardsSobreMisionPropositoYSueño() {
        try {
            quienesSomosPage.validarDespliegueCards();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Then("Se despliega pagina quienes somos correctamente")
    public void seDespliegaPaginaQuienesSomosCorrectamente() {
        try {
            quienesSomosPage.validarDesplieguePagina();
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }
}
