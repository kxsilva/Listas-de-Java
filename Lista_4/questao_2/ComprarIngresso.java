package Lista_4.questao_2;

import java.util.Scanner;

public class ComprarIngresso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o tipo do Ingresso: \n1 - Normal\n2 - VIP\n- ");
		int tipoIngresso = sc.nextInt();
		
		if(tipoIngresso == 1) {
			Normal ingresso = new Normal(10.00);
			
			ingresso.ingressoNormal();
			ingresso.ImprimeValor();
			
		} else if(tipoIngresso == 2) {
			System.out.println("O ingresso será Camarote Superior ou Inferior?\n1 - Superior\n2 - Inferior\n- ");
			int tipoVIP = sc.nextInt();
			
			if(tipoVIP == 1) {
				CamaroteSuperior ingresso = new CamaroteSuperior(10.00, 5.00, 3.00);
				
				System.out.println("Ingresso VIP, camarote Superior, valor: R$ " + ingresso.valorSuperior());
			}
			else if(tipoVIP == 2) {
				CamaroteInferior ingresso = new CamaroteInferior(10.00, 5.00, "loc-A1");
				
				System.out.println("Ingresso VIP, camarote Inferior, valor: R$ " + ingresso.valorVIP());
			}
			else {
				System.out.println("Entrada Invalida");
			}
		}
		else {
			System.out.println("Entrada Invalida");
		}
		
	}
}
