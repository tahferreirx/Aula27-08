package atividades;

public class Calculando implements Calculos {

	@Override
	public double somar(double a, double b) {
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

	@Override
	public double mult(double a, double b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Divisão por zero não é permitida");
		}
		return a / b;
	}

	@Override
	public int exp(int base, int exponente) {
		return (int) Math.pow(base, exponente);
	}

}