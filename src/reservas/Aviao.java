package reservas;

public class Aviao extends Aeronave{
	
	public Passageiro lugares[][];

	public Aviao (String modelo, int fileira, int assento)
	{
		super(modelo);
		this.fileira = fileira;
		this.assento = assento;
		lugares = new Passageiro[fileira][assento];
	}
	
	public boolean verificarLugarOcupado(int fileira,int assento)
	{
	
	}
	
	public void setPassageiro(int fileira,int assento, Passageiro)
	{

	}
}