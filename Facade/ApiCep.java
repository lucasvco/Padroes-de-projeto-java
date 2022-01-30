package Facade;

public class ApiCep {

	private static ApiCep instancia = new ApiCep();

	private ApiCep() {
		super();
	}

	public static ApiCep getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Brasilia";
	}
	
	public String recuperarEstado(String cep) {
		return "DF";
	}
}
