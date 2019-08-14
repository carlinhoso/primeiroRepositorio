/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * classe para fazer divisão, serão contidos métodos para o mesmo
 * @author antonio carlos
 * @since '14/08/2019'
 */
public class Divisão {
    
    /**
     * método para dividir frações
     * @param n1
     * @param n2
     * @param n3
     * @param n4
     * @return result - valor da divisão
     */
    public double DividirFrações(int n1, int n2, int n3, int n4){
        double result = (n1/n2)/(n3/n4);
        
        return result;
    }
    
    /**
     * método para dividir dois inteiros
     * @param n1
     * @param n2
     * @return result - valor da divisão
     */
    public double DividirInteiros(int n1, int n2){
        double result= n1/n2;
        
        return result;
    }
    
    /**
     * método para dividir dois númeor elevado ao quadrado
     * @param n1
     * @param n2
     * @return result - valor da divisão
     */
    public double DividirAoQuadrado(int n1, int n2){
        double result = (n1*n1)/(n2*n2);
        
        return result;
    }
            
    
}
