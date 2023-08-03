package crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;

/**
 *
 * @author allengix
 */
public class CRUDMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Producto mod = new Producto();//objeto producto
        ConsultasProducto modC = new ConsultasProducto();//objeto consultas SQL
        frmProducto frm = new frmProducto();//objeto del frm producto

        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);// obj del controlador
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
