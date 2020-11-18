package cat.copernic.m03uf05review2.entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CuentaCorrienteDebito extends CuentaCorrienteImp {
    
    //Solo se da un abono si hay saldo, sino se lanza una excepcion
    @Override
    public void abona(double abono) {
        
        if(abono == 0){
            try {
                throw new Exception("No pots retirar 0 euros");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(abono < 0){
            try {
                throw new Exception("No pots retirar una quantitat negativa");
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
        
            if(this.saldo >= abono){
                this.saldo = this.saldo - abono; 
            }
            else{
                try {
                    throw new Exception("No tens suficient Debit");
                } catch (Exception ex) {
                    Logger.getLogger(CuentaCorrienteDebito.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    public CuentaCorrienteDebito(double saldo, String titular) {
        super(saldo, titular);
    }

    
    
    
}
