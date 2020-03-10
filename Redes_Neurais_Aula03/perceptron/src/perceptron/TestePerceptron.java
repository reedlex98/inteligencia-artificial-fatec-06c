/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

/**
 *
 * @author lab52
 */
public class TestePerceptron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perceptron p = new perceptron();
        p.iteração();
        p.testa_rede(p.w, p.x0, p.x1);
    }
    
}
