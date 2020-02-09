/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroparr;

import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class NumeroParr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entero : ");
        numero=teclado.nextInt();
        if(numero % 2 ==0){
            System.out.println("El numero es PAR ");
        }else{
            System.out.println("El número es IMPAR ");
    }
    }
    
}
