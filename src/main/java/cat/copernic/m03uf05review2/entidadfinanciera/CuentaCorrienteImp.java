package cat.copernic.m03uf05review2.entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CuentaCorrienteImp implements CuentaCorriente{
    
    private double saldo;
    private String titular;
    
    
    @Override
    public void ingresa(double ingreso) {
        
        if(ingreso >= 1){
            saldo += ingreso;
        }
        else if(ingreso == 0){
            try {
                throw new Exception("No pots ingresar 0 euros");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ingreso < 0){
            try {
                throw new Exception("No pots ingresar una quantitat negativa");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void abona(double abono){
        
    }

    public CuentaCorrienteImp(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    
    @Override
    public String toString() {
        return "CuentaCorrienteImp{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    
    
    
}
