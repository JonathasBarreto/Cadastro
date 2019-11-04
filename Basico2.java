package Empresa;

import Empresa.Basico;

public class Basico extends Carro implements Comparable<Basico>{
	
	public Basico() {
		
	}
    public Basico(
    		String nome, 
    		boolean _condicionado, 
    		int _numPassageiros, 
    		String _tipoCombustivel, 
    		double _valorDiaria, 
    		boolean _SeQuilometragemLivre, 
    		String _numPlaca, 
    		int _AnoDeFabricação, 
    		int _quilometroRodados) 
    {
    	
    	this.nome = nome;
        this.condicionado = _condicionado;
        this.numPassageiros = _numPassageiros;
        this.tipoCombustivel = _tipoCombustivel;
        this.valorDiaria = _valorDiaria;
        this.SeQuilometragemLivre = _SeQuilometragemLivre;
        this.numPlaca = _numPlaca;
        this.AnoDeFabricação = _AnoDeFabricação;
        this.quilometroRodados = _quilometroRodados;
    }

	@Override
	public int compareTo(Basico o) {
        if (this.getAnoDeFabricação() < o.getAnoDeFabricação()) {
            return -1;
        }
        if (this.getAnoDeFabricação() > o.getAnoDeFabricação()) {
            return 1;
        }
        return 0;
    }
}
