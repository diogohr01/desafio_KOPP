package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class RemessaTest {

    /**
     * Teste da função gerarRemessa
     */
    @Test
    public void testGerarRemessa() {
        List<Double> valores = Arrays.asList(4444.00, 4.00, 5.90, 2.30, 44.80);
        String esperado = "Remessa gerada: 1 cujo valor é R$ 4444.00, 2 cujo valor é R$ 4.00, 3 cujo valor é R$ 5.90, 4 cujo valor é R$ 2.30, 5 cujo valor é R$ 44.80. Total = R$ 4501.00.";
        String resultado = Remessa.gerarRemessa(valores);
        assertEquals(esperado, resultado);
    }
}
