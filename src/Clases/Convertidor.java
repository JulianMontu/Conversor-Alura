package Clases;

import Interfaz.ConvertirMonedaExtranjera;
import Interfaz.ConvertirMonedaLocal;

public class Convertidor implements ConvertirMonedaLocal, ConvertirMonedaExtranjera {
    private double euro = 4212.19;
    private double librasEst = 4956.70;
    private double yen = 30.87;
    private double won = 3.12;
    private double dolar = 3924.83;

    //Moneda Local a Moneda Extranjera

    @Override
    public double pesosAEuros(double moneda) {
        return moneda / this.euro;
    }

    @Override
    public double pesosALibrasEsterlina(double moneda) {
        return moneda / this.librasEst;
    }

    @Override
    public double pesosAWon(double moneda) {
        return moneda / this.won;
    }

    @Override
    public double pesosAYen(double moneda) {
        return moneda / this.yen;
    }

    @Override
    public double pesosADolares(double moneda) {
        return moneda / this.dolar;
    }

    //Moneda Extranjera a Moneda Local

    @Override
    public double dolaresAPesos(double moneda) {
        return moneda * this.dolar;
    }

    @Override
    public double eurosAPesos(double moneda) {
        return moneda * this.euro;
    }

    @Override
    public double librasEsterlinaAPesos(double moneda) {
        return moneda * this.librasEst;
    }

    @Override
    public double yenAPesos(double moneda) {
        return moneda * this.yen;
    }

    @Override
    public double wonAPesos(double moneda) {
        return moneda * this.won;
    }
}
