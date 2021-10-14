package edu.escuelaing.arep.calculator.service;

import edu.escuelaing.arep.calculator.model.AppResponse;

/**
 * Interface with the Calculator Methods for the App.
 */
public interface Services {

    /**
     * Interfaz con los métodos de calculadora para la aplicación.
     *
     * @param number El número a calcular.
     * @return El objeto AppResponse con la raíz cuadrada del número.
     */
    AppResponse getSquareRoot(Double number);

    /**
     * Calcula el coseno a partir de un número.
     *
     * @param number El número a calcular.
     * @return El objeto AppResponse con el coseno del número.
     */
    AppResponse getCosine(Double number);
}