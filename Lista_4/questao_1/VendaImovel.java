package Lista_4.questao_1;

import java.util.Scanner;

public class VendaImovel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//A exemplo de teste, um Imovel custará R$ 10.000,00
		
		System.out.println("Escolha o tipo do imovel:\n1 - Novo\n2 - Usado");
		int tipoImovel = sc.nextInt();
		
		
		
		if(tipoImovel == 1) {
			Novo imovel = new Novo("Rua nova", 10000.00);
			
			imovel.ImpressaoPreco();
			
		} else if(tipoImovel == 2) {
			Usado imovel = new Usado("Rua velha", 10000.00);
			
			imovel.ImpressaoPreco();
			
		} else {
			System.out.println("Entrada Inválida");
		}
		
		
		
	}

}
