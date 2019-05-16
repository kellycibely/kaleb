package br.com.kaleb.jogo;

import jplay.Keyboard;
import jplay.GameImage;
import jplay.Window;

public class Main extends Janela{
	
 
public static void main(String[] args) {
	 
	 Window w = new Window(800,600);  
     Keyboard keyboard = w.getKeyboard();  
     GameImage backGround = new GameImage("menu.jpg");  
     
	boolean Menu = true;	       
    
	while(Menu){  
    	backGround.draw();
		
    	      if (keyboard.keyDown(Keyboard.ENTER_KEY)){			             
				 new Fase2();
				 Menu = false; 
			 
			   }
			  if(Menu == false){
			         w.exit(); 
	              }
           
			  if (keyboard.keyDown(Keyboard.ESCAPE_KEY)){
				  w.exit();  
		       }
		 w.update();
	}
            
 	}
}
