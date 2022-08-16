package co.edu.utp.misiontic2022.andreslondono.model.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.andreslondono.model.dao.SegundoInformeDao;

public class SegundoInformeVo {
    public static ArrayList<String[]> obtenerValores() throws SQLException {
        ResultSet rs = SegundoInformeDao.realizarConsulta();
        Connection conn = null;
        PreparedStatement stmt = null;

        ArrayList<String[]> datosVo = new ArrayList<String[]>();

        try {

            while (rs.next()) {
                Integer id = rs.getInt("ID_Proyecto");
                String constructora = rs.getString("Constructora");
                Integer numHabitaciones = rs.getInt("Numero_Habitaciones");
                String ciudad = rs.getString("Ciudad");
                //System.out.println(String.format("%5d %15s %15d %15s", id, constructora, numHabitaciones, ciudad));
                datosVo.add(new String[] { id + "", constructora, numHabitaciones + "", ciudad });
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conn != null) {
                conn.close();
            }
        }

        return datosVo;
    }
}
