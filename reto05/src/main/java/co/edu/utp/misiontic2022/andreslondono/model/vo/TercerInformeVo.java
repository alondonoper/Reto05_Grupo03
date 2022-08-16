package co.edu.utp.misiontic2022.andreslondono.model.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.andreslondono.model.dao.TercerInformeDao;

public class TercerInformeVo {
    public static ArrayList<String[]> obtenerValores() throws SQLException {
        ResultSet rs = TercerInformeDao.realizarConsulta();
        Connection conn = null;
        PreparedStatement stmt = null;

        ArrayList<String[]> datosVo = new ArrayList<String[]>();

        try {

            while (rs.next()) {
                Integer id = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
                //System.out.println(String.format("%5d %15s %15s", id, constructora, banco));
                datosVo.add(new String[] { id + "", constructora, banco });
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
