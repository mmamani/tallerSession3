package runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    @Given("^yo tengo acceso a la aplicacion (.*)$")
    public void yoTengoAccesoALaAplicacion(String nombreApp) {
        System.out.println("Accediendo a la aplicacion "+nombreApp );
    }

    @When("^yo lleno el textbox (user|password) con : (.*)$")
    public void yoLlenoElTextboxUserConEynar(String typeTextbox, String value) {
        System.out.println("Llenando el textbox "+typeTextbox+" con el  valor"+value );

    }

    @And("^yo realizo click en el boton login$")
    public void yoRealizoClickEnElBotonLogin() {
        System.out.println(" realizando click en el boton login");
    }

    @Then("^yo espero que la pagina principal sea mostrada$")
    public void yoEsperoQueLaPaginaPrincipalSeaMostrada() {
        System.out.println("verirficando la pagina principal");
        // Asserts
    }
}
