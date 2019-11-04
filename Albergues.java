package Empresa;

public class Albergues extends Hospedagem{

	private int QuantMaxHospedesPorQuarto;
 
 
    public Albergues() {
    }
 
    public Albergues(
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
    		int _quartos,
    		int _QuantMaxHospedesPorQuarto) 
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

        this.QuantMaxHospedesPorQuarto = _QuantMaxHospedesPorQuarto;
	}

	public int getQuantMaxHospedesPorQuarto() {
		return this.QuantMaxHospedesPorQuarto;
	}

	public void setQuantMaxHospedesPorQuarto(int QuantMaxHospedesPorQuarto) {
		this.QuantMaxHospedesPorQuarto = QuantMaxHospedesPorQuarto;
	}

}
