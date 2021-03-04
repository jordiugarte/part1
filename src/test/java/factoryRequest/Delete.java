package factoryRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Delete implements IRequest {
    @Override
    public Response send(RequestInformation request) {
        Response response =  given().
                                    header(request.getAuthType(),request.getAuthValue()).
                                    contentType(ContentType.JSON).
                                    log().
                                    all().
                             when().
                                    delete(request.getUrl());

        response.then().log().all();
        return response;
    }
}
