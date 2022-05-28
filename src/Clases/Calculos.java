package Clases;

import javax.swing.*;

public class Calculos {
    private  Convertidor convertidor= new Convertidor();
    public double monedaLocal(int opcion){
        double moneda;
        moneda = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor a convertir"));
        boolean band = moneda <= 0;

        if (!band){
            switch (opcion){
                case 0: return convertidor.pesosADolares(moneda);
                case 1: return convertidor.pesosAEuros(moneda);
                case 2: return convertidor.pesosALibrasEsterlina(moneda);
                case 3: return convertidor.pesosAYen(moneda);
                case 4: return convertidor.pesosAWon(moneda);
            }
            JOptionPane.showMessageDialog(null,"El valor no es valido","Error",JOptionPane.ERROR_MESSAGE);
            return 0;

        }else {
            JOptionPane.showMessageDialog(null,"El valor a convertir no puede ser menor","Error numerico",JOptionPane.ERROR_MESSAGE);
            return 0;
        }


    }
    public double monedaExtranjera(int opcion) {
        double moneda;
        moneda = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor a convertir"));
        boolean band = moneda <= 0;

        if (!band) {
            switch (opcion) {
                case 0:
                    return convertidor.dolaresAPesos(moneda);
                case 1:
                    return convertidor.eurosAPesos(moneda);
                case 2:
                    return convertidor.librasEsterlinaAPesos(moneda);
                case 3:
                    return convertidor.yenAPesos(moneda);
                case 4:
                    return convertidor.wonAPesos(moneda);
            }
            JOptionPane.showMessageDialog(null, "El valor no es valido", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;

        } else {
            JOptionPane.showMessageDialog(null, "El valor a convertir no puede ser menor", "Error numerico", JOptionPane.ERROR_MESSAGE);
            return 0;

        }

    }

}
