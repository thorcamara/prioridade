/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String args[ ]) {
        Prioridade primeiro = new Prioridade("Primeiro");
        primeiro.setPriority( 10 ); //Maior Prioridade
        
        Prioridade segundo = new Prioridade("Segundo");
        segundo.setPriority( 1 ); //Menor Prioridade
        
    primeiro.start();
    segundo.start();
    }
}