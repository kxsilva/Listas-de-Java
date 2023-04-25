package Lista_10.questao_1;

public class Contas {
	public static void main(String[] args) {
		
		
		mostrarCalculo(new Soma(), 1, 2);
		
		mostrarCalculo(new Subtracao(), 2, 2);
		
	}
	
	public static void mostrarCalculo(OperacaoMatematica op, double a, double b) {
		System.out.println(op.calcular(a, b));
	}
		
}
	
	

