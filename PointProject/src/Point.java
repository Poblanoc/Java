/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author infotec162
 */
public class Point {

     public Point[] createArray(){
     Point[] p;
     
     p = new Point [10];
     for ( int i=0; i<10; i++){
           p[i] = new Point(i, i+1);
     }
            
     return p;
     }
   
}
