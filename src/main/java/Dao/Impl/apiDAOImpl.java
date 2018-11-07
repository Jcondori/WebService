package Dao.Impl;

import Dao.Interface.apiDAO;
import Model.CarreraEntity;
import util.Conexion;

import javax.persistence.Query;
import java.util.List;

public class apiDAOImpl implements apiDAO {

    Conexion  context = new Conexion();

    public List<CarreraEntity> listaCarreras() {
        List<CarreraEntity> lista = null;
        try {
            context.abrir();
            Query query = context.em.createQuery("Select a from CarreraEntity a");
            lista = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            context.cerrar();
        }
        return lista;
    }
}
