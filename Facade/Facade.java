package Facade;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = ApiCep.getInstancia().recuperarCidade(cep);
		String estado = ApiCep.getInstancia().recuperarEstado(cep);
		
		ServicoCrm.gravarCliente(nome, cep, cidade, estado);
	}
}
