package Steps;

import Business.newAccountBusiness;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class newAccountStep {

    newAccountBusiness controller = new newAccountBusiness();

    @Given("Que estoy en la pagina {string}")
    public void queEstoyEnLaPagina(String url) {
        controller.PaginaIngreso(url);
    }

    @And("Doy clic a la opcion de usuario")
    public void doyClicALaOpcionDeUsuario() throws InterruptedException {
        Thread.sleep(1500);
        controller.userButton();
    }

    @And("Doy clic en la opcion crear cuenta")
    public void doyClicEnLaOpcionCrearCuenta() throws InterruptedException {
        Thread.sleep(3000);
        controller.buttonCreateAccount();
    }

    @And("Ingreso nombre de usuario {string}")
    public void ingresoNombreDeUsuario(String username) throws InterruptedException {
        Thread.sleep(500);
        controller.typeUserName(username);
    }

    @And("Ingreso email {string}")
    public void ingresoEmail(String email) {
        controller.typeEmail(email);
    }

    @And("Ingreso contrasena {string}")
    public void ingresoContrasena(String pass) throws InterruptedException {
        Thread.sleep(1000);
        controller.typePassword(pass);
    }

    @And("Confirmo contrasena {string}")
    public void confirmoContrasena(String confirmPass) {
        controller.typeConfirmPassword(confirmPass);
    }

    @And("Ingreso nombre {string}")
    public void ingresoNombre(String firstName) {
        controller.typeFirstName(firstName);
    }

    @And("Ingreso apellido {string}")
    public void ingresoApellido(String lastName) {
        controller.typeLastName(lastName);
    }

    @And("Ingreso numero telefono {string}")
    public void ingresoNumeroTelefono(String phone) throws InterruptedException {
        controller.typePhoneNumber(phone);
    }

    @And("Ingreso pais {string}")
    public void ingresoPais(String country) throws InterruptedException {
        Thread.sleep(1000);
        controller.selectCountry(country);
    }

    @And("Ingreso ciudad {string}")
    public void ingresoCiudad(String city) {
        controller.typeCity(city);
    }

    @And("Ingreso direccion {string}")
    public void ingresoDireccion(String address) {
        controller.typeAddress(address);
    }

    @And("Ingreso departamento {string}")
    public void ingresoDepartamento(String province) {
        controller.typeProvince(province);
    }

    @And("Ingreso codigo postal {string}")
    public void ingresoCodigoPostal(String code) {
        controller.typeCodePostal(code);
    }

    @And("Deschequeo la opcion de ofertas y promociones")
    public void chequeoLaOpcionDeOfertasYPromociones() {
        controller.uncheckPromotion();
    }

    @And("Chequeo la opcion de acepto las condiciones de uso y el aviso de privacidad")
    public void chequeoLaOpcionDeAceptoLasCondicionesDeUsoYElAvisoDePrivacidad() {
        controller.checkLegalWarning();
    }

    @When("Doy clic sobre la opcion REGISTRARSE")
    public void doyClicSobreLaOpcionREGISTRARSE() {
        controller.clicButtonRegister();
    }

    @Then("Se debe de visualizar el nombre del usuario logueado {string}")
    public void seDebeDeVisualizarElNombreDelUsuarioLogueado(String username) throws InterruptedException {
        Thread.sleep(1000);
        controller.getLoginUserName(username);
    }

    @Then("El sistema debe de mostrar un mensaje indicando que el {string}")
    public void debeDeMostrarUnMensajeIndicandoQueEl(String msg) {
        controller.getAlertMessage(msg);
    }
}
