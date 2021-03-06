package cat.copernic.m03uf05review2.entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaCorrienteACreditoGold extends CuentaCorrienteCredito{

    public CuentaCorrienteACreditoGold(double saldo, String titular) {
        super(saldo, titular);
    }
    
    //Esta cuenta permite un descubierto de hasta 3000 euros, si es más lanza una excepcion.
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
        }else{
        
            if(this.saldo+3000 >= abono){
                this.saldo = this.saldo - abono; 
            }
            else{
                try {
                    throw new Exception("Has superat el descobert de 3000");
                } catch (Exception ex) {
                    Logger.getLogger(CuentaCorrienteACreditoGold.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        
    }
    
}
