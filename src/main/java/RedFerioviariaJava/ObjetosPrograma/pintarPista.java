package RedFerioviariaJava.ObjetosPrograma;

import RedFerioviariaJava.Interfaces.InterfazPintar;
import java.awt.Color;
import java.awt.Graphics;

public class pintarPista extends pixel implements InterfazPintar{ 
    boolean cambiocol=true;

    public pintarPista(Color c, int[][] pc) {
        super(c, pc);
    }
     public void dibuja(Graphics g) {
                                         
        int i=0,j=-60,pocicionEjeX,PocicionEjeY;
        for ( pocicionEjeX = 0; pocicionEjeX < 15; pocicionEjeX++) {
            i=50;
            j+=50;
                for ( PocicionEjeY = 0; PocicionEjeY < 27; PocicionEjeY++) {
                    if(PocicionEjeY==0){ 
                        i-=50;
                    }
                    else{
                        i+=50;
                    }
                    g.setColor(super.getC());
                    
                    if(pocicionEjeX<=15){
                        
                        if(matPacMan[pocicionEjeX][PocicionEjeY]==0){
                            g.fillRect(i, j, 50, 50);
                        }
                        //g.setColor(Color.decode("#F1CE1F"));
                        g.setColor(Color.RED);                                  //Color de la meta, color blanco
                        if(matPacMan[pocicionEjeX][PocicionEjeY]==4){
                            //g.fillOval(i+20, j+20, 20, 20);
                            g.fillRect(i, j, 50, 50);
                        }

                        g.setColor(Color.BLACK);//CUadros del centro color morado
                        if(matPacMan[pocicionEjeX][PocicionEjeY]==2){
                            //g.fillOval(i+15, j+15, 30, 30);
                            g.drawRect(i, j, 50, 50);
                        }
                                                    //El otro lado de la meta, Color verde
                       
                        if(matPacMan[pocicionEjeX][PocicionEjeY]==3){
                             g.drawRect(i, j, 50, 50);
                         
                        }
                       
                    }
                }      
        }
    }
}




