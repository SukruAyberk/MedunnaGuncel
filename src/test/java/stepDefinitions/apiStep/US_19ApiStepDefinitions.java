package stepDefinitions.apiStep;

import io.cucumber.java.en.And;

import io.restassured.response.Response;
import org.junit.Assert;
import pages.US_19_20Page;
import utilities.ApiUtils;
import utilities.Authentication;


public class US_19ApiStepDefinitions {
<<<<<<< Updated upstream
  //  @When("ht Kullanıcı https:\\/\\/medunna.com adresine gidilir")
    public void htKullanıcıHttpsMedunnaComAdresineGidilir() {
=======

    Response responseget;
    Response responseDelete;
    int id;


    @And("api ile herhangi bir kişi silinir")
    public void apiIleHerhangiBirKişiSilinir() {
        responseget = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/staff/229119");
        responseget.prettyPrint();
        responseDelete = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/staff/229119");
       responseDelete.prettyPrint();
>>>>>>> Stashed changes
    }

  //  @And("ht Api ile kişinin silindiğini kontrol eder")
    public void htApiIleKişininSilindiğiniKontrolEder() {
        responseget = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/staff/229119");
        responseget.prettyPrint();

    }
}
