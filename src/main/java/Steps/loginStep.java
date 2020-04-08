package Steps;

import Business.loginController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStep {
    loginController controller = new loginController();

    @Given("Ingreso a la pagina {string}")
    public void ingresoALaPagina(String url) {
        controller.PaginaIngreso(url);
    }

    @And("Digito nombre de usuario {string}")
    public void digitoNombreDeUsuario(String name) throws InterruptedException {
        Thread.sleep(800);
        controller.typeUsername(name);
    }

    @And("Digito contrasena {string}")
    public void digitoContrasena(String pass) {
        controller.typePassword(pass);
    }

    @When("Doy clic sobre en la opcion REGISTRARSE")
    public void doyClicSobreEnLaOpcionREGISTRARSE() throws InterruptedException {
        Thread.sleep(4000);
        controller.clicLogin();
    }

    @Then("Debo de visualizar mi nombre de usuario en la parte derecha {string}")
    public void deboDeVisualizarMiNombreDeUsuarioEnLaParteDerecha(String usernNameTitle) throws InterruptedException {
        Thread.sleep(7000);
        controller.getUserNameTitle(usernNameTitle);
    }

    @And("Doy clic a la opcion de perfil usuario")
    public void doyClicALaOpcionDePerfilUsuario() throws InterruptedException {
        Thread.sleep(1200);
        controller.userButton();
    }

    @And("Seleccio no el item altavoces")
    public void seleccioNoElItemAltavoces() throws InterruptedException {
        Thread.sleep(800);
        controller.clicSpeakersImg();
    }

    @And("Doy clic en COMPRAR AHORA")
    public void doyClicEnCOMPRARAHORA() throws InterruptedException {
        Thread.sleep(12000);
        controller.clicBuy();
    }

    @And("Selecciono el color")
    public void seleccionoElColor() throws InterruptedException {
        Thread.sleep(800);
        controller.clicSelectColor();
    }

    @And("Ingreso la cantidad de altavoces")
    public void ingresoLaCantidadDeAltavoces() throws InterruptedException {
        Thread.sleep(800);
        controller.clicButtonMore();
    }
}
