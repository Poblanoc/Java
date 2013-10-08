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
        for( int i=1; i<51; i++ ){
            //System.out.print("\n");
            if ( i%3 == 0 ){
                System.out.print(i + " foo ");
                if ( i%5 == 0 ){
                    System.out.print(" bar ");
                    if ( i%7 == 0 )
                        System.out.print(" baz "); 
                    }  
                System.out.println();
           }     
           else
                    System.out.println(i);
        }
    }
}
