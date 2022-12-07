package com.mycompany.albumdacopa;

import com.github.javafaker.Faker;
import java.util.Locale;

/**
 *
 * @author Matheus Nascimento
 */
public class Figurinha {

    private String nomeJogador;
    private TipoRaridadeEnum tipoRaridade;

    public Figurinha() {
        this.nomeJogador = Faker.instance(Locale.forLanguageTag("pt-BR")).name().fullName();
        tipoRaridade = TipoRaridadeEnum.sortearRaridade();
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public TipoRaridadeEnum getTipoRaridade() {
        return tipoRaridade;
    }

    public void setTipoRaridade(TipoRaridadeEnum tipoRaridade) {
        this.tipoRaridade = tipoRaridade;
    }
}
