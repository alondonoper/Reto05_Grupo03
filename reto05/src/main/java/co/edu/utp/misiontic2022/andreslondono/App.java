package co.edu.utp.misiontic2022.andreslondono;

import java.sql.SQLException;

import co.edu.utp.misiontic2022.andreslondono.model.vo.TercerInformeVo;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        TercerInformeVo.obtenerValores();
    }
}
