package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Remessa {

    public static String gerarRemessa(List<Double> valores) {
        StringBuilder resultado = new StringBuilder("Remessa gerada: ");
        double total = 0.0;
        for (int i = 0; i < valores.size(); i++) {
            double valor = valores.get(i);
            total += valor;
            resultado.append(i + 1).append(" cujo valor é R$ ").append(String.format(Locale.US, "%.2f", valor));
            if (i < valores.size() - 1) {
                resultado.append(", ");
            } else {
                resultado.append(".");
            }
        }
        resultado.append(" Total = R$ ").append(String.format(Locale.US, "%.2f", total)).append(".");
        return resultado.toString();
    }

    public static void main(String[] args) {
        List<Double> valores = Arrays.asList(4444.00, 4.00, 5.90, 2.30, 44.80);
        System.out.println(gerarRemessa(valores));
    }
}
