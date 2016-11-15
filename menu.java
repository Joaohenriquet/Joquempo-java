// Joao Henrique

package joquempo;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
		static Scanner scan = new Scanner(System.in);
		static int contador = 0;
		static String op = null; 
		
		public static void menu(){
			
			do{
				contador ++;
				System.out.println("[N]ovo Jogo" +  System.lineSeparator() +
						"[R]egras" + System.lineSeparator() +
						"[S]air");
				String opcao = scan.next();
				op = opcao;
				switch(opcao){
				case "N":
					jogo.partida();
					break;
				case "R":
					jogo.regras();
					System.out.println("");
					break;
				case "S":
					System.out.println("Xablau");
					break;
				default:
					System.out.println("Comando invalido");
					break;
					
				}
			}while(!op.equals("S"));
			
			
		}

}
