package co.edu.utp.misiontic2022.andreslondono.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import co.edu.utp.misiontic2022.andreslondono.util.JDBCUtilities;

public class SegundoInformeDao {
    public static ResultSet realizarConsulta() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtilities.getConnection();
            String sql = " SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones, p.Ciudad " 
                        +" FROM Proyecto p " 
                        +" WHERE p.Clasificacion = 'Casa Campestre' AND p.Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla'); ";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}
