package br.com.kaleb.jogo;

import java.awt.Color;
import java.awt.event.KeyEvent;

import br.com.kaleb.classes.Inimigo;
import br.com.kaleb.classes.ObjetoDoJogo;
import br.com.kaleb.classes.Pinguim;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Parallax;
import jplay.Sound;
import jplay.Window;

public class Fase2 {
    
 public Fase2(){
	
	Pinguim pinguim = new Pinguim();
	ObjetoDoJogo pontuacao = new ObjetoDoJogo("pontuacao.png");
	ObjetoDoJogo fogo = new ObjetoDoJogo("fogo.gif");   
	ObjetoDoJogo casinha = new ObjetoDoJogo("casinha.png");   
	
	Window window = new Window(800,600);
	  pinguim.setJumpVelocity(6.5);
    
    Keyboard keyboard = window.getKeyboard();  
	Parallax p = new Parallax();
	p.add("fundofase2.2.png");
	p.setVelAllLayers(2.60,0);
	boolean executando = true;
	
	  
  	 boolean fimDeJogo;
    fimDeJogo = false;
    boolean colisao = false;
    int vidas = 5;
    int pontos = 0;
    
     fogo.setX(500);
     fogo.setY(420);
     casinha.setX(610);
     casinha.setY(350);
    
	while(executando){
		
		double velocidade = 2.60;
   		p.drawLayers();
   		p.repeatLayers(800, 600, true);
   		double posicao = pinguim.x;	
   
     
     
       if(keyboard.keyDown(Keyboard.RIGHT_KEY) && posicao>350 && !fimDeJogo)
		{
			p.moveLayersStandardX(true);
			velocidade = 0;
			fogo.moverDireita();
			casinha.moverDireita();
			
		}else if(keyboard.keyDown(Keyboard.LEFT_KEY) && posicao <400 && !fimDeJogo){
   			
   			p.moveLayersStandardX(false);
   			velocidade = 0;
   			fogo.moverEsquerda();
   			casinha.moverEsquerda();
   			
   		}
     
       if(pinguim.collided(casinha)){
  			pinguim.setFloor(430);
  		}else{ pinguim.setFloor(540);
   		}
      
   		
   		pinguim.draw();
   		pontuacao.draw();
   		fogo.draw();
   		casinha.draw();
   		
   		
   	 window.drawText("Pular:  Barra de espaco.", 60, 20, Color.RED);
     window.drawText("Setas lado movem o boneco.", 60, 40, Color.RED);
     window.drawText("VIDAS "+vidas,60,60,Color.RED);
     window.drawText("PONTUACAO "+pontos,60,80,Color.RED);
     window.update();
     
   	 pinguim.move(keyboard, window, velocidade, colisao, fimDeJogo);	                  
     window.delay(10);
     
   if(keyboard.keyDown(keyboard.ESCAPE_KEY)){
	   executando = false;
    }
 } 

}
}
