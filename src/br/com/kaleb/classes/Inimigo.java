/* 4ªAvaliação POO
 * kelly cibely / Aline Alves */
package br.com.kaleb.classes;

import jplay.Sprite;

public class Inimigo extends Sprite {

	public Inimigo(String fileName, int numFrames) {
		super(fileName, numFrames);
		
	}
			
	public void moverDireita() {
		
		this.x-= 2.60;
	}
	
	public void moverEsquerda(){
		this.x+=2.60;
	}

	
}
