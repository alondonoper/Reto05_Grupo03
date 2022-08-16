package co.edu.utp.misiontic2022.andreslondono.model.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.andreslondono.model.dao.PrimerInformeDao;

public class PrimerInformeVo {
    //public static void obtenerValores() throws SQLException
    public static ArrayList <String[]> obtenerValores() throws SQLException {
        ResultSet rs = PrimerInformeDao.realizarConsulta();
        Connection conn = null;
        PreparedStatement stmt = null;

        ArrayList <String[]> datosVo = new ArrayList<String[]>(); 

        try {

            while (rs.next()) {
                Integer id = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                //System.out.println(String.format("%5d %15s %15s %15s", id, nombre, apellido, ciudad));
                datosVo.add(new String[]{id + "", nombre, apellido, ciudad});
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
