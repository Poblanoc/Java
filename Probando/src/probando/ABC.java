package probando;

//import .*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author infotec162
 */
public class ABC {
    public char[] createArray(){
        char[] s;
        
        s = new char[26];
        for( int i=0; i<26; i++ ){
            s[i] = (char) ('A' + i);
            System.out.println("s = " + s[i]);
        }
        
        return s;
    }
    
    public void printElements(int [] list){
        for( int i=0; i < list.length; i++ )
            System.out.println(list[i]);
    }
    
}
