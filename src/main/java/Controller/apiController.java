package Controller;

import Dao.EntidadDao;
import Model.Carrera;
import Model.CarreraEntity;
import service.apiService;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.List;

@ApplicationPath("/api")
@Path("/hola")
public class apiController extends Application {

    private apiService apiService = new apiService();
    private EntidadDao dao = new EntidadDao();

    @GET
    @Path("/mundo2")
    @Produces("application/json")
    public JsonArray getCarrera() {

        JsonArrayBuilder builder = Json.createArrayBuilder();

        List<CarreraEntity> lista = apiService.listaCarreras();
        for (CarreraEntity obj : lista) {
            builder.add(Json.createObjectBuilder()
                    .add("codCar", obj.getCodCar())
                    .add("nameCar", obj.getNameCar())
                    .add("abrCar", obj.getAbrcar())
            );
        }
        return builder.build();
    }

    @GET
    @Path("/mundo")
    @Produces("application/json")
    public JsonArray getCarreraDao() throws Exception {
        JsonArrayBuilder builder = Json.createArrayBuilder();

        List<Carrera> lista = dao.listarCarrera();
        for (Carrera obj : lista) {
            builder.add(Json.createObjectBuilder()
                    .add("codCar", obj.getCodigo())
                    .add("nameCar", obj.getNombre())
                    .add("abrCar", obj.getAbrebiacion())
            );
        }
        return builder.build();
    }

}
