package Clases;

import javax.swing.*;
import java.text.DecimalFormat;

public class Menu {
    private int posicion;
    private Calculos calculos = new Calculos();

    public void inicio() {
        int numero;
        String[] tiposDeConversion = {"Conversor de Pesos a moneda Extranjera", "Conversor de moneda Extranjera a Pesos"};
        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Selecionar la opcion", "Conversion", JOptionPane.QUESTION_MESSAGE, null, tiposDeConversion, tiposDeConversion[0]);
            posicion = obtenerPosicion(tiposDeConversion, opcion);
            switch (posicion) {
                case 0:
                    monedaLocalAMonedaExtranjera();
                    break;
                case 1:
                    monedaExtranjeraALocal();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es correcta", "Erorr", JOptionPane.ERROR_MESSAGE);

            }
            numero = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");

        }
        while (numero == 1);
        JOptionPane.showMessageDialog(null, "salio del programa", "Finalizar", JOptionPane.CLOSED_OPTION);


    }

    private void monedaLocalAMonedaExtranjera() {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        String[] opciones = {"Pesos a dolar", "Pesos a euro", "Pesos a Libra", "Pesos a yen", "Pesos a won"};
        try {
            String opcion = (String) JOptionPane.showInputDialog(null, "Selecionar la opcion", "Conversion", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            posicion = obtenerPosicion(opciones, opcion);
            JOptionPane.showMessageDialog(null, "El valor es: " + decimalFormat.format(calculos.monedaLocal(posicion)) + " " + tipoDeMoneda(opciones, opcion));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void monedaExtranjeraALocal() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String[] opciones = {"Dolar a pesos", "Euro a Pesos", "Libra Esterlina  a pesos", "Yen a pesos", "Won a Pesos"};
        try {
            String opcion = (String) JOptionPane.showInputDialog(null, "Selecionar la opcion", "Conversion", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            posicion = obtenerPosicion(opciones, opcion);
            JOptionPane.showMessageDialog(null, "El valor es: " + decimalFormat.format(calculos.monedaExtranjera(posicion)) + " " + " Pesos Colombianos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    private int obtenerPosicion(String[] array, String opcion) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == opcion) {
                return i;
            }
        }
        return 0;
    }

    private String tipoDeMoneda(String[] arreglo, String posicion) {
        String[] nombre = {"Dolar", "Euro", "Libra", "Yen", "Won"};

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == posicion) {
                return nombre[i];
            }
        }
        return null;
    }


}
