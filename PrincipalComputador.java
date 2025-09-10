package atividades;

public class PrincipalComputador {
	public static void main(String[] args) {
		
		ComputadorGamer computador1 = new ComputadorGamer();
		ComputadorHome computador2 = new ComputadorHome();
		
		System.out.println("Computador Gamer:");
		
		computador1.desligar();
		computador1.reiniciar();
		computador1.ligar();
		computador1.carregandoSistema();
		
		System.out.println(" ");
		System.out.println("Computador Home:");
		
		computador2.desligar();
		computador2.reiniciar();
		computador2.ligar();
		computador2.carregandoSistema();
		
		
	}

}
