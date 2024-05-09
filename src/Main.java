import util.ConversorApi;

import java.util.Scanner;

import static enums.Moneda.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("Bienvenido/a al Conversor de Moneda");
        int opcionSeleccionada=0;
        double cantidadAConvertir=0.0;
        Scanner teclado = new Scanner(System.in);
        ConversorApi conversorApi=new ConversorApi();
        String menu = """
                    Selecciona una opcion:\n
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real Brasileño
                    4) Real Brasileño =>> Dólar
                    5) Dólar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dólar
                    7) Dólar =>> Peso Mexicano
                    8) Peso Mexicano =>> Dólar
                    9) Salir
                    """;

        while (true) {
            System.out.println(menu);
            opcionSeleccionada= teclado.nextInt();

            if (opcionSeleccionada==9){
                break;
            }

            System.out.println("Ingrese la cantidad a convertir:");
            cantidadAConvertir= teclado.nextDouble();
            switch (opcionSeleccionada){
                case 1:
                    conversorApi.convertirCantidad(USD,ARS,cantidadAConvertir);
                    break;
                case 2:
                    conversorApi.convertirCantidad(ARS,cantidadAConvertir);
                    break;
                case 3:
                    conversorApi.convertirCantidad(USD,BRL,cantidadAConvertir);
                    break;
                case 4:
                    conversorApi.convertirCantidad(BRL,cantidadAConvertir);
                    break;
                case 5:
                    conversorApi.convertirCantidad(USD,COP,cantidadAConvertir);
                    break;
                case 6:
                    conversorApi.convertirCantidad(COP,cantidadAConvertir);
                    break;
                case 7:
                    conversorApi.convertirCantidad(USD,MXN,cantidadAConvertir);
                    break;
                case 8:
                    conversorApi.convertirCantidad(MXN,cantidadAConvertir);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }


        }

        System.out.println("Gracias por usar el Conversor de Moneda!");
    }
}