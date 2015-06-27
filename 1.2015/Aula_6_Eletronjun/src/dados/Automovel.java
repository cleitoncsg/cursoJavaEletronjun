package dados;

public abstract class Automovel {

	private String marca;
	private String modelo;
	private String tipoCombustivel;
	protected Float velocidade;

	public Automovel(String marca, String modelo, String tipoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipoCombustivel = tipoCombustivel;
	}

	public Float getVelocidade()
	{
		return velocidade;
	}
	
	public abstract void setVelocidade(Float s, Float t);
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
}
