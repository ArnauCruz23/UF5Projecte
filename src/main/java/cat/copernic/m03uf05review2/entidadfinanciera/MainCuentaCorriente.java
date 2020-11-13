package cat.copernic.m03uf05review2.entidadfinanciera;

public class MainCuentaCorriente {
    
    public static void main(String[] args) {
        
        CuentaCorriente d = new CuentaCorrienteDebito(1000, "Quintero");
        d.ingresa(1000);
        d.abona(100);
        System.out.println(d);
        
        CuentaCorrienteImp g = new CuentaCorrienteACreditoGold(1000, "Quintero");
        g.ingresa(1000);
        g.abona(10000);
        System.out.println(g);
        
        CuentaCorriente p = new CuentaCorrienteACreditoPlatinum(5000, "Ramón");
        p.ingresa(5000);
        p.abona(1000);
        System.out.println(p);
        
    }
}
