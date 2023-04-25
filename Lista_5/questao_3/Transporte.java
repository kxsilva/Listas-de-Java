package Lista_5.questao_3;

public class Transporte {

	boolean ligado;
	int velocidade;
	
	
	public void liga() {
		this.ligado = true;
	}
	
	public void desliga() {
		this.ligado = false;
		this.velocidade = 0;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if(velocidade < 0) {
			this.velocidade = 0;
		}
		else {
			this.velocidade = velocidade;
		}
		
	}
	
	
}
