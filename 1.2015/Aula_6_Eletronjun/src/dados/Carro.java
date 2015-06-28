package dados;

public class Carro extends Automovel {

	private Float tamportaMala;

	public Carro(String marca, String modelo, String tipoCombustivel) {
		super(marca, modelo, tipoCombustivel);
	}
	public Carro(String marca, String modelo, String tipoCombustivel,
			Float tamportaMala) {
		super(marca, modelo, tipoCombustivel);
		this.tamportaMala = tamportaMala;
	}

	public Float getTamportaMala() {
		return tamportaMala;
	}

	public void setTamportaMala(Float tamportaMala) {
		this.tamportaMala = tamportaMala;
	}

	public void setVelocidade(Float s, Float t) {
		velocidade = s / t * 1.3f;
	}

}
