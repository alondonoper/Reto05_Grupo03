package co.edu.utp.misiontic2022.andreslondono.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import co.edu.utp.misiontic2022.andreslondono.util.JDBCUtilities;

public class PrimerInformeDao {
    public static ResultSet realizarConsulta() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtilities.getConnection();
            String sql = " SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido, l.Ciudad_Residencia" 
            + " FROM Lider l " 
            + " ORDER BY l.Ciudad_Residencia ASC; ";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}
