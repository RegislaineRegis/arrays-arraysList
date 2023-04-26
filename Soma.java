/*EXERCÍCIO 4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
ou seja, diagonal principal.
*/

import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int linha = 3, coluna = 3, somaMatriz = 0, somaDiagonal=0;
    int [][] m1 = new int [linha][coluna];

    for(int i = 0; i < linha; i += 1){
      for(int y = 0; y < coluna; y += 1){
        System.out.println("Entre com a linha "+i+" da coluna "+y+" da matriz N1: ");
			  m1[i][y] = input.nextInt();
        somaMatriz += m1[i][y];

        if(i == y) {
          somaDiagonal += m1[i][y];
        }
      }
    }

    System.out.println("\nO resultado da soma da matriz: " + somaMatriz);
    System.out.println("O resultado da soma da Diagonal: " + somaDiagonal);  
  }
}
