
public class OperacionesMatInteger implements Operable<Integer> {
    
    @Override
    public Integer suma(Integer operando1, Integer operando2) {
        return operando1 + operando2;
    }

    @Override
    public Integer resta(Integer operando1, Integer operando2) {
        return operando1 - operando2;
    }

    @Override
    public Integer producto(Integer operando1, Integer operando2) {
        return operando1 * operando2;
    }

    @Override
    public Integer division(Integer operando1, Integer operando2) {
        return operando1 / operando2;
    }
    
    public Integer potencia(Integer base, Integer exponente) {
        return (int) Math.pow(base, exponente);
    }
    
    public Integer raizCuadrada(Integer numero) {
        return (int) Math.sqrt(numero);
    }
    
    public Integer raizCubica(Integer numero) {
        return (int) Math.cbrt(numero);
    }
}