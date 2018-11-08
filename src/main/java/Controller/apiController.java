package Controller;

import Model.CarreraEntity;
import Model.Modelo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import service.apiService;

import javax.json.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.List;

import com.google.gson.JsonObject;

@ApplicationPath("/api")
@Path("/hola")
public class apiController extends Application {

    private apiService apiService = new apiService();

    @GET
    @Path("/mundo")
    @Produces("application/json")
    public String getCarrera() {

//        JsonArrayBuilder builder = Json.createArrayBuilder();
//
        List<CarreraEntity> lista = apiService.listaCarreras();
//        for (CarreraEntity obj : lista) {
//            builder.add(Json.createObjectBuilder()
//                    .add("codCar", obj.getCodCar())
//                    .add("nameCar", obj.getNameCar())
//                    .add("abrCar", obj.getAbrcar())
//            );
//        }
//        return builder.build();
        return new Gson().toJson(lista);
//        return new JsonParser().parse(new Gson().toJson(lista)).getAsJsonArray();
    }

    @GET
    @Path("/mundo2")
    @Produces("application/json")
    public String getCarrera2() {

        return new Gson().toJson(new Modelo(1,"Hola","como estas"));

    }

    @GET
    @Path("/mundo3")
    @Produces("application/json")
    public String getCarrera3() {

        return new Gson().toJson(new Modelo());

    }

}
