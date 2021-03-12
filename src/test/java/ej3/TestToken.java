package ej3;

import configuration.Config;
import factoryRequest.FactoryRequest;
import factoryRequest.RequestInformation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import utilsJson.JsonHelper;

import java.util.HashMap;
import java.util.Map;

public class TestToken {
    Response response;
    RequestInformation request = new RequestInformation();
    Map<String, String> data = new HashMap<>();

    @Given("I got access to todoly")
    public void iGotAccessToTodoly() {
    }

    @When("I send the GET request to url {}")
    public void iSendTheGETRequestToUrlHttpTodoLyApiAuthenticationTokenJson(String url) {
        request.setAuthType(Config.AUTH_BASIC);
        request.setAuthValue(Config.AUTH_BASIC_VALUE);
        request.setUrl(replaceAllData(url));
        response = FactoryRequest.make("GET").send(request);
    }

    @When("I send the DELETE request to url {}")
    public void iSendTheDELETERequestToUrlHttpTodoLyApiAuthenticationTokenJson(String url) {
        request.setAuthType(Config.TOKEN);
        request.setAuthValue(replaceAllData("TokenValue"));
        request.setUrl(replaceAllData(url));
        response = FactoryRequest.make("DELETE").send(request);
    }

    @Then("I expect a response body")
    public void iGetAResponseBody(String body){
        Assert.assertTrue("Error", JsonHelper.areEqualJson(replaceAllData(body), response.getBody().asString()));
    }

    @And("I get a property {} and save it in {}")
    public void iGetAPropertyTokenStringAndSaveItInTokenValue(String property, String varName) {
        data.put(varName, response.then().extract().path(property) + "");
    }

    private String replaceAllData(String value) {
        for (String key : data.keySet()) {
            value = value.replace(key, data.get(key));
        }
        return value;
    }
}