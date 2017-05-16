package by.it.radivonik.project.java.dao;

import by.it.radivonik.project.java.beans.Avto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Radivonik on 04.05.2017.
 */
public class AvtoDAO extends AbstractDAO<Avto> {
    @Override
    protected String sqlSelect() {
        return "SELECT * FROM avto";
    }

    @Override
    protected String sqlInsert(Avto avto) {
        String sql = "INSERT INTO avto (numgos, voditel) VALUES (%s, %s)";
        return String.format(sql, dbVal(avto.getNumgos()), dbVal(avto.getVoditel()));
    }

    @Override
    protected String sqlUpdate(Avto avto) {
        String sql = "UPDATE avto SET numgos = %s, voditel = %s WHERE id = %d";
        return String.format(sql, dbVal(avto.getNumgos()), dbVal(avto.getVoditel()), avto.getId());
    }

    @Override
    protected String sqlDelete(Avto avto) {
        String sql = "DELETE FROM avto WHERE id = %d";
        return String.format(sql, avto.getId());
    }


    @Override
    protected void setId(Avto avto, int id) {
        avto.setId(id);
    }

    @Override
    protected Avto newBean() {
        return new Avto();
    }

    @Override
    protected Avto newBean(ResultSet resultSet) throws SQLException {
        Avto avto = new Avto(
                resultSet.getInt("id"),
                resultSet.getString("numgos"),
                resultSet.getString("voditel"));
        return avto;
    }
}
