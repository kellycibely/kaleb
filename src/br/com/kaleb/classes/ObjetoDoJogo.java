/* 4ªAvaliação POO
 * kelly cibely / Aline Alves */
package br.com.kaleb.classes;

import jplay.*;

public class ObjetoDoJogo extends Sprite{

	public ObjetoDoJogo(String fileName) {
		super(fileName);
		
	}
		
	public void moverDireita(){
		this.x -=2.6;
	}
	public void moverEsquerda(){
		this.x+=2.6;
	}
}