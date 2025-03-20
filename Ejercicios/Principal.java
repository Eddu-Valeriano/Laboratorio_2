import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String tipoValor;
        Number operando1 = null, operando2 = null;
        OperacionesMatGenerica<Number> operaciones = new OperacionesMatGenerica<>();

        System.out.println("¿Qué tipo de datos desea utilizar? (integer/double): ");
        while (true) {
            tipoValor = scanner.nextLine().toLowerCase();
            if (tipoValor.equals("integer") || tipoValor.equals("double")) {
                break; // Si el valor es correcto, salir del bucle
            }
            System.out.println("Error: Debe ingresar 'integer' o 'double'. Intente nuevamente:");
        }

        do {
            // Mostrar el menú
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                // Procesamiento según la opción seleccionada
                Number resultado = null;

                switch (opcion) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        // Operaciones binarias (dos operandos)
                        System.out.print("Ingrese el primer valor: ");
                        if (tipoValor.equals("integer")) {
                            operando1 = Integer.parseInt(scanner.nextLine());
                        } else {
                            operando1 = Double.parseDouble(scanner.nextLine());
                        }

                        System.out.print("Ingrese el segundo valor: ");
                        if (tipoValor.equals("integer")) {
                            operando2 = Integer.parseInt(scanner.nextLine());
                        } else {
                            operando2 = Double.parseDouble(scanner.nextLine());
                        }

                        try {
                            switch (opcion) {
                                case 1:
                                    resultado = operaciones.suma(operando1, operando2);
                                    System.out.println("Resultado de la suma: " + resultado);
                                    break;
                                case 2:
                                    resultado = operaciones.resta(operando1, operando2);
                                    System.out.println("Resultado de la resta: " + resultado);
                                    break;
                                case 3:
                                    resultado = operaciones.producto(operando1, operando2);
                                    System.out.println("Resultado del producto: " + resultado);
                                    break;
                                case 4:
                                    resultado = operaciones.division(operando1, operando2);
                                    System.out.println("Resultado de la división: " + resultado);
                                    break;
                                case 5:
                                    resultado = operaciones.potencia(operando1, operando2);
                                    System.out.println("Resultado de la potencia: " + resultado);
                                    break;
                            }
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 6:
                    case 7:
                        // Operaciones unarias (un solo operando)
                        System.out.print("Ingrese el valor: ");
                        if (tipoValor.equals("integer")) {
                            operando1 = Integer.parseInt(scanner.nextLine());
                        } else {
                            operando1 = Double.parseDouble(scanner.nextLine());
                        }

                        try {
                            if (opcion == 6) {
                                resultado = operaciones.raizCuadrada(operando1);
                                System.out.println("Resultado de la raíz cuadrada: " + resultado);
                            } else {
                                resultado = operaciones.raizCubica(operando1);
                                System.out.println("Resultado de la raíz cúbica: " + resultado);
                            }
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
                opcion = 0; // Reiniciar para que el bucle continúe
            }

        } while (opcion != 8);

        scanner.close();
    }
}