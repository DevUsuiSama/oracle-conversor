/*
 * Created on Thu Jul 27 2023
 *
 * Copyright (c) 2023 UsuiSama
 */
package com.conversor;

import javax.swing.JOptionPane;

import com.conversor.monedas.ConvertirMonedas;
import com.conversor.sistemadenumeracion.ConvertirSistemasDeNumeros;

public class App {

    static final String MENSAJE = "Seleccione una opci\u00F3n de conversi\u00F3n";
    static final String MENU = "Menu Principal";
    static final Object[] OPCIONES = {
            "Conversor de Moneda",
            "Conversor de Sistema de Numeración"
    };
    static final String BOTON = "Seleccion";
    static boolean continuar = true;

    public static void ultimaPregunta() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Dilema", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
            continuar = !continuar;
        }
    }

    public static void main(String[] args) {
        while (continuar) {
            String opciones = JOptionPane
                    .showInputDialog(null, MENSAJE, MENU, JOptionPane.QUESTION_MESSAGE, null, OPCIONES, BOTON)
                    .toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    ConvertirMonedas convertirMoneda = new ConvertirMonedas();
                    while (true) {
                        if (convertirMoneda.iniciar()) {
                            ultimaPregunta();
                            break;
                        }
                    }
                    break;
                case "Conversor de Sistema de Numeraci\u00F3n":
                    ConvertirSistemasDeNumeros convertirSistemasDeNumeros = new ConvertirSistemasDeNumeros();
                    while (true) {
                        if (convertirSistemasDeNumeros.iniciar()) {
                            ultimaPregunta();
                            break;
                        }
                    }
                    break;
            }
        }
    }

}
