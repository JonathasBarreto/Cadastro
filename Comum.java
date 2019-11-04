package Empresa;

public class Comum extends Carro {
	
	public Comum() {
		
	}
    public Comum(
    		String nome,
    		boolean _condicionado, 
    		int _numPassageiros, 
    		String _tipoCombustivel, 
    		double _valorDiaria, 
    		boolean _SeQuilometragemLivre, 
    		String _numPlaca, 
    		int _AnoDeFabricacao, 
    		int _quilometroRodados) 
    {
    	
    	this.nome = nome;
        this.condicionado = _condicionado;
        this.numPassageiros = _numPassageiros;
        this.tipoCombustivel = _tipoCombustivel;
        this.valorDiaria = _valorDiaria;
        this.SeQuilometragemLivre = _SeQuilometragemLivre;
        this.numPlaca = _numPlaca;
        this.AnoDeFabricacao = _AnoDeFabricacao;
        this.quilometroRodados = _quilometroRodados;
    }

}
