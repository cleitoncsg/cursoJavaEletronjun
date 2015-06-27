package dados;

public class Caminhao extends Automovel {

	private Float cargaMaxima;
	
	public Caminhao(String marca, String modelo, String tipoCombustivel,
			Float cargaMaxima) {
		super(marca, modelo, tipoCombustivel);
		this.cargaMaxima = cargaMaxima;
	}

	public Float getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Float cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public void setVelocidade(Float s, Float t) {
		velocidade = s / t * 0.9f;
	}
}
