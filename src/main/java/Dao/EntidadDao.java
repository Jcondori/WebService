package Dao;

import Model.Carrera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EntidadDao extends Dao {

    public List<Carrera> listarCarrera() throws Exception {
        this.Conectar();
        ResultSet rs;
        List<Carrera> lista;
        try {
            String sql = "select * from Carrera";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                lista.add(new Carrera(
                        rs.getString("COD_CAR"),
                        rs.getString("NAME_CAR"),
                        rs.getString("ABRCAR")
                ));
            }
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
}
