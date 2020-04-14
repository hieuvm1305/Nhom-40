/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btaplon;
import java.awt.*; 
import javax.swing.JPanel;
import java.awt.event.*;
/**
 *
 * @author Administrator
 */
public class MenuState extends GameState {
    private String[] options = {"Stage 1", "Stage 2", "Stage 3"};
    private int currentSelection = 0;
    public MenuState(GameStateManager gsm){
        super(gsm);
    }
    public void init(){
        
    }
    public void tick(){
        
    }
    
    public void draw(Graphics g){
        g.setColor(new Color(100,200,50));
        g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
        
        for (int i=0;i< options.length;i++){
            if (i == currentSelection){
                g.setColor(Color.GREEN);
            }
            else{
                g.setColor(Color.BLACK);
            }           
            
            g.setFont(new Font("Arial", Font.PLAIN, 72));
            g.drawString(options[i], GamePanel.WIDTH/2 - 75, 150+i*100);
        }
    }
    public void keyPressed(int k){
        if (k == KeyEvent.VK_DOWN){
            currentSelection++;
            if (currentSelection >= options.length){
                currentSelection = 0;               
            }           
        }
        else if (k== KeyEvent.VK_UP){
            currentSelection--;
            if (currentSelection < 0){
                currentSelection = options.length-1;
            }
        }
        if (k== KeyEvent.VK_ENTER){
            if (currentSelection == 0){
                gsm.states.push(new Stage_1(gsm));
            }
            else if (currentSelection ==1){
                
            }
            else if (currentSelection == 2){
                System.exit(0);
            }
        }
    }
    public void keyReleased(int k){
        
    }
}
