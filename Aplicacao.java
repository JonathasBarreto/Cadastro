package Aplicacao;

import java.util.*;
import Empresa.Albergues;
import Empresa.Aluguel;
import Empresa.Arrumavel;
import Empresa.Hoteis;
import Empresa.Pousadas;
import Empresa.Carro;
import java.util.Collections;
import Empresa.TIPO;
import Empresa.Avaliavel;
public class Aplicacao {
	 
    private static Scanner entrada;

	public static void main(String[] args){
    	entrada = new Scanner(System.in);
    	int k = 0;

        //carros
        Carro car1 = new Carro(TIPO.COMUM,"gg1", true, 16, "gg", 12.99, true, "ggp23", 5, 16);
        Carro car2 = new Carro(TIPO.COMUM,"gg2", true, 16, "gg", 12.99, true, "ggp23", 199, 16);
        Carro car3 = new Carro(TIPO.COMUM,"gg3", true, 14, "gg", 12.99, true, "ggp23", 20, 14);
        
        Carro car4 = new Carro(TIPO.BASICO,"gg4", true, 16, "gg", 12.99, true, "ggp23", 5, 16);
        Carro car5 = new Carro(TIPO.BASICO,"gg5", true, 16, "gg", 12.99, true, "ggp23", 199, 16);
        Carro car6 = new Carro(TIPO.BASICO,"gg6", true, 14, "gg", 12.99, true, "ggp23", 20, 14);
        
        Carro car7 = new Carro(TIPO.EXECUTIVO,"gg7", true, 16, "gg", 12.99, true, "ggp23", 5, 16);
        Carro car8 = new Carro(TIPO.EXECUTIVO,"gg8", true, 16, "gg", 12.99, true, "ggp23", 199, 16);
        Carro car9 = new Carro(TIPO.EXECUTIVO,"gg9", true, 14, "gg", 12.99, true, "ggp23", 20, 14);
        
        Carro car10 = new Carro(TIPO.LUXO,"gg10", true, 16, "gg", 12.99, true, "ggp23", 5, 16);
        Carro car11 = new Carro(TIPO.LUXO,"gg11", true, 16, "gg", 12.99, true, "ggp23", 199, 16);
        Carro car12 = new Carro(TIPO.LUXO,"gg12", true, 14, "gg", 12.99, true, "ggp23", 20, 14);
        
        //hospedagens
        Albergues alb1 = new Albergues("PP1",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11, 11);
        Albergues alb2 = new Albergues("PP2",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11, 11);
        Albergues alb3 = new Albergues("PP3",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11, 11);
        
        Aluguel alu1 = new Aluguel("PP4",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11);
        Aluguel alu2 = new Aluguel("PP5",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11);
        Aluguel alu3 = new Aluguel("PP6",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11);
        
        Hoteis hot1 = new Hoteis("PP7",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11);
        Hoteis hot2 = new Hoteis("PP8",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11);
        Hoteis hot3 = new Hoteis("PP9",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true, 11);
        
        Pousadas pou1 = new Pousadas("PP10",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true);
        Pousadas pou2 = new Pousadas("PP11",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true);
        Pousadas pou3 = new Pousadas("PP12",16.12 , 11, true, 1.12, 2.12, true, "gg", 11, true);

        Avaliavel notaCAR = new Carro();//INTERFACE
        Avaliavel notaALB = new Albergues();
        Avaliavel notaALU = new Aluguel();
        Avaliavel notaHOT = new Hoteis();
        Avaliavel notaPOU = new Pousadas();
        
        Arrumavel dataCar = new Carro();//INTERFACE2
        Arrumavel dataALB = new Albergues();
        Arrumavel dataALU = new Aluguel();
        Arrumavel dataHOT = new Hoteis();
        Arrumavel dataPOU = new Pousadas();
        
        //devo passar o array list como parametro para os construtores?
        ArrayList<Albergues> albergues = new ArrayList<Albergues>();
        ArrayList<Aluguel> aluguel = new ArrayList<Aluguel>();
        ArrayList<Hoteis> hoteis = new ArrayList<Hoteis>();
        ArrayList<Pousadas> pousadas = new ArrayList<Pousadas>();
        ArrayList<Carro> carro = new ArrayList<Carro>();
        ArrayList<Carro> basico = new ArrayList<Carro>();
        ArrayList<Carro> comum = new ArrayList<Carro>();
        ArrayList<Carro> executivo = new ArrayList<Carro>();
        ArrayList<Carro> luxo = new ArrayList<Carro>();

        carro.add(car1);
        carro.add(car2);
        carro.add(car3);
        carro.add(car4);
        carro.add(car5);
        carro.add(car6);
        carro.add(car7);
        carro.add(car8);
        carro.add(car9);
        carro.add(car10);
        carro.add(car11);
        carro.add(car12);
        
        albergues.add(alb1);
        albergues.add(alb2);
        albergues.add(alb3);
        
        aluguel.add(alu1);
        aluguel.add(alu2);
        aluguel.add(alu3);
        
        hoteis.add(hot1);
        hoteis.add(hot2);
        hoteis.add(hot3);
        
        pousadas.add(pou1);
        pousadas.add(pou2);
        pousadas.add(pou3);

        Collections.sort(carro); 
        Collections.sort(albergues);
        Collections.sort(hoteis);
        Collections.sort(pousadas);
        Collections.sort(aluguel);
        
        
        System.out.println("Menu");
        System.out.println("Qual tipo de serviço desejas?");
        System.out.println("1 - Carros");
        System.out.println("2 - Hospedagem");
        System.out.println("3 - Sair");
        System.out.println("Opção: ");
 
        int opcao = entrada.nextInt();
 
        switch(opcao){
            case 1:
            	
                System.out.println("Qual tipo de veículo deseja cadastrar?:");
                System.out.println("1 - Básico");
                System.out.println("2 - Comum");
                System.out.println("3 - Executivo");
                System.out.println("4 - Luxo");
                System.out.println("5 - Sair");
                System.out.println("Opção: ");
         
                int opcao2 = entrada.nextInt();
         
                switch(opcao2){
                
                    case 1:
                        int confirm = 1;
                        do {
                	        int i = 0;
                	        for(Carro b : carro) {
                	        	
                	        	if(b.getTipo().equals(TIPO.BASICO)) {
                	        		i++;
                	        		System.out.print("("+i+") ");
                	        		System.out.println(b.getNom());
                	        		basico.add(b);
                	        	}
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Carro p = (Carro)basico.get(x - 1);
                        	
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getNom(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricacao(),//int
                	        		p.getQuilometroRodados()//int
                	        		);


                	        System.out.println("Se deseja alugar o veiculo digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm = entrada.nextInt();
                        }while(confirm != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.println("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
                        
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. \n");
                        	System.out.println("A nota da avaliação foi: "+ notaCAR.getNota(k));//INTERFACE
                        	System.out.println(dataCar.dataHora());//INTERFACE2
                        	
                    break;
                    case 2:
                        int confirm2 = 1;
                        do {
                	        int i = 0;
                	        for(Carro c : carro) {
                	        	
                	        	if(c.getTipo().equals(TIPO.COMUM)) {
                	        		i++;
                	        		System.out.print("("+i+") ");
                	        		System.out.println(c.getNom());
                	        		comum.add(c);
                	        	}
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Carro p = (Carro)comum.get(x - 1);
                        	
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getNom(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricacao(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	     
                	        
                	        
                	        System.out.println("Se deseja alugar o veiculo digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm2 = entrada.nextInt();
                        }while(confirm2 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi: "+ notaCAR.getNota(k));//INTERFACE
                        	System.out.println(dataCar.dataHora());//INTERFACE2
                        	
                    break;
                    case 3:
                        int confirm3 = 1;
                        do {
                	        int i = 0;
                	        for(Carro e : carro) {
                	        	
                	        	if(e.getTipo().equals(TIPO.EXECUTIVO)) {
                	        		i++;
                	        		System.out.print("("+i+") ");
                	        		System.out.println(e.getNom());
                	        		executivo.add(e);
                	        	}
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Carro p = (Carro)executivo.get(x - 1);
                        	
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getNom(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricacao(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	        
                	        
                	        
                	        System.out.println("Se deseja alugar o veiculo digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm3 = entrada.nextInt();
                        }while(confirm3 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        	
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi: "+ notaCAR.getNota(k));//INTERFACE
                        	System.out.println(dataCar.dataHora());//INTERFACE2
                        	
                    break;
                    case 4:
                        int confirm4 = 1;
                        do {
                	        int i = 0;
                	        for(Carro l : carro) {
                	        	
                	        	if(l.getTipo().equals(TIPO.LUXO)) {
                	        		i++;
                	        		System.out.print("("+i+") ");
                	        		System.out.println(l.getNom());
                	        		luxo.add(l);
                	        	}
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Carro p = (Carro)luxo.get(x - 1);
                        	
                	        System.out.printf("%s, %b, %d, %s, %2f, %b, %s, %d, %d \n\n",
                	        		p.getNom(),//String
                	        		p.isCondicionado(),//boolean
                	        		p.getNumPassageiros(),//int
                	        		p.getTipoCombustivel(),//string
                	        		p.getValorDiaria(),//double
                	        		p.isSeQuilometragemLivre(),//boolean
                	        		p.getNumPlaca(),//string
                	        		p.getAnoDeFabricacao(),//int
                	        		p.getQuilometroRodados()//int
                	        		);
                	       
                	        
                	        
                	        System.out.println("Se deseja alugar o veiculo digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm4 = entrada.nextInt();
                        }while(confirm4 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
	            	        	k = entrada.nextInt();
	            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        	
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi de: "+ notaCAR.getNota(k));//INTERFACE
                        	System.out.println(dataCar.dataHora());//INTERFACE2
                        	
                    break;
                    case 5:
                    	
                        System.out.println("Até Logo...");
                        
                    break;
                    default:
                    	
                        System.out.println("Por favor, digite uma opção válida");
                        
                    break;
                }
            break;
            case 2:

                System.out.println("Qual tipo de Hospedagem deseja cadastrar?:");
                System.out.println("1 - Hóteis");
                System.out.println("2 - Pousadas");
                System.out.println("3 - Aluguel de casas ou\r\n" + 
                		"apartamentos");
                System.out.println("4 - Albergues");
                System.out.println("5 - Sair");
                System.out.println("Opção: ");
         
                int opcao3 = entrada.nextInt();
         
                switch(opcao3){
                
                    case 1:
                        int confirm5 = 1;
                        do {
                	        int i = 0;
                	        for(Hoteis h : hoteis) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(h.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	int x = entrada.nextInt();
                        	Hoteis p = (Hoteis)hoteis.get(x - 1);
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %b, %d \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.isTranslados(),//boolean
                	        		p.getnEstrelas()//int
                	        		);
                	        
                	        
                	        
                	        System.out.println("Se deseja alugar a hospedagem digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm5 = entrada.nextInt();
                        }while(confirm5 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi: "+ notaHOT.getNota(k));//INTERFACE
                        	System.out.println(dataHOT.dataHora());//INTERFACE2
                        	
                    break;
                    case 2:
                        int confirm6 = 1;
                        do {
                	        int i = 0;
                	        for(Pousadas p : pousadas) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(p.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Pousadas p = (Pousadas)pousadas.get(x - 1);
                        	
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %b \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.isTranslados()//boolean
                	        		);
                	        
                	        

                	        System.out.println("Se deseja alugar a hospedagem digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm6 = entrada.nextInt();
                        }while(confirm6 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        	
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi: "+ notaPOU.getNota(k));//INTERFACE
                        	System.out.println(dataPOU.dataHora());//INTERFACE2
                        	
                        	
                    break;
                    case 3:
                        int confirm7 = 1;
                        do {
                	        int i = 0;
                	        for(Aluguel a : aluguel) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(a.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Aluguel p = (Aluguel)aluguel.get(x - 1);
                        	
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %b, %d \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.isSeCozinha(),//boolean
                	        		p.getQuartos()//int
                	        		);
                	      
                	        

                	        System.out.println("Se deseja alugar a hospedagem digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm7 = entrada.nextInt();
                        }while(confirm7 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        	
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi: "+ notaALU.getNota(k));//INTERFACE
                        	System.out.println(dataALU.dataHora());//INTERFACE2
                        	
                    break;
                    case 4:
                        int confirm8 = 1;
                        do {
                	        int i = 0;
                	        for(Albergues al : albergues) {
                	        	i++;
                	        	System.out.print("("+i+") ");
                	        	System.out.println(al.getNome());
                	        	
                	        }

                        	System.out.println("Informe o numero referente ao carro desejado:");
                        	
                        	int x = entrada.nextInt();
                        	Albergues p = (Albergues)albergues.get(x - 1);
                        	
                	        System.out.printf("%s, %2f, %d, %b, %2f, %2f, %b, %s, %d, %d \n\n",
                	        		p.getNome(),//String
                	        		p.getValorDiaria(),//double
                	        		p.getTempoMinimoDeHospedagem(),//int
                	        		p.isCafeDaManha(),//boolean
                	        		p.getHchackIn(),//double
                	        		p.getHchackOut(),//double
                	        		p.isPermiteCancelarGratis(),//boolean
                	        		p.getIdiomasFalados(),//String
                	        		p.getAvaliaçãoUsuario(),//int
                	        		p.getQuantMaxHospedesPorQuarto()//int
                	        		);
                	        
                	        
                	       
                	        System.out.println("Se deseja alugar a hospedagem digite 1, caso não deseje,"
                	        		+ " aperte qualquer outra tecla para voltar a tela de seleção!");
                	        
                	        confirm8 = entrada.nextInt();
                        }while(confirm8 != 1);
                        
            	        	do{//INTERFACE
            	        	
            	        		System.out.print ("Informe a nota de avaliação para o serviço: ");
            	        		k = entrada.nextInt();
            	        	
            	        	}while(k < 0 || k > 10);//INTERFACE
            	        	
                        	System.out.println("Parabens!! Aluguel efetuado com sucesso. ");
                        	System.out.println("A nota da avaliação foi: "+ notaALB.getNota(k));//INTERFACE
                        	System.out.println(dataALB.dataHora());//INTERFACE2
                    break;
                    case 5:
                    	
                        System.out.println("Até Logo...");
                        
                    break;
                    default:
                    	
                        System.out.println("Por favor, digite uma opção válida");
                        
                    break;
                }
            break;
            case 3:
            	
                System.out.println("Até Logo...");
                
            break;
            default:
            	
                System.out.println("Por favor, digite uma opção válida");
                
            break;
        }
 
    } 
 
}
