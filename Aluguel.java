package Empresa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluguel extends Hospedagem implements Comparable<Aluguel>, Avaliavel, Arrumavel{
 
    protected boolean seCozinha;
    protected int quartos;
 
 
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
    		int _avaliacaoUsuario, 
    		boolean _seCozinha, 
    		int _quartos) 
    {
    	
    	this.nome = nome;
    	this.valorDiaria = _valorDiaria;
        this.tempoMinimoDeHospedagem = _tempoMinimoDeHospedagem;
        this.cafeDaManha = _cafeDaManha;
        this.HchackIn = _HchackIn;
        this.HchackOut = _HchackOut;
        this.permiteCancelarGratis = _permiteCancelarGratis;
        this.idiomasFalados = _idiomasFalados;
        this.avaliacaoUsuario = _avaliacaoUsuario;
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
	@Override
	public int compareTo(Aluguel o) {
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
