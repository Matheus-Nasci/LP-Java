package com.mycompany.albumdacopa;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Matheus Nascimento
 */
public enum TipoRaridadeEnum {
    LENDARIA("Lendária", 2000.0), MITICA("Mítica", 1200.0), RARA("Rara", 950.0), COMUM("Comum", 100.0);

    //CONST == FINAL
    private final String nome;
    private final Double precoRevenda;

    private TipoRaridadeEnum(String nome, Double precoRevenda) {
        this.nome = nome;
        this.precoRevenda = precoRevenda;
    }

    public static TipoRaridadeEnum sortearRaridade() {

        Integer i = ThreadLocalRandom.current().nextInt(0, values().length);

        return values()[i];
    }
}
