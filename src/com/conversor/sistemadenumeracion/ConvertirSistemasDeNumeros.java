package com.conversor.sistemadenumeracion;

import javax.swing.JOptionPane;

import com.conversor.validacion.ValidacionDeValoresNumericos;

public class ConvertirSistemasDeNumeros extends ValidacionDeValoresNumericos {

    private String opcion;

    public ConvertirSistemasDeNumeros() {
        final String MENSAJE = "Elije un sistema de numeracion a la que desees convertir";
        final String MENU = "Numeros";
        final Object[] OPCIONES = {
                "Decimal a Binario",
                "Decimal a Octal",
                "Decimal a Hexadecimal"
        };
        final String BOTON = "Seleccion";

        opcion = JOptionPane
                .showInputDialog(null, MENSAJE, MENU, JOptionPane.PLAIN_MESSAGE, null, OPCIONES, BOTON).toString();
    }

    public boolean iniciar() {
        String input = JOptionPane.showInputDialog("Ingresa un numero decimal que desees convertir: ");
        try {
            try {
                setNumeros(Integer.parseInt(input));
                convertir(getNumeros());
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

    void convertir(int valor) {
        switch (opcion) {
            case "Decimal a Binario":
                decimalABinario(valor);
                break;
            case "Decimal a Octal":
                decimalAOctal(valor);
                break;
            case "Decimal a Hexadecimal":
                decimalAHexadecimal(valor);
                break;
        }
    }

    void decimalABinario(int valor) {
        String binario = "";
        while (valor > 0) {
            int resto = valor % 2;
            binario = resto + binario;
            valor /= 2;
        }
        JOptionPane.showMessageDialog(null, "En numero binario sería: " + binario);
    }

    void decimalAOctal(int valor) {
        String octal = "";
        while (valor > 0) {
            int resto = valor % 8;
            octal = resto + octal;
            valor /= 8;
        }
        JOptionPane.showMessageDialog(null, "En numero octal sería:  " + octal);
    }

    void decimalAHexadecimal(int valor) {
        String hexadecimal = "";
        while (valor > 0) {
            int resto = valor % 16;
            if (resto < 10) {
                hexadecimal = resto + hexadecimal;
            } else {
                hexadecimal = (char) (resto + 55) + hexadecimal;
            }
            valor /= 16;
        }
        JOptionPane.showMessageDialog(null, "En numero hexadecimal sería:  " + hexadecimal);
    }

}
