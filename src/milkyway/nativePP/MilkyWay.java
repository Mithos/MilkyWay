/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package milkyway.nativePP;

/**
 *
 * @author james
 */
public class MilkyWay {
    
    public static void main(String[] args){
        
        Universe u = new Universe();
        DrawThread t = new DrawThread(u);
        
        (new Thread(u, "Universe")).start();
        (new Thread(t, "Drawing")).start();
        
    }
    
    
}
