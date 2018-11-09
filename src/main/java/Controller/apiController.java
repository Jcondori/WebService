package Controller;

import Model.CarreraEntity;
import Model.Modelo;
import com.google.gson.Gson;
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

    }

    @GET
    @Path("/lista2")
    @Produces("application/json")
    public String getCarreraGson() {

        return new Gson().toJson(apiService.listaCarreras());

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

    //Motodo que recibe y debuelve un json clase Modelo
    @POST
    @Path("objeto2")
    @Consumes("application/json")
    @Produces("application/json")
    public Modelo postMethod(Modelo modelo) {
        System.out.println(modelo);
        return modelo;
    }

}
