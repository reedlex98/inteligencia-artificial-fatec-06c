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
    }
    
}
