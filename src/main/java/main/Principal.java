package main;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Principal {

    public static void main(String[] args) {

        Connection con = ConnectionFactory.getConnection();
        String jasperFile = "report1.jasper";
        JasperPrint jprint = null;
        try {
            jprint = JasperFillManager.fillReport(jasperFile, null, con);
            
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer view = new JasperViewer(jprint, false);
        view.setVisible(true);
    }
}
