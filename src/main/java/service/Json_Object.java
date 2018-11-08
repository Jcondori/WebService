package service;

import Model.Modelo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Json_Object {

    public static void main(String[] args) {

        Modelo model = new Modelo();

        JsonObject modelJ = new JsonParser().parse(new Gson().toJson(model)).getAsJsonObject();

        System.out.println("Json -> " + modelJ);

        modelJ.addProperty("codigo", 20);

        model = new Gson().fromJson(modelJ, Modelo.class);

        System.out.println("Modelo -> " + model);

    }
}
