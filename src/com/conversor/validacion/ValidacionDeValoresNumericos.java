package com.conversor.validacion;

public abstract class ValidacionDeValoresNumericos {

    private double moneda;
    private int numeros;
    private final String MENSAJE = "No se puede hacer una conversion con el valor 0";

    protected double getMoneda() {
        return moneda;
    }

    protected void setMoneda(double valor) throws Exception {
        if (valor <= 0)
            throw new Exception(MENSAJE);
        else
            moneda = valor;
    }

    protected int getNumeros() {
        return numeros;
    }

    protected void setNumeros(int valor) throws Exception {
        if (valor <= 0)
            throw new Exception(MENSAJE);
        else
            numeros = valor;
    }

}
