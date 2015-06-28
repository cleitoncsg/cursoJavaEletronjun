package dados;

public class Moto extends Automovel{

	private String modeloGuidao;
	
	public Moto(String marca, String modelo, String tipoCombustivel,
			String modeloGuidao) {
		super(marca, modelo, tipoCombustivel);
		this.modeloGuidao = modeloGuidao;
	}

	public String getModeloGuidao() {
		return modeloGuidao;
	}

	public void setModeloGuidao(String modeloGuidao) {
		this.modeloGuidao = modeloGuidao;
	}
	public void setVelocidade(Float s, Float t) {
		velocidade = s / t * 1.5f;
	}
}
