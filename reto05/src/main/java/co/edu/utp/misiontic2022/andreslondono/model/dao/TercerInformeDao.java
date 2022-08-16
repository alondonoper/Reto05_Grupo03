package co.edu.utp.misiontic2022.andreslondono.model.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import co.edu.utp.misiontic2022.andreslondono.util.JDBCUtilities;

public class TercerInformeDao {
    public static ResultSet realizarConsulta() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtilities.getConnection();
            String sql = " SELECT c.ID_Compra, p.Constructora ,p.Banco_Vinculado " 
                        + " FROM Compra c "
                        + " JOIN Proyecto p USING(ID_Proyecto) "
                        + " WHERE c.Proveedor = 'Homecenter' AND p.Ciudad = 'Salento'; ";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}
