package reservas;

public class Voo {
	
	private aeronave Aviao;
	
	private int nro;
	private String data;
	private String hora;

	public Voo (aeronave Aviao, int nro, String data, String hora);
	
	public int getNro()
	{
		return nro;
	}
	
	public String getData()
	{
		return data;
	}
	
	public String getHora()
	{
		return hora;
	}
}
