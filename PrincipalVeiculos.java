package atividades;

public class PrincipalVeiculos {
	public static void main(String[] args) {
		
		VeiculoCarro carro = new VeiculoCarro();
		VeiculoÔnibus onibus = new VeiculoÔnibus();
		
		System.out.println("Carro:");
		
		carro.desligarr();
		carro.ligar();
		carro.acelerar();
		carro.engatar();
		carro.manobrar();
		carro.frear();
		
		System.out.println(" ");
		System.out.println("Ônibus:");
		
		onibus.desligarr();
		onibus.ligar();
		onibus.acelerar();
		onibus.engatar();
		onibus.manobrar();
		onibus.frear();
		
	}

}
