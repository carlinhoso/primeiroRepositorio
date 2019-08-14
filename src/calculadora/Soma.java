/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * classe para fazer somas, serão contidos métodos para o mesmo
 * @author antonio carlos
 * @since '14/08/2019'
 */
public class Soma {
        
        /**
         * método para somar dois número inteiro
         * @param numero1
         * @param numero2
         * @return int - valor da soma
         */
        public int SomarDoisNumerosInteiros(int numero1, int numero2){
            int resultado = numero1 + numero2;
            
            return resultado;
        }
        
        /**
         * método para somar dois número elevado ao quadrado
         * @param n1
         * @param n2
         * @return int - valor da soma 
         */
        public int SomarDoisNumerosAoQuadrado(int n1, int n2){
            int result = (n1*n1) + (n2*n2);
            
            return result;
        }
        
        /**
         * método para somar duas fração
         * @param n1 
         * @param n2
         * @param n3
         * @param n4
         * @return double - valor da soma
         */
        public double SomarDuasFrações(int n1, int n2, int n3, int n4){
            double result = (n1/n2)+(n3/n4);
            
            return result;
        }
    
}
