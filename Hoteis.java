package Empresa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hoteis extends Hospedagem implements Comparable<Hoteis>, Avaliavel, Arrumavel{
 
    protected boolean translados;
    protected int nEstrelas;
 
 
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
    	this.valorDiaria = _valorDiaria;
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
	@Override
	public int compareTo(Hoteis o) {
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
