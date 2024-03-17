package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestePessoa {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner resp = new Scanner(System.in);

        List <Pessoa> lista = new ArrayList<>();

        System.out.print("Digite a quantidade de contribuintes: ");
        int contador = resp.nextInt();


        for(int k = 1; k <= contador; k++){
            resp.nextLine();

            System.out.print("Pessoa Física ou Jurídica? (F / J): ");
            char opcao = resp.next().charAt(0);
            resp.nextLine();
            if(opcao == 'F'){
                System.out.print("Digite seu nome: ");
                String nome = resp.nextLine();

                System.out.print("Digite sua renda anual: ");
                double rendaAnual = resp.nextDouble();

                System.out.print("Digite seu gasto com saúde: ");
                double gastoSaude = resp.nextDouble();

                Pessoa pessoa = new PessoaFisica(nome, rendaAnual,gastoSaude);
                lista.add(pessoa);
            }else{
                System.out.print("Digite o nome da empresa: ");
                String nome = resp.nextLine();

                System.out.print("Digite a renda anual: ");
                double rendaAnual = resp.nextDouble();

                System.out.print("Digite a quantidade de funcionários contratados na sua empresa: ");
                int quantFuncionarios = resp.nextInt();

                Pessoa pessoa = new PessoaJuridica(nome,rendaAnual,quantFuncionarios);
                lista.add(pessoa);
            }
            System.out.println("Contribuinte cadastrado.\n");
        }
        double somaImpostos = 0.0;
        for (Pessoa p : lista){
            System.out.println(p.toString());
            somaImpostos += p.valorImposto();
        }
        System.out.println();
        System.out.printf("Total de impostos arrecadados: R$ %.2f\n", somaImpostos);
    }
    }

