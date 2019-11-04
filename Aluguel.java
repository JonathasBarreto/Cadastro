package Empresa;

public class Aluguel extends Hospedagem{
 
    private boolean seCozinha;
    private int quartos;
 
 
    public Aluguel() {
    }
 
    public Aluguel(
    		String nome,
    		double _valorDiaria, 
    		int _tempoMinimoDeHospedagem,
    		boolean _cafeDaManha, 
    		double _HchackIn, 
    		double _HchackOut,
    		boolean _permiteCancelarGratis, 
    		String _idiomasFalados, 
    		int _avaliaçãoUsuario, 
    		boolean _seCozinha, 
    		int _quartos) 
    {
    	
    	this.nome = nome;
    	this.valorDiaria = valorDiaria;
        this.tempoMinimoDeHospedagem = _tempoMinimoDeHospedagem;
        this.cafeDaManha = _cafeDaManha;
        this.HchackIn = _HchackIn;
        this.HchackOut = _HchackOut;
        this.permiteCancelarGratis = _permiteCancelarGratis;
        this.idiomasFalados = _idiomasFalados;
        this.avaliaçãoUsuario = _avaliaçãoUsuario;
        this.seCozinha = _seCozinha;
        this.quartos = _quartos;
    }

	public boolean isSeCozinha() {
		return this.seCozinha;
	}

	public void setSeCozinha(boolean seCozinha) {
		this.seCozinha = seCozinha;
	}

	public int getQuartos() {
		return this.quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

}
