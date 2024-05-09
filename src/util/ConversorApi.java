package util;

import com.google.gson.Gson;
import enums.Moneda;
import model.ApiResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static enums.Moneda.USD;

public class ConversorApi {


    String clave = "INGESAR_KEY";

    private ApiResponse consultarApi(String moneda){
        String direccion = "https://v6.exchangerate-api.com/v6/"+clave+"/latest/"+moneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response;


        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson= new Gson();
        return gson.fromJson(response.body(),ApiResponse.class);

    }

    public void convertirCantidad(Moneda moneda,Moneda monedaConvertir, double cantidad){
        ApiResponse responseApi= consultarApi(USD.name());
        var cantidadConvertida=obtenerConversionRate(responseApi,monedaConvertir)*cantidad;
        System.out.println("La cantidad "+cantidad+" ["+moneda+"] corresponde a la cantidad de "+cantidadConvertida+" ["+monedaConvertir.name()+"]");
    }

    public void convertirCantidad(Moneda moneda, double cantidad){
        ApiResponse responseApi= consultarApi(moneda.name());
        var cantidadConvertida=responseApi.getConversionRates().getUsd()*cantidad;
        System.out.println("La cantidad "+cantidad+" ["+moneda+"] corresponde a la cantidad de "+cantidadConvertida+" ["+USD.name()+"]");
    }

    private Double obtenerConversionRate(ApiResponse api,Moneda moneda){
        switch (moneda){
            case ARS:
                return api.getConversionRates().getArs();
            case USD:
                return api.getConversionRates().getUsd();
            case BRL:
                return api.getConversionRates().getBrl();
            case COP:
                return api.getConversionRates().getCop();
            case MXN:
                return api.getConversionRates().getMxn();
        }
        return api.getConversionRates().getUsd();


    }
}
