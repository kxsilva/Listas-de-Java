package Lista_6.questao_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeiculoTeste {

	public static void main(String[] args) {
		
		Bicicleta b1 = new Bicicleta("Chassi", "Bicicleta", 10, 4);
		Bicicleta b2 = new Bicicleta("Chassi2", "Bicicleta", 10, 5);
		Bicicleta b3 = new Bicicleta("Chassi3", "Bicicleta", 10, 7);
		
		Carro c1 = new Carro("Chassi4", "Carro", 180, 10);
		Carro c2 = new Carro("Chassi5", "Carro", 170, 15);
		
		List<Veiculo> veiculos = new ArrayList<>();
		
		veiculos.addAll(Arrays.asList(b1, b2, b3, c1, c2));
		
		for(Veiculo v : veiculos) {
			v.Ajustar();
			v.Limpar();
		}
		
		for(Veiculo v : veiculos) {
			if(v instanceof Bicicleta) {
				((Bicicleta) v).aumentarMarcha(2);
			}
		}
		
		for(Veiculo v : veiculos) {
			if(v instanceof Carro) {
				((Carro) v).trocarOleo();
			}
		}
		
		System.out.println("Quantidade de veiculos: " + veiculos.size());

	}

}
