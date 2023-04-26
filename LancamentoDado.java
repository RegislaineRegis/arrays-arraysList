/*
EXERCÍCIO 2. Um dado é lançado 10 vezes e o valor correspondente é 
anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente 
 também quantas foram as ocorrências da maior pontuação.
*/

import java.util.Random;

public class LancamentoDado {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		int numDado = 0, soma = 0, qtdOcorrencia = 0, auxiliar = 0, auxiliarOcorrencia = 0, lancamento = 10;;
		double media = 0.0;
		int [] pontuacaoLancamento = new int [lancamento];
		int [] ocorrencias = { 1, 2, 3, 4, 5, 6 };
		int [] ocorrenciasAuxiliar = new int[ocorrencias.length];
		
		for(int i = 0; i < pontuacaoLancamento.length; i +=1 ) {
			numDado = gerador.nextInt(6) + 1; 
			pontuacaoLancamento[i] = numDado;
			soma += pontuacaoLancamento[i];
		}

    for(int i = 0; i < pontuacaoLancamento.length; i +=1 ) {
			System.out.print(+pontuacaoLancamento[i]+ " ");
		}
		for(int z = 0; z < ocorrencias.length; z += 1) {
			for(int i = 0; i < pontuacaoLancamento.length; i +=1 ) {
				if(ocorrencias[z] == pontuacaoLancamento[i]) {
					qtdOcorrencia += 1;
				}
			}
			ocorrenciasAuxiliar[z] = qtdOcorrencia;
			qtdOcorrencia = 0;
		}
		media = soma / lancamento;
		
		
		for(int y = 0; y < ocorrenciasAuxiliar.length; y += 1 ) {
			if(ocorrenciasAuxiliar[y] > auxiliar) {
				auxiliar = ocorrenciasAuxiliar[y];
				auxiliarOcorrencia = y + 1;
			}
		}
		
		System.out.println("\nA media de ocorrencia foi de: " + media);
		System.out.println("O numero " +auxiliarOcorrencia+" teve "+ auxiliar+" ocorrencias.");
		
	}
}
