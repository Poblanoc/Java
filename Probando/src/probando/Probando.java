/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package probando;

/**
 *
 * @author infotec162
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ABC array;
        ABC lista;
        int[] num = {9,8,7,5,4};
        //array = new ABC();
        lista = new ABC();

//        int[] numbers = new int[100];
//        for (int i = 0; i < 100; i++){
//            numbers[i] = (int)(Math.random() * 100) + 1;
//            System.out.println("i = " + i);
//            }
        //array.createArray();
        lista.printElements(num);
    }
}


