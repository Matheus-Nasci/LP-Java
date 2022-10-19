package com.mycompany.lp.lista07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Teste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);
        List<Medicamento> listaMedicamentos = new ArrayList();

        Integer id = 1;
        Integer escolha = 0;

        while (escolha != 4) {
            System.out.println("---------------------------------");
            System.out.println("|1 - Cadastrar Medicamento       |");
            System.out.println("|2 - Exibir Medicamentos         |");
            System.out.println("|3 - Buscar medicamento por Nome |");
            System.out.println("|4 - Sair                        |");
            System.out.println("---------------------------------");
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    //adicionar um autoincremento no ID
                    //System.out.println("Qual Id: ");
                    //Integer id = leitor.nextInt();
                    System.out.println("Nome do medicamento: ");
                    String nome = leitorS.nextLine();
                    System.out.println("Quantidade no estoque: ");
                    Integer qtdEstoque = leitor.nextInt();
                    System.out.println("Qual o valor: ");
                    Double valor = leitor.nextDouble();

                    Medicamento novoMedicamento = new Medicamento(id++, nome, qtdEstoque, valor);

                    listaMedicamentos.add(novoMedicamento);

                    break;
                case 2:
                    System.out.println("Medicamentos em estoque: ");
                    for (int i = 0; i < listaMedicamentos.size(); i++) {
                        System.out.println(listaMedicamentos.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("Qual nome do medicamento: ");
                    String nomeMedicamento = leitor.next();

                    Boolean existeMedicamento = false;
                    for (Medicamento medicamento : listaMedicamentos) {
                        if (medicamento.getNomeMedicamento().equalsIgnoreCase(nomeMedicamento)) {
                            existeMedicamento = true;
                        }
                    }

                    if (existeMedicamento) {
                        System.out.println(nomeMedicamento + " existe no estoque");
                    } else {
                        System.out.println(nomeMedicamento + " não existe no estoque");
                    }

                    break;
                default:
                    System.out.println("Digite um valor válido");
            }

        }

    }
}
