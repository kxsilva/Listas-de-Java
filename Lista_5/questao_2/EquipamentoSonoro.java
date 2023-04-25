package Lista_5.questao_2;

public class EquipamentoSonoro extends Equipamento{

	private short volume;
	private boolean stereo;
	
	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		if(volume < 0) {
			this.volume = 0;
		}
		else if(volume > 10) {
			this.volume = 10;
		} else {
			this.volume = volume;
		}
	}
	
	public void mono() {
		this.stereo = true;
	}
	
	@Override
	public void liga() {
		ligado = true;
		this.volume = 5;
	}
	
}
