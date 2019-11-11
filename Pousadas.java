package Empresa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pousadas extends Hospedagem implements Comparable<Pousadas>, Avaliavel, Arrumavel{
 
    protected boolean translados;


    public Pousadas() {
    }
 
    public Pousadas(
    		String nome, 
    		double _valorDiaria, 
    		int _tempoMinimoDeHospedagem,
    		boolean _cafeDaManha, 
    		double _HchackIn, 
    		double _HchackOut,
    		boolean _permiteCancelarGratis, 
    		String _idiomasFalados, 
    		int _avaliaçãoUsuario, 
    		boolean _translados) 
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
        this.translados = _translados;

    }

	public boolean isTranslados() {
		return translados;
	}

	public void setTranslados(boolean translados) {
		this.translados = translados;
	}
	@Override
	public int compareTo(Pousadas o) {
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
