package reservas;

public class Aviao extends Aeronave{
	//lugares é um atributo do tipo MATRIZ DE PASSAGEIRO
	public Passageiro[][] lugares;
	//construtor 
	public Aviao (String modelo, int fileiras, int assentos){
		//chama o construtor da classe mãe, nesse caso Aeronave
		super(modelo);
		//instancia a classe Passageiro, cria uma nova matriz de passageiro
		this.lugares = new Passageiro[fileiras][assentos];
	}
	//Recebe as coordenadas de um assento e retorna true ou false (caso esteja ocupado ou não). 
	//verifica se o valor é null(vazio) e retorna TRUE ou FALSE
	public boolean verificarLugarOcupado(int fileira,int assento){
		return this.lugares[fileira][assento] != null;
	}
	//Recebe as coordenadas de um assento e retorna um objeto Passageiro. Se o lugar estiver vazio deverá retornar NULL
	public Passageiro getPassageiro(int fileira, int assento){
		return this.lugares[fileira][assento];
	}
	//Recebe as coordenadas de um assento e um objeto Passageiro. O passageiro será atribuído na coordenada do assento
	//this.lugares[fileira][assento] é um objeto quando acessado que recebe o objeto passageiro
	public void setPassageiro(int fileira,int assento,Passageiro passageiro){
		this.lugares[fileira][assento] = passageiro;
	}
	@Override
	public String toString(){
        return this.modelo;
    }
}