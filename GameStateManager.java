/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btaplon;
import java.awt.*; 
import javax.swing.JPanel;
import java.util.*; 

public class GameStateManager {
    public Stack<GameState> states;
    
    public GameStateManager(){
        states = new Stack<GameState>();
        states.push(new MenuState(this));
    }
    public void tick(){
        states.peek().tick();
    }
    public void draw(Graphics g){
        states.peek().draw(g);
    }
    public void keyPressed( int k ){
        states.peek().keyPressed(k);
    }
    public void keyReleased(int k){
        states.peek().keyReleased(k);
    }
}
