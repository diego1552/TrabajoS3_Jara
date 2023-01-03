package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pom.FormRegistroProductoPage;
import pom.HomePage;
import pom.ProductosPage;

public class StepDefinitions {
    public WebDriver driver;

    //Atributos
    HomePage homePage;
    ProductosPage productosPage;
    FormRegistroProductoPage formRegistroProductoPage;

    //Given Estoy en el sitio https://publico.transbank.cl/
    @Given("Estoy en el sitio https:\\/\\/publico.transbank.cl\\/")
    public void estoy_en_el_sitio_https_publico_transbank_cl() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\domingo.saavedra\\Downloads\\DemoSelenium3\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage= PageFactory.initElements(driver,HomePage.class);
        productosPage = PageFactory.initElements(driver,ProductosPage.class);
        formRegistroProductoPage = PageFactory.initElements(driver,FormRegistroProductoPage.class);

        homePage.cargarPagina("https://publico.transbank.cl/");
        homePage.maximizarBrowser();
    }
    @Given("Presiono el boton Hazte Cliente desde home del sitio")
    public void presiono_el_boton_hazte_cliente_desde_home_del_sitio() {
        homePage.irAHazteCliente();
    }

    @When("Selecciono opcion En redes sociales desde el menu de opciones Donde quieres vender")
    public void selecciono_opcion_en_redes_sociales_desde_el_menu_de_opciones_donde_quieres_vender() {
        productosPage.seleccionarRedesSociales();
    }
    @When("Selecciono el boton Agregar en modal de Link de pago")
    public void selecciono_el_boton_agregar_en_modal_de_link_de_pago() {
        productosPage.agregarLinkPago();
    }
    @When("Presiono el boton Solicitar en modal de seleccion de productos")
    public void presiono_el_boton_solicitar_en_modal_de_seleccion_de_productos() {
        productosPage.solicitaLinkPago();
    }
    @When("Ingreso en el campo Rut el valor {string} en formulario de como quiero vender")
    public void ingreso_en_el_campo_rut_el_valor_en_formulario_de_como_quiero_vender(String rut) {
        formRegistroProductoPage.agregarRut(rut);
    }
    @When("Ingreso en el campo Correo el valor {string} en formulario de como quiero vender")
    public void ingreso_en_el_campo_correo_el_valor_en_formulario_de_como_quiero_vender(String correo) {
        formRegistroProductoPage.agregarCorreo(correo);
    }
    @When("Ingreso en el campo Telefono el valor {string} en formulario de como quiero vender")
    public void ingreso_en_el_campo_telefono_el_valor_en_formulario_de_como_quiero_vender(String telefono) {
        formRegistroProductoPage.agregarTelefono(telefono);
    }

    @When("Presiono el boton Solicitar en modal de seleccion en formulario de como quiero vender")
    public void presiono_el_boton_solicitar_en_modal_de_seleccion_en_formulario_de_como_quiero_vender() {
        formRegistroProductoPage.continuarSolicitud();
    }
    @When("Ingreso en el campo Nro de Serie el valor {string} en formulario de datos personales")
    public void ingreso_en_el_campo_nro_de_serie_el_valor_en_formulario_de_datos_personales(String nroSerie) {
        formRegistroProductoPage.agregarNroSerie(nroSerie);
    }
    @When("Selecciono check de autorizacio en formulario de datos personales")
    public void selecciono_check_de_autorizacio_en_formulario_de_datos_personales() {
        formRegistroProductoPage.chekAutorizacion();
    }
    @When("Presiono el boton Continuar en formulario de datos personales")
    public void presiono_el_boton_continuar_en_formulario_de_datos_personales() {
        formRegistroProductoPage.continuarSolicitud();
    }
    @Then("Visualizo ventana con titulo del mensaje en formulario de datos personales")
    public void visualizo_ventana_con_titulo_del_mensaje_en_formulario_de_datos_personales(String resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado,formRegistroProductoPage.obtenerTituloErrorContratacion());
    }
    @Then("Visualizo la descripcion del mensaje en ventana en formulario de datos personales")
    public void visualizo_la_descripcion_del_mensaje_en_ventana_en_formulario_de_datos_personales(String resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado,formRegistroProductoPage.obtenerDescrErrorContratacion());

    }
    @Then("Visualizo el boton Entendido en ventana en formulario de datos personales")
    public void visualizo_el_boton_entendido_en_ventana_en_formulario_de_datos_personales() {
        Assert.assertTrue(formRegistroProductoPage.validarVisualizacionBotonEntendido());
    }

}
