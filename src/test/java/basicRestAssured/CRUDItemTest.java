package basicRestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class CRUDItemTest {
    private Response response;

    @Test
    public void verify_crud_item(){

        JSONObject body = new JSONObject();
        body.put("Content","RESTAssured");

        // Creacion

        response =  given().
                auth().
                preemptive().
                basic("upb2021@upb.com","12345").
                contentType(ContentType.JSON).
                body(body.toString()).
                log().
                all().
                when().
                post("http://todo.ly/api/items.json");

        response.then().
                statusCode(200).
                body("Content", equalTo("RESTAssured")).
                body("Deleted", equalTo(false)).
                log().
                all();

        // extraer el valor de una propiedad : Id
        int idIteam=response.then().extract().path("Id");

        // Actualizacion
        body.put("Content","RESTAssured UPDATE");
        response =  given().
                auth().
                preemptive().
                basic("upb2021@upb.com","12345").
                contentType(ContentType.JSON).
                body(body.toString()).
                log().
                all().
                when().
                put("http://todo.ly/api/items/"+idIteam+".json");

        response.then().
                statusCode(200).
                body("Content", equalTo("RESTAssured UPDATE")).
                body("Deleted", equalTo(false)).
                log().
                all();

        // Get
        response =  given().
                auth().
                preemptive().
                basic("upb2021@upb.com","12345").
                contentType(ContentType.JSON).
                log().
                all().
                when().
                get("http://todo.ly/api/items/"+idIteam+".json");

        response.then().
                statusCode(200).
                body("Content", equalTo("RESTAssured UPDATE")).
                body("Deleted", equalTo(false)).
                log().
                all();

        // Borrado
        response =  given().
                auth().
                preemptive().
                basic("upb2021@upb.com","12345").
                contentType(ContentType.JSON).
                log().
                all().
                when().
                delete("http://todo.ly/api/items/"+idIteam+".json");

        response.then().
                statusCode(200).
                body("Content", equalTo("RESTAssured UPDATE")).
                body("Deleted", equalTo(true)).
                log().
                all();
    }
}
