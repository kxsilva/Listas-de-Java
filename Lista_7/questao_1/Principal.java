package Lista_7.questao_1;

public class Principal {

	public static void main(String[] args) {
		
		Fabricante fab = new Fabricante("Fabricante", "123456789");
		
		Motor motor = new Motor(10, "Chassi", 13);
		
		Pneu pneu = new Pneu(10, 10, fab);
		
		TipoMarcha tipM = new TipoMarcha(4, fab);
		
		Marcha marcha = new Marcha("6", tipM);
		
		Carroceria carroceria = new Carroceria("tipo1", fab);
		
		Caminhao caminhao = new Caminhao("modelo1", "KIA-3019", false, fab, marcha, carroceria, pneu, motor);
		
		Carro carro = new Carro("modelo1", "KIA-1930", fab, motor, pneu);
		
		Frota frota  = new Frota("Frota", "tipo1", "Resp", carro, caminhao);
		
		System.out.println(frota.toString());
		
		

	}

}
