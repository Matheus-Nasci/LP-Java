
package com.mycompany.lista05;

/**
 *
 * @author Matheus Nascimento
 */
public class TreinadorPokemon {
    private String nomeEvolucao;
    private Integer nivel;
    
    public void treinarPokemon(Pokemon pokemon, TreinadorPokemon treinador){
       pokemon.setForca(pokemon.getForca() + (pokemon.getForca() * 0.10));
       pokemon.setDoces(pokemon.getDoces() + 10);
       treinador.setNivel(nivel + 2);
    }
    
    public void evoluirPokemon(Pokemon pokemon, String novoNome, TreinadorPokemon treinador){
        if(pokemon.getDoces() >= 50){
            pokemon.setNome(novoNome);
            pokemon.setDoces(pokemon.getDoces() - 50);
            treinador.setNivel(treinador.getNivel() + 10);
        } else {
            System.out.println("Não foi possível realizar evolução");
        }
    }

    public String getNomeEvolucao() {
        return nomeEvolucao;
    }

    public void setNomeEvolucao(String nome) {
        this.nomeEvolucao = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" + "Pokemon evoluido=" + nomeEvolucao + ", Nivel=" + nivel + '}';
    }
}
