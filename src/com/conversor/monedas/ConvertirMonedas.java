package com.conversor.monedas;

import javax.swing.JOptionPane;

import com.conversor.validacion.ValidacionDeValoresNumericos;

public class ConvertirMonedas extends ValidacionDeValoresNumericos {

    private String opcion;

    public ConvertirMonedas() {
        final String MENSAJE = "Elije la moneda a la que deseas convertir tu dinero";
        final String MENU = "Monedas";
        final Object[] OPCIONES = {
                "Pesos a Dolares",
                "Pesos a Euros",
                "Pesos a Libras",
                "Pesos a Yen",
                "Pesos a Won",
                "Dolares a Pesos",
                "Euros a Pesos",
                "Libras a Pesos",
                "Yen a Pesos",
                "Won a Pesos"
        };
        final String BOTON = "Seleccion";

        opcion = JOptionPane
                .showInputDialog(null, MENSAJE, MENU, JOptionPane.PLAIN_MESSAGE, null, OPCIONES, BOTON).toString();
    }

    public boolean iniciar() {
        String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
        try {
            try {
                setMoneda(Double.parseDouble(input));
                convertir(getMoneda());
                return true;
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Formato Invalido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    void convertir(double valor) {
        switch (opcion) {
            case "Pesos a Dolares":
                pesosADolares(valor);
                break;
            case "Pesos a Euros":
                pesosAEuros(valor);
                break;
            case "Pesos a Libras":
                pesosALibras(valor);
                break;
            case "Pesos a Yen":
                pesosAYen(valor);
                break;
            case "Pesos a Won":
                pesosAWon(valor);
                break;
            case "Dolares a Pesos":
                dolaresAPesos(valor);
                break;
            case "Euros a Pesos":
                eurosAPesos(valor);
                break;
            case "Libras a Pesos":
                librasAPesos(valor);
                break;
            case "Yen a Pesos":
                yenAPesos(valor);
                break;
            case "Won a Pesos":
                wonAPesos(valor);
                break;
        }
    }

    void pesosADolares(double valor) {
        double monedaDolar = valor / 3739.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + (monedaDolar) + " Dolares");
    }

    void pesosAEuros(double valor) {
        double monedaEuro = valor / 4050.48;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }

    void pesosALibras(double valor) {
        double monedaLibra = valor / 4890.52;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
    }

    void pesosAYen(double valor) {
        double monedaYen = valor / 29.68;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yuanes");
    }

    void pesosAWon(double valor) {
        double monedaWon = valor / 3.04;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wons");
    }

    void dolaresAPesos(double valor) {
        double monedaDolar = valor * 3739.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Colombianos");
    }

    void eurosAPesos(double valor) {
        double monedaEuro = valor * 4050.48;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Colombianos");
    }

    void librasAPesos(double valor) {
        double monedaLibra = valor * 4890.52;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Colombianos");
    }

    void yenAPesos(double valor) {
        double monedaYen = valor * 29.68;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Colombianos");
    }

    void wonAPesos(double valor) {
        double monedaWon = valor * 3.04;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Colombianos");
    }

}