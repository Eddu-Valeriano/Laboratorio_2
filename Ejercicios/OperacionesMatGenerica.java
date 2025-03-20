
public class OperacionesMatGenerica<N extends Number> {
    
    // Este método determina el tipo específico y realiza la operación correspondiente
    private Number operacion(N operando1, N operando2, String tipoOperacion) {
        if (operando1 instanceof Integer && operando2 instanceof Integer) {
            OperacionesMatInteger integerOp = new OperacionesMatInteger();
            Integer op1 = (Integer) operando1;
            Integer op2 = (Integer) operando2;
            
            switch (tipoOperacion) {
                case "suma":
                    return integerOp.suma(op1, op2);
                case "resta":
                    return integerOp.resta(op1, op2);
                case "producto":
                    return integerOp.producto(op1, op2);
                case "division":
                    return integerOp.division(op1, op2);
                case "potencia":
                    return integerOp.potencia(op1, op2);
                default:
                    throw new IllegalArgumentException("Operación no soportada");
            }
        } else {
            // Convertimos a Double para realizar la operación
            OperacionesMatDouble doubleOp = new OperacionesMatDouble();
            Double op1 = operando1.doubleValue();
            Double op2 = operando2.doubleValue();
            
            switch (tipoOperacion) {
                case "suma":
                    return doubleOp.suma(op1, op2);
                case "resta":
                    return doubleOp.resta(op1, op2);
                case "producto":
                    return doubleOp.producto(op1, op2);
                case "division":
                    return doubleOp.division(op1, op2);
                case "potencia":
                    return doubleOp.potencia(op1, op2);
                default:
                    throw new IllegalArgumentException("Operación no soportada");
            }
        }
    }
    
    // Implementación de operaciones a través de métodos públicos
    public Number suma(N operando1, N operando2) {
        return operacion(operando1, operando2, "suma");
    }
    
    public Number resta(N operando1, N operando2) {
        return operacion(operando1, operando2, "resta");
    }
    
    public Number producto(N operando1, N operando2) {
        return operacion(operando1, operando2, "producto");
    }
    
    public Number division(N operando1, N operando2) {
        return operacion(operando1, operando2, "division");
    }
    
    public Number potencia(N base, N exponente) {
        return operacion(base, exponente, "potencia");
    }
    
    public Number raizCuadrada(N numero) {
        if (numero instanceof Integer) {
            return (int) Math.sqrt(numero.doubleValue());
        } else {
            return Math.sqrt(numero.doubleValue());
        }
    }
    
    public Number raizCubica(N numero) {
        if (numero instanceof Integer) {
            return (int) Math.cbrt(numero.doubleValue());
        } else {
            return Math.cbrt(numero.doubleValue());
        }
    }
}