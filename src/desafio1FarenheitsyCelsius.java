import java.util.Scanner;


public class desafio1FarenheitsyCelsius {
    public static void main(String[] args) {

        try (Scanner desafio1 = new Scanner(System.in)) {
            try {
                System.out.println("Ingrese la temperatura: ");
                double temperatura = desafio1.nextDouble();

                System.out.println("Ingrese la unidad de medida (C/F): ");
                String temp = desafio1.next().toUpperCase();

                if (temp.equals("C°"))  {
                    if (temperatura < -273.15) {
                        System.out.println("Error: La temperatura no puede ser menor a -273°C. ");
                        return;
                    }
                } else if (temp.equals("F°")) {
                    if (temperatura < -459.67) {
                        System.out.println("Error: La temperatura no puede ser menor a -459°F. ");
                        return;
                    }
                }
                switch (temp) {
                    case "C" -> {
                        double fahrenheit = (temperatura * 9 / 5) +32;
                        System.out.printf("%.2f grados Celsius equivalen a %.2f grados Fahrenheit. \n", temperatura, fahrenheit);
                    }
                    case "F" -> {
                        double celsius = (temperatura -32) * 5/ 9;
                        System.out.printf("%.2f grados Fahrenheit equivale a %.2f grados Celsius.\n",temperatura,celsius);
                    }
                    default -> System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F ara Fahrenheit.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Temperatura no valida. Ingrese ua temperatura numérica.");
            }

        }
    }
}