package reservas;

public class Aeronave {
	
	protected String modelo;
	
	//construtor recebe o modelo
	public Aeronave(String modelo)
	{
		this.setModelo(modelo);
	}
	//getter precisa ser public
	public String getModelo()
	{
		return this.modelo;
	}
	//setter também precisam ser public
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
}
