package co.edu.utp.misiontic2022.andreslondono.controller;

import java.sql.SQLException;

import co.edu.utp.misiontic2022.andreslondono.model.vo.PrimerInformeVo;
import co.edu.utp.misiontic2022.andreslondono.model.vo.SegundoInformeVo;
import co.edu.utp.misiontic2022.andreslondono.model.vo.TercerInformeVo;

public class ReportesController {
    public static void informe1() throws SQLException {
        PrimerInformeVo.obtenerValores();
    }

    public static void informe2() throws SQLException {
        SegundoInformeVo.obtenerValores();
    }

    public static void informe3() throws SQLException {
        TercerInformeVo.obtenerValores();
    }
}
