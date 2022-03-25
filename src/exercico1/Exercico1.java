/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico1;

import java.lang.reflect.Array;
import static java.lang.reflect.Array.get;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.charAt;

/**
 *
 * @author 2etimds
 */
public class Exercico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 999");
        String num = entrada.next();

        
        char centena = num.charAt(0);
        char dezena = num.charAt(1);
        char unidade = num.charAt(2);


    }
       
    }

