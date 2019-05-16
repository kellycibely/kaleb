/* 4ªAvaliação POO
 * kelly cibely / Aline Alves */
package br.com.kaleb.classes;

import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;


public class Pinguim extends Sprite {
    public static int STOP = 1;
    public static int LEFT = 2;
    public static int RIGHT = 3;
    public static int UP = 4;
    public static int DOWN = 5;
    private int sentidoAnterior; 
    private int sentido;

    public Pinguim() {
            super("kaleb.png", 6);
            setTotalDuration(1960);
            sentido = RIGHT;
            sentidoAnterior = RIGHT;
            setFloor(540);
            setCurrFrame(6);
    }

    public void move(Keyboard teclado, Window janela, double velocidade,boolean colisao, boolean fimDeJogo) {

            if (teclado.keyDown(Keyboard.LEFT_KEY) && this.x > 1 && !fimDeJogo) {
                    if (sentido != LEFT) {   
                        setSequence(0, 2);
                        sentidoAnterior = LEFT;
                        sentido = LEFT;
                    }
                    
                    
                    this.x -= velocidade;

            }
            else {
                    if ( teclado.keyDown(Keyboard.RIGHT_KEY) && this.x + this.width < janela.getWidth() && !fimDeJogo) {
                                if (sentido != RIGHT) {
                                    setSequence(4,6);
                                    sentidoAnterior = RIGHT;
                                    sentido = RIGHT;
                                }
                                this.x += velocidade;
                        }
                    else {                     
                        sentido = STOP;

                        if (sentidoAnterior == RIGHT){
                            setCurrFrame(3);
                        } else {
                            if (sentidoAnterior == LEFT)
                                setCurrFrame(2);
                        }
                    }
            }
            
            if (sentido != STOP && !fimDeJogo){
                update();
            }
            
            jump();
    }

    public int getSentido() {
            return sentidoAnterior;
    }
    
}
