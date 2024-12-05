/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrobancario;

/**
 *
 * @author adrianaguilar
 */

public class cuentaban {
    //atributos
    public String cliente;
    public int numerocuenta;
    public String telefono;
    public float limite;
    
    public float saldo;
  
    
    public cuentaban(){
        cliente= "No definido";
        numerocuenta = 0;
        telefono= "Mo tiene";
        limite=999999;
        saldo=0;
        
    }
    
    public float grtsaldo(){
        return saldo;
    }
    
    public void depositar(float monto){
        if (monto > 0){
            if (saldo+monto <= limite){
                saldo = saldo + monto;
            }
        }
    }
            


public void retirar (float monto){
if (monto>0){
    if(monto <= saldo){
        if(saldo - monto >= 0){
            saldo=saldo-monto;
            
        }
    }

}
}

}