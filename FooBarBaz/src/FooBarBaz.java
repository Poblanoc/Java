/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author infotec162
 */
public class FooBarBaz {
    public static void main(String[] args) {
        for ( int i=1; i<50; i++ ){
            if (i%3 == 0)
                System.out.println(i + " foo");
            if (i%5 == 0)
                System.out.println(i + " bar");
            if (i%7 == 0)
                System.out.println(i + " baz");     
        }
    }
    
}
