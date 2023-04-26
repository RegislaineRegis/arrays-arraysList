/*
EXERCÍCIO 1.      Faça um programa que crie um vetor por 
leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
Encontre após a maior pontuação e a apresente.
*/

import java.util.Scanner;

public class MaiorPontuacao {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
    int valores = 5;
		int [] pontuacao = new int [valores];
		int auxiliar = 0;
		
		for(int i = 0; i < pontuacao.length; i +=1) {
			System.out.println("Entre com a pontuacao do Aluno: ");
			pontuacao[i] = input.nextInt();
		}		
		for(int i = 0; i < pontuacao.length; i +=1) {
     	if(pontuacao[i] > auxiliar) {
				auxiliar = pontuacao[i];
			}
			System.out.println("A " + (i+1)+" pontuacao da atividade é: " + pontuacao[i]);		
		}		
		System.out.println("A maior pontuacao é de: " + auxiliar);
	}
}
