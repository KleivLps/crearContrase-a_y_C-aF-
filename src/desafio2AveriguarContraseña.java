import java.util.Scanner;


public class desafio2AveriguarContraseña {
    public static void main(String[] args) {
        try (Scanner averiguarContraseña = new Scanner(System.in)) {
            System.out.println("Ingrese su contraseña: ");
            String contraseña = averiguarContraseña.nextLine();

            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;
            boolean caracterEspecial = false;

            for (char palabra : contraseña.toCharArray()) {
                if (Character.isUpperCase(palabra)) {
                    mayuscula = true;
                } else if (Character.isLowerCase(palabra)) {
                    minuscula = true;
                } else if (Character.isDigit(palabra)) {
                    numero = true;
                } else if (!Character.isLetterOrDigit(palabra)) {
                    caracterEspecial = true;
                }
            }
            if (contraseña.length() < 8) {
                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres.");
            } else if (!mayuscula || !minuscula) {
                System.out.println("Contraseña no segura. Debe contener al menos una letra mayuscula y una minuscula.");
            } else if (!numero) {
                System.out.println("Contraseña no segura. Debe contener al menos un número.");
            } else if (!caracterEspecial) {
                System.out.println("Contraseña no segura. Debe contener al menos un carácter especial.");
            } else {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios. ");
            }

        }
    }
}
