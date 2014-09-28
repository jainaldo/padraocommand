package br.com.padraocommand.robo;

public class Robo {
	
	public void Mover(Integer paraFrente){
		if (paraFrente > 0 ){
			System.out.println("O Robo foi movimentado para frente"+ paraFrente+"mm.");
		}else{
			System.out.println("O Robo foi movimentado para trás "+ -paraFrente+"mm.");
		}
	}

}
