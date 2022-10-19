
package com.mycompany.lista05;

/**
 *
 * @author Matheus Nascimento
 */
public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon01 = new Pokemon();
        Pokemon pokemon02 = new Pokemon();
        //Pokemon pokemon02 = new Pokemon();
        TreinadorPokemon treinador01 = new TreinadorPokemon();
        TreinadorPokemon treinador02 = new TreinadorPokemon();

        pokemon01.setNome("Lotad");
        pokemon01.setTipo("Grass/Water");
        pokemon01.setForca(153.0);
        pokemon01.setDoces(8);
        treinador01.setNivel(23);
        
        pokemon02.setNome("Charmander");
        pokemon02.setTipo("Fire");
        pokemon02.setForca(733.0);
        pokemon02.setDoces(39);
        
        //Upgrade Treinador
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);

        System.out.println("NIVEL TREINADOR");
        System.out.println(treinador01.getNivel());
        System.out.println("UPGRADE POKEMON");
        System.out.println(pokemon01.getForca());
        System.out.println("\n");
        
        System.out.println("POKEMON 1");
        System.out.println("Nome: " + pokemon01.getNome());
        System.out.println("Tipo: " + pokemon01.getTipo());
        System.out.println("Forca: " + pokemon01.getForca());
        System.out.println("Doces:" + pokemon01.getDoces());
        System.out.println("Nível Treinador: " + treinador01.getNivel());
        
        System.out.println("EVOLUINDO POKEMON");
        treinador01.evoluirPokemon(pokemon01, "Lodicolo", treinador01);
        System.out.println("\n");
        
        System.out.println("Nome: " + pokemon01.getNome());
        System.out.println("Tipo: " + pokemon01.getTipo());
        System.out.println("Forca: " + pokemon01.getForca());
        System.out.println("Doces:" + pokemon01.getDoces());
        System.out.println("Nível Treinador: " + treinador01.getNivel());
        
    }
}
