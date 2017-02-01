/*//Cecilia Gutierrez de Lara Hernandez-A01410404-IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.t01.p2;
import java.util.Scanner;
/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir variables
    double base, altu, sup, per;
    Scanner kb=new Scanner(System.in);
    //Pedir datos 
        System.out.println("Inserte la base del rectangulo");
        base=kb.nextDouble();
        System.out.println("Inserte la altura del rectangulo");
        altu=kb.nextDouble();
        //Ecuaciones para superficie y perimetro
        sup=base*altu;
        per=2*(base+altu);
    //Ejecutar programa y mostrar resultados
        System.out.println("La superficie del recatangulo es"+sup);
        System.out.println("El perimetro del rectangulo es"+per);
    }
    
}
