/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrobancario;

/**
 *
 * @author adrianaguilar
 */
public class Registrobancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuentaban n1 = new cuentaban();
        n1.cliente = "Carlos Aguilar";
        n1.numerocuenta = 909090;
        n1.telefono = "2222333";
        n1.limite = 5000;

       

       System.out.println("Bienvenido a banco Aguilar");
        int deposito = 2400;
        if (deposito < 0) {
            System.out.println("Error: No se puede depositar un monto negativo.");
        } else if (deposito > n1.limite) {
            System.out.println("Error: El depósito excede el límite permitido.");
        } else {
            n1.depositar(deposito);
            System.out.println("Depósito realizado correctamente.");
        }

        
        int retiro = 1800;
        if (retiro < 0) {
            System.out.println("Erro! No se puede retirar en negativo.");
        } 
        else {
            n1.retirar(retiro);
            System.out.println("Retiro realizado correctamente.");
        }
        
        System.out.println("Tu saldo actual es " + n1.saldo);

    }}
