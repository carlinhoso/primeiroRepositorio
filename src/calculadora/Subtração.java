/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * classe para fazer subtrações, serão contidos métodos para o mesmo
 * @author antonio carlos
 * @since '14/08/2019'
 */
public class Subtração {
    
    /**
     * método para subtrair dois número interio
     * @param n1
     * @param n2
     * @return result - valor da subtração
     */
    public int SubtrairInteiros(int n1, int n2){
        int result = n1-n2;
        
        return result;
    }
    
    /**
     * método para subtrair dois número elevado ao quadrado
     * @param n1
     * @param n2
     * @return result - valor da subtração
     */
    public int SubtrairDoisNumeroAoQuadrado(int n1, int n2){
        int result=(n1*n1)+(n2*n2);
        
        return result;
    }
    
    /**
     * método para subtrair duas fração
     * @param n1
     * @param n2
     * @param n3
     * @param n4
     * @return result - valor da subtração
     */
    public double SubtrairFrações(int n1, int n2, int n3, int n4){
        double result=(n1/n2)+(n3/n4);
        
       return result; 
    }
}
