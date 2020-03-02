/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesneurais_aula01;

/**
 *
 * @author lab52
 */
public class Testa_Degrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Degrau ld = new Degrau();
        
        ld.verifica_degrau(ld.x1[0], ld.x2[0], ld.w1, ld.w2);
        ld.verifica_degrau(ld.x1[1], ld.x2[1], ld.w1, ld.w2);
        ld.verifica_degrau(ld.x1[2], ld.x2[2], ld.w1, ld.w2);
        ld.verifica_degrau(ld.x1[3], ld.x2[3], ld.w1, ld.w2);
        System.out.println("\n");
        DegrauNAND ld2 = new DegrauNAND();
        
        ld2.verifica_degrau(ld2.x1[0], ld2.x2[0], ld2.w1, ld2.w2);
        ld2.verifica_degrau(ld2.x1[1], ld2.x2[1], ld2.w1, ld2.w2);
        ld2.verifica_degrau(ld2.x1[2], ld2.x2[2], ld2.w1, ld2.w2);
        ld2.verifica_degrau(ld2.x1[3], ld2.x2[3], ld2.w1, ld2.w2);
        System.out.println("\n");
        
        DegrauOR ld3 = new DegrauOR();
        
        ld3.verifica_degrau(ld3.x1[0], ld3.x2[0], ld3.w1, ld3.w2);
        ld3.verifica_degrau(ld3.x1[1], ld3.x2[1], ld3.w1, ld3.w2);
        ld3.verifica_degrau(ld3.x1[2], ld3.x2[2], ld3.w1, ld3.w2);
        ld3.verifica_degrau(ld3.x1[3], ld3.x2[3], ld3.w1, ld3.w2);
        System.out.println("\n");
        
        DegrauNOR ld4 = new DegrauNOR();
        
        ld4.verifica_degrau(ld4.x1[0], ld4.x2[0], ld4.w1, ld4.w2);
        ld4.verifica_degrau(ld4.x1[1], ld4.x2[1], ld4.w1, ld4.w2);
        ld4.verifica_degrau(ld4.x1[2], ld4.x2[2], ld4.w1, ld4.w2);
        ld4.verifica_degrau(ld4.x1[3], ld4.x2[3], ld4.w1, ld4.w2);
        System.out.println("\n");
    }
    
}
