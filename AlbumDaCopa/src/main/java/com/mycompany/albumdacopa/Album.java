package com.mycompany.albumdacopa;

import java.util.List;

/**
 *
 * @author Matheus Nascimento
 */
public class Album {

    public static final Integer MAXIMO_FIGURINHAS = 2;
    public List<Figurinha> figurinhas;

    public void adicionarFigurinha(Figurinha novaFigurinha) {
        if (figurinhas.size() < Album.MAXIMO_FIGURINHAS) {
            figurinhas.add(novaFigurinha);
        }
    }

    public void adicionarFigurinha(List<Figurinha> figurinhasNovas) {
        if (figurinhas.size() < Album.MAXIMO_FIGURINHAS) {
            for (Figurinha f : figurinhasNovas) {
                if (figurinhas.size() + figurinhasNovas.size() < Album.MAXIMO_FIGURINHAS) {
                    System.out.println("Mais Figurinhas, do que espaço no Álbum");
                } else {
                    figurinhas.add(f);
                }
            }
        }
    }

    public Integer contagemDeFigurinhasPorTipo(TipoRaridadeEnum tipo) {
        Integer totalTipo = 0;
        for (Figurinha f : figurinhas) {
            if (f.getTipoRaridade().equals(tipo)) {
                totalTipo++;
            }
        }
        return totalTipo;
    }

    public Double valorTotalFigurinhas() {
        Double totalFigurinhas = 0.0;
        for (int i = 0; i < figurinhas.size(); i++) {
            totalFigurinhas++;
        }
        return totalFigurinhas;
    }

    public Double valorTotalFigurinhas(TipoRaridadeEnum tipo) {
        Double totalTipo = 0.0;
        for (Figurinha f : figurinhas) {
            if (f.getTipoRaridade().equals(tipo)) {
                totalTipo++;
            }
        }
        return totalTipo;
    }

    public Boolean albumCompleto() {
        if (figurinhas.size() == Album.MAXIMO_FIGURINHAS) {
            return true;
        }

        return false;
    }
}
