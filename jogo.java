import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class jogo {
	public static void main(String[] args) {
		menu.menu();
	}
	
	public static void partida(){
		int maquina = (int)(1+Math.random()*3); // Generating valid moves
		
		ArrayList<String> historico = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite" + System.lineSeparator() +
				"1) Papel " + System.lineSeparator() +
				"2) Tesoura " + System.lineSeparator() +
				"3) Pedra ");
		int jogada = scan.nextInt();
		
		// Conditions for victory or defeat 
		
			if ((jogada == 1 ) && (maquina == 2)){
				System.out.println("Perdeu, A Tesoura corta o Papel");
				
			}else if((jogada == 1) && (maquina == 3)){
				System.out.println("Ganhou, Papel embrulha a Pedra");
				
			}else if(jogada == maquina){
				System.out.println("Empate");
				
			}else if((jogada == 2) && (maquina == 1)){
				System.out.println("Ganhou, A Tesoura corta o Papel");
				
			}else if((jogada == 2) && (maquina == 3)){
				System.out.println("Perdeu , Pedra esmaga Tesoura");
				
			}else if((jogada == 3) && (maquina == 1)){
				System.out.println("Perdeu, Papel embrulha a Pedra");
				
			}else{
				System.out.println("Ganhou. Pedra esmaga Tesoura");
				
			}
	}
	public static void regras(){ // Rules
		System.out.println("* Pedra ganha da tesoura (amassando-a ou quebrando-a)."+ System.lineSeparator() +
				"* Tesoura ganha do papel (cortando-o)."+ System.lineSeparator() +
				"* Papel ganha da pedra (embrulhando-a).");

	}
		
	}




