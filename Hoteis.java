package Empresa;

public class Hoteis extends Hospedagem{
 
    private boolean translados;
    private int nEstrelas;
 
 
    public Hoteis() {
    }
 
    public Hoteis(
    		String nome, 
    		double _valorDiaria, 
    		int _tempoMinimoDeHospedagem,
    		boolean _cafeDaManha, 
    		double _HchackIn, 
    		double _HchackOut,
    		boolean _permiteCancelarGratis, 
    		String _idiomasFalados, 
    		int _avaliaçãoUsuario,
    		boolean _translados, 
    		int _nEstrelas) 
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
        this.translados = _translados;
        this.nEstrelas = _nEstrelas;
    }

	public boolean isTranslados() {
		return translados;
	}

	public void setTranslados(boolean translados) {
		this.translados = translados;
	}

	public int getnEstrelas() {
		return nEstrelas;
	}

	public void setnEstrelas(int nEstrelas) {
		this.nEstrelas = nEstrelas;
	}
}
