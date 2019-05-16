 
package br.com.kaleb.jogo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import br.com.kaleb.classes.Inimigo;
import br.com.kaleb.classes.ObjetoDoJogo;
import br.com.kaleb.classes.Pinguim;
import jplay.Keyboard;
import jplay.Parallax;
import jplay.Sound;
import jplay.Window;

public class Janela {
	

	public Janela() {
		      
	           Window window = new Window(800,600);
	           Pinguim pinguim = new Pinguim();
	           Inimigo inimigo= new Inimigo("inimigoNeve.gif",1);
	           Inimigo inimigo2= new Inimigo("inimigoNeve.gif",1);
	           Inimigo inimigo3= new Inimigo("inimigoNeve.gif",1);
	           Inimigo fantasma=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma2=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma3=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma4=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma5=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma6=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma7=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma8=new Inimigo("fantasma.gif",1);
	           Inimigo fantasma9=new Inimigo("fantasma.gif",1);
	           ObjetoDoJogo casinha2 = new ObjetoDoJogo("casinha.png");
	           ObjetoDoJogo peixe = new ObjetoDoJogo("pixe.png");
	           ObjetoDoJogo peixe2 = new ObjetoDoJogo("pixe.png");
	           ObjetoDoJogo peixe3 = new ObjetoDoJogo("pixe.png");
	           ObjetoDoJogo peixe4 = new ObjetoDoJogo("pixe.png");
	           ObjetoDoJogo peixe5 = new ObjetoDoJogo("pixe.png");
	           ObjetoDoJogo peixe6 = new ObjetoDoJogo("pixe.png");
	           ObjetoDoJogo casinha = new ObjetoDoJogo("casinha.png");
	           ObjetoDoJogo bandeira = new ObjetoDoJogo("bandeira.png");
	           ObjetoDoJogo gelo = new ObjetoDoJogo("gelo.png");
	           ObjetoDoJogo gelinho = new ObjetoDoJogo("gelinho.png");
	           ObjetoDoJogo gelinho2 = new ObjetoDoJogo("gelinho.png");
	           ObjetoDoJogo gelinho3 = new ObjetoDoJogo("gelinho.png");	           
	           ObjetoDoJogo pontuacao = new ObjetoDoJogo("pontuacao.png");
	           
	           pinguim.setJumpVelocity(6.5);
	           
	           boolean fimDeJogo;
	           fimDeJogo = false;
	           boolean colisao = false;
	           int vidas = 5;
	           int pontos = 0;
	           
	           bandeira.setX(12000);
	           bandeira.setY(350);
	           
	           peixe.setX(508);
	           peixe.setY(300);
	           
	           peixe2.setX(2658);
	           peixe2.setY(300);
	           
	           peixe3.setX(3808);
	           peixe3.setY(300);
	           
	           peixe4.setX(5058);
	           peixe4.setY(300);
	           
	           peixe5.setX(7058);
	           peixe5.setY(300);
	           
	           peixe6.setX(8000);
	           peixe6.setY(200);
	           
	           casinha.setX(500);
	           casinha.setY(330);
	           
	           casinha2.setX(5000);
	           casinha2.setY(330);
	           
	           inimigo.setX(900);
	           inimigo.setY(400);
	           
	           inimigo2.setX(5400);
	           inimigo2.setY(400);
	           
	           inimigo3.setX(8000);
	           inimigo3.setY(400);
	           
	           gelo.setX(7750);
	           gelo.setY(400);
	           
	           gelinho.setX(9200);
	           gelinho.setY(400);
	           
	           gelinho2.setX(9900);
	           gelinho2.setY(400);
	           
	           gelinho3.setX(10600);
	           gelinho3.setY(400);
	           	           
	           fantasma.setX(2658);
	           fantasma.setY(430);
	           
	           fantasma2.setX(5058);
	           fantasma2.setY(430);
	           
	           fantasma3.setX(6000);
	           fantasma3.setY(430);
	           
	           fantasma4.setX(400);
	           fantasma4.setY(430);
	           
	           fantasma5.setX(7000);
	           fantasma5.setY(430);
	           
	           fantasma6.setX(9550);
	           fantasma6.setY(430);
	           
	           fantasma7.setX(10250);
	           fantasma7.setY(430);
	           
	           fantasma8.setX(9750);
	           fantasma8.setY(430);
	           
	           fantasma9.setX(10450);
	           fantasma9.setY(430);
	           
	           
	           Keyboard keyboard = window.getKeyboard();	           
	           Parallax p = new Parallax();
   	   		   p.add("fundo.png");
   	   		   p.setVelAllLayers(2.60,0);
	           new Sound("audio_01.wav").play();
	           boolean executando = true;
	           
	           while(executando) {
	        	   		
	   	   		   		double velocidade = 2.60;
	        	   		p.drawLayers();
	        	   		p.repeatLayers(800, 600, true);
	        	   		double posicao = pinguim.x;

	        	   		if(vidas<0){
	        	   			pinguim.y  = 10000;
	        	   			ObjetoDoJogo gameOver = new ObjetoDoJogo("gameOver.png");
	        	   			gameOver.setX(-50);
	        	   			gameOver.setY(0);
	        	   			gameOver.draw();	        	   			
	        	   		}
	        	   		
	        	   		if(pinguim.collided(bandeira)){
	        	   			fimDeJogo=true;
	        	   			ObjetoDoJogo vitoria = new ObjetoDoJogo("vitoria.png");
	        	   			vitoria.setX(230);
	        	   			vitoria.setY(0);
	        	   			vitoria.draw();
	        	   			pinguim.y=8000;
	        	   			ObjetoDoJogo danca = new ObjetoDoJogo("danca.gif");
	        	   			danca.setX(340);
	        	   			danca.setY(420);
	        	   			danca.draw();
	        	   			velocidade=0;
	        	   			p.setVelAllLayers(0,0);
	        	   		}
	        	   		
	        	   		
	        	   		if(pinguim.collided(casinha)){
	        	   			pinguim.setFloor(430);
	        	   		}else if(pinguim.collided(casinha2)){
	        	   			pinguim.setFloor(430);
	        	   		}else if(pinguim.collided(gelo)){
	        	   		     pinguim.setFloor(430);
	        	   		}else if(pinguim.collided(gelinho)){
	        	   		     pinguim.setFloor(400);
	        	   		}else if(pinguim.collided(gelinho2)){
	        	   		     pinguim.setFloor(400);
	        	   		}else if(pinguim.collided(gelinho3)){
	        	   		     pinguim.setFloor(400);
	        	   		}else{ pinguim.setFloor(540);
	        	   		}	        	   			        	   		
	        	   		
	        	   		if(pinguim.collided(peixe)){
	        	   			peixe.setX(80000);
	        	   			pontos +=1;
	        	   			
	        	   		}

	        	   		if(pinguim.collided(peixe2)){
	        	   			peixe2.setX(80000);
	        	   			pontos +=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(peixe3)){
	        	   			peixe3.setX(80000);
	        	   			pontos +=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(peixe4)){
	        	   			peixe4.setX(80000);
	        	   			pontos +=1;
	        	   		}
	        	   		if(pinguim.collided(peixe5)){
	        	   			peixe5.setX(80000);
	        	   			pontos +=1;
	        	   		}
	        	   		if(pinguim.collided(peixe6)){
	        	   			peixe6.setX(80000);
	        	   			pontos +=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(inimigo)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		if(pinguim.collided(inimigo2)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(inimigo3)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		
	        	   		if(pinguim.collided(fantasma)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(fantasma2)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(fantasma3)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(fantasma4)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}

	        	   		if(pinguim.collided(fantasma5)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(fantasma6)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		if(pinguim.collided(fantasma7)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		if(pinguim.collided(fantasma8)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		if(pinguim.collided(fantasma9)){
	        	   			pinguim.x=0;
	        	   			vidas-=1;
	        	   		}
	        	   		
	        	   		
	        	   		if(keyboard.keyDown(Keyboard.RIGHT_KEY) && posicao>350 && !fimDeJogo)
	        	   		{
	        	   			p.moveLayersStandardX(true);
	        	   			velocidade = 0;
	        	   			inimigo.moverDireita();
	        	   			inimigo2.moverDireita();
	        	   			inimigo3.moverDireita();
	        	   			casinha.moverDireita();
	        	   			fantasma.moverDireita();
	        	   			fantasma2.moverDireita();
	        	   			fantasma3.moverDireita();
	        	   			casinha2.moverDireita();
	        	   			peixe.moverDireita();
	        	   			peixe2.moverDireita();
	        	   			peixe3.moverDireita();
	        	   			peixe4.moverDireita();
	        	   			peixe5.moverDireita();
	        	   			peixe6.moverDireita();
	        	   			fantasma4.moverDireita();
	        	   			fantasma5.moverDireita();
	        	   			fantasma6.moverDireita();
	        	   			fantasma7.moverDireita();
	        	   			fantasma8.moverDireita();
	        	   			fantasma9.moverDireita();
	        	   			bandeira.moverDireita();
	        	   			gelo.moverDireita();
	        	   			gelinho.moverDireita();
	        	   			gelinho2.moverDireita();
	        	   			gelinho3.moverDireita();
	        	   		}else if(keyboard.keyDown(Keyboard.LEFT_KEY) && posicao <400 && !fimDeJogo){
	        	   			
	        	   			p.moveLayersStandardX(false);
	        	   			velocidade = 0;
	        	   			inimigo.moverEsquerda();
	        	   			inimigo2.moverEsquerda();
	        	   			inimigo3.moverEsquerda();
	        	   			casinha.moverEsquerda();
	        	   			fantasma.moverEsquerda();
	        	   			fantasma2.moverEsquerda();
	        	   			fantasma3.moverEsquerda();
	        	   			fantasma5.moverEsquerda();
	        	   			fantasma6.moverEsquerda();
	        	   			fantasma7.moverEsquerda();
	        	   			fantasma8.moverEsquerda();
	        	   			fantasma9.moverEsquerda();
	        	   			casinha2.moverEsquerda();
	        	   			peixe.moverEsquerda();
	        	   			peixe2.moverEsquerda();
	        	   			peixe3.moverEsquerda();
	        	   			peixe4.moverEsquerda();
	        	   			peixe5.moverEsquerda();
	        	   			peixe6.moverEsquerda();
	        	   			fantasma4.moverEsquerda();
	        	   			bandeira.moverEsquerda();
	        	   		    gelo.moverEsquerda();
	        	   		    gelinho.moverEsquerda();
	        	   		    gelinho2.moverEsquerda();
	        	   		    gelinho3.moverEsquerda();
	        	   		}
	        	   		
	        	   		
	        	   		gelinho.draw();
	        	   		gelinho2.draw();
	        	   		gelinho3.draw();
	        	   		gelo.draw();
	        	   		
	        	   		pontuacao.draw();
	        	   		
	        	   		peixe.draw();
	        	   		peixe2.draw();
	        	   		peixe3.draw();
	        	   		peixe4.draw();
	        	   		peixe5.draw();
	        	   		peixe6.draw();
	        	   		
	        	   		
	        	   		casinha2.draw();
	        	   		casinha.draw();
	        	   		
	        	   		fantasma.draw();
	        	   		fantasma2.draw();
	        	   		fantasma3.draw();
	        	   		fantasma4.draw();
	        	   		fantasma5.draw();
	        	   		fantasma6.draw();
	        	   		fantasma7.draw();
	        	   		fantasma8.draw();
	        	   		fantasma9.draw();
	        	   		
	        	   		bandeira.draw();
	        	   		
	        	   		inimigo.draw();
	        	   		inimigo2.draw();
	        	   		inimigo3.draw();
	        	   		
	                    pinguim.draw();
	                 
	                    
	                    window.drawText("Pular:  Barra de espaco.", 60, 20, Color.RED);
	                    window.drawText("Setas lado movem o boneco.", 60, 40, Color.RED);
	                    window.drawText("VIDAS "+vidas,60,60,Color.RED);
	                    window.drawText("PONTUACAO "+pontos,60,80,Color.RED);
	                    window.update();
	                    
	                    pinguim.move(keyboard, window, velocidade, colisao, fimDeJogo);	                  
	                    window.delay(10);
	                    
	                    
	                    if (keyboard.keyDown(Keyboard.ESCAPE_KEY)){
	                        executando = false;
	                    }
	           }
	           window.exit();
	        }
	
} 