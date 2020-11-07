package cat.copernic.m03uf05review2.generics.collections.Ex;

import java.util.List;

public class MatcherImpl implements Matcher {
    
    Persona persona;
    List<Persona> candidatos;
    
    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        
        Persona aux = null; 
        
        for(int x = 0; x < candidatos.size(); x++){
            
            if(candidatos.get(x).getOrientacionSexual() == persona.getOrientacionSexual()){
                aux = candidatos.get(x);
            }
            else if(persona.getSexo() == Sexo.HOMBRE && persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL
                    && candidatos.get(x).getOrientacionSexual() == OrientacionSexual.GAY){
                aux = candidatos.get(x);
            }
            else if(persona.getSexo() == Sexo.HOMBRE && persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL
                    && candidatos.get(x).getOrientacionSexual() == OrientacionSexual.HETERO){
                aux = candidatos.get(x);
            }
            else if(persona.getSexo() == Sexo.MUJER && persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL
                    && candidatos.get(x).getOrientacionSexual() == OrientacionSexual.LESBIANA){
                aux = candidatos.get(x);
            }
            else if(persona.getSexo() == Sexo.MUJER && persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL
                    && candidatos.get(x).getOrientacionSexual() == OrientacionSexual.HETERO){
                aux = candidatos.get(x);
            }
        }
        
        return aux;
        
    }

    public MatcherImpl(Persona persona, List<Persona> candidatos) {
        this.persona = persona;
        this.candidatos = candidatos;
    }

    public Persona getPersona() {
        return persona;
    }

    public List<Persona> getCandidatos() {
        return candidatos;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setCandidatos(List<Persona> candidatos) {
        this.candidatos = candidatos;
    }

    @Override
    public String toString() {
        return "MatcherImpl{" + "persona=" + persona + ", candidatos=" + candidatos + '}';
    }
    
    
}
