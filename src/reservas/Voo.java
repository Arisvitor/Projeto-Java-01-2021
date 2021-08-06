package reservas;

public class Voo {
	//aeronave do tipo Avião
	private Aviao aeronave ;
	
	private int nro;
	private String data;
	private String hora;
	//construtor
	public Voo (Aviao aeronave, int nro, String data, String hora) throws Exception{
		if(aeronave == null)
			throw new Exception("Avião não pode ser nulo");
		this.aeronave = aeronave;
		this.nro = nro;
		this.data = data;
		this.hora = hora;
	}
	//usa o get para pegar o nro da classe voo
	public int getNro()
	{
		return this.nro;
	}
	//usa o get para pegar a data da classe voo
	public String getData()
	{
		return this.data;
	}
	//usa o get para pegar a hora da classe voo
	public String getHora()
	{
		return this.hora;
	}
}
