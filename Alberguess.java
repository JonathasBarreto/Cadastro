package Empresa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Albergues extends Hospedagem implements Comparable<Albergues>, Avaliavel, Arrumavel{

	protected int QuantMaxHospedesPorQuarto;
 
 
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
    	this.valorDiaria = _valorDiaria;
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

	@Override
	public int compareTo(Albergues o) {
		
        if (this.getValorDiaria() < o.getValorDiaria()) {
            return -1;
        }
        if (this.getValorDiaria() > o.getValorDiaria()) {
            return 1;
        }
        return 0;
    }
	@Override
	public int getNota(int n) {
		return n;
	}
	
	@Override
	public String dataHora() {

		Date data = new Date();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatarHora = new SimpleDateFormat("H:m:s");
		String dataFormatada = formatarData.format(data);
		String horaFormatada = formatarHora.format(data);
		

		return "A data atual e horas são: "+ dataFormatada + " as " + horaFormatada;
	}
}
