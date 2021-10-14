package edu.escuelaing.arep.calculator.service;

import edu.escuelaing.arep.calculator.model.AppResponse;
import org.springframework.stereotype.Service;

/**
 * Clase que implementa los métodos de calculadora para la aplicación.
 */
@Service
public class ServicesImpl implements Services {

    /**
     * Calcula la raíz cuadrada a partir de un número.
     *
     * @param number El número a calcular.
     * @return El objeto AppResponse con la raíz cuadrada del número.
     */
    @Override
    public AppResponse getSquareRoot(Double number) {
        Double sqrt = Math.sqrt(number);
        return new AppResponse("sqrt", number, sqrt);
    }

    /**
     * Calcula el coseno a partir de un número.
     *
     * @param number El número a calcular.
     * @return El objeto AppResponse con el coseno del número.
     */
    @Override
    public AppResponse getCosine(Double number) {
        Double cos = Math.cos(number);
        return new AppResponse("cos", number, cos);
    }
}