/* EXERCÍCIO 3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das 
matrizes N1 e N2;
b) Uma matriz M2 cujos elementos são as diferenças dos elementos de mesma posição 
das matrizes N1 e N2.
 */

import java.util.Scanner;

public class Matrizes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int linha = 2, coluna = 2;
    int [][] n1 = new int [linha][coluna];
    int [][] n2 = new int [linha][coluna];
    int [][] m1 = new int [linha][coluna];
    int [][] m2 = new int [linha][coluna];

    for(int i = 0; i < linha; i += 1){
      for(int y = 0; y < coluna; y += 1){
        System.out.println("Entre com a linha "+i+" da coluna "+y+" da matriz N1: ");
			  n1[i][y] = input.nextInt();
        System.out.println("Entre com a linha "+i+" da coluna "+y+" da matriz N2: ");
			  n2[i][y] = input.nextInt();
        m1[i][y] = n1[i][y] + n2[i][y];
        m2[i][y] = n1[i][y] - n2[i][y];
      }
    }
    System.out.print("O resultado de M1 é de: ");

    for(int i = 0; i < linha; i += 1){
      for(int y = 0; y < coluna; y += 1){
       System.out.print(m1[i][y]+" ");
      }
    }
    System.out.print("\n");

    System.out.print("O resultado de M2 é de: ");

    for(int i = 0; i < linha; i += 1){
      for(int y = 0; y < coluna; y += 1){
       System.out.print(m2[i][y]+" ");
      }
    }
    System.out.print("\n");
  }
}
