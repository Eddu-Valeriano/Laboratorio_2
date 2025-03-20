
public class OperacionesMatDouble implements Operable<Double> {

    @Override
    public Double suma(Double operando1, Double operando2) {
        return operando1 + operando2;
    }

    @Override
    public Double resta(Double operando1, Double operando2) {
        return operando1 - operando2;
    }

    @Override
    public Double producto(Double operando1, Double operando2) {
        return operando1 * operando2;
    }

    @Override
    public Double division(Double operando1, Double operando2) {
        return operando1 / operando2;
    }
    
    public Double potencia(Double base, Double exponente) {
        return Math.pow(base, exponente);
    }
    
    public Double raizCuadrada(Double numero) {
        return Math.sqrt(numero);
    }
    
    public Double raizCubica(Double numero) {
        return Math.cbrt(numero);
    }
}