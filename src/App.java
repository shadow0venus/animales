import main.model.Aguila;
import main.model.Gato;
import main.model.Oso;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un animal (aguila, gato, oso):");
        String animal = scanner.nextLine().toLowerCase(); // Convierte a minúsculas para evitar problemas de mayúsculas

        switch (animal) {
            case "aguila":
                Aguila aguila = new Aguila();
                aguila.volar();
                aguila.respirar();
                break;

            case "gato":
                Gato gato = new Gato();
                gato.respirar();
                gato.terrestre();
                break;

            case "oso":
                Oso oso = new Oso();
                oso.respirar();
                oso.terrestre();
                oso.nadar();
                break;

            default:
                System.out.println("Animal no reconocido");
        }

        scanner.close();
    }
}