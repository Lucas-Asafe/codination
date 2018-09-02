package challenge;

import java.util.ArrayList;
import java.util.List;
import challenge.State;

public class Main {

	public List<State> listThe10largestStatesInBrazil() {
		List<State> lista = new ArrayList<>();

		lista.add(new State("AM", "Amazonas"));	
		lista.add(new State("PA", "Pará"));	
		lista.add(new State("MT", "Mato Grosso"));	
		lista.add(new State("MG", "Minas Gerais"));	
		lista.add(new State("BA", "Bahia"));	
		lista.add(new State("MS", "Mato Grosso do Sul"));	
		lista.add(new State("GO", "Goiás"));	
		lista.add(new State("MA", "Maranhão"));	
		lista.add(new State("RS", "Rio Grande do Sul"));
		lista.add(new State("TO", "Tocantins"));	

		return lista;
	}

}
