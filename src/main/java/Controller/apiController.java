package Controller;

import Model.CarreraEntity;
import Model.Modelo;
import com.google.gson.JsonObject;
import service.apiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import java.util.List;

@ApplicationPath("/api")
@Path("/hola")
public class apiController extends Application {

    private apiService apiService = new apiService();

    //Return Json Array
    @GET
    @Path("/lista")
    @Produces("application/json")
    public List<CarreraEntity> getCarrera() {

        return apiService.listaCarreras();
//        return new Gson().toJson(lista);

    }

    //Return Json Object
    @GET
    @Path("/objeto")
    @Produces("application/json")
    public Modelo getCarrera2() {

        return new Modelo();
//        return new Gson().toJson(new Modelo(1,"Hola","como estas"));

    }


    @GET
    @Path("/parametro/{parametro}")
    @Produces("application/json")
    public String getCarrera3(@PathParam("parametro") String parametro) {

        JsonObject json = new JsonObject();
        json.addProperty("pametro", parametro);
        return json.toString();

    }

    @POST
    @Path("objeto2")
    @Produces("application/json")
    public String postMethod() {
        return "Post a tu Servicio";
    }

}
