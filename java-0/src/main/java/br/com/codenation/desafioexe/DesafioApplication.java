package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {

	private static int[] vetAux = new int[15];
	private static int k;

	public static List<Integer> SequenciaFibonacci(int n) {
		List<Integer> lista = new ArrayList<>();
		int fib = 0;
		int i = 0;
		
		while (fib < n) {
			fib = fibo(i);
			lista.add(fib);
			i++;
		}
		
		return lista;
	}

	public static Integer fibo(int n) {
		k = 1; 
		return recursao(n);
	}

	private static Integer recursao(int n) {
		if (n < 0) {
			return vetAux[0];
		} else {
			if (k < 3) {
				vetAux[n] = k - 1;
				k++;
			} else {
				vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
			}
			return recursao(n - 1);
		}
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		return SequenciaFibonacci(350);
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

	public static void main(String[] args) {
		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	}

}
