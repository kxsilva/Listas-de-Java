package Lista_5.questao_3;

public class Carro extends Transporte{

	int quilometragem;

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		if(quilometragem < 0) {
			this.quilometragem = 0;
		} 
		else if(quilometragem > 999999) {
			this.quilometragem = 999999;
		}
		else {
			this.quilometragem = quilometragem;
		}
	}
	
	@Override
	public void setVelocidade(int velocidade) {
		if(velocidade < 0) {
			this.velocidade = 0;
		}
		else if(velocidade > 200) {
			this.velocidade = 200;
		}
		else {
			this.velocidade = velocidade;
		}
		
	}
	
}
