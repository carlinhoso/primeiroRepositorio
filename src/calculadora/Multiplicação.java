/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * classe para fazer multiplicação, serão contido método no mesmo
 * @author antonio carlos
 * @since '14/0/2019'
 */
public class Multiplicação {
        
    /**
     * método para multiplicar duas fração
     * @param n1
     * @param n2
     * @param n3
     * @param n4
     * @return result - valor da multiplicação
     */
    public int MultiplicarDuasFrações(int n1, int n2, int n3, int n4){
        int result = (n1/n2)*(n3/n4);
        
        return result;
    }
    
    /**
     * método para multiplicar dois número elevado ao quadrado
     * @param n1
     * @param n2
     * @return result - valor da multiplicação
     */
    public int Multiplicardoisnumeroaoquadrado(int n1, int n2){
        int result = (n1*n1)*(n2*n2);
        
        return result;
    }
    
    /**
     * método para multiplicar dois númeor inteiro
     * @param n1
     * @param n2
     * @return result - valor da multiplicação
     */
    public int MultiplicarNumerosInteiros(int n1, int n2){
        int result = n1*n2;
        
        return result;
    }
}
