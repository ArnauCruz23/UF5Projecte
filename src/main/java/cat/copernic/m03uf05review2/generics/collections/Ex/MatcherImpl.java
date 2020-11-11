package cat.copernic.m03uf05review2.generics.collections.Ex;

import java.util.List;

public class MatcherImpl implements Matcher {
    
    Persona persona;
    List<Persona> candidatos;
    
    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        
        Persona aux = null; 
        
        for(int x = 0; x < candidatos.size(); x++){
            
            if(candidatos.get(x).getEdad() <= persona.getEdad()+5){
                if(candidatos.get(x).isFumador() == true && persona.isFumador() == true){
                    if(sexualitat(candidatos.get(x), persona) == true){
                        if(politica(candidatos.get(x), persona) == true){
                            aux = candidatos.get(x);
                        }
                        else{
                            aux = candidatos.get(x);
                        }

                    }
                }else if(candidatos.get(x).isFumador() == false && persona.isFumador() == false){
                    if(sexualitat(candidatos.get(x), persona) == true){
                        if(politica(candidatos.get(x), persona) == true){
                            aux = candidatos.get(x);
                        }
                        else{
                            aux = candidatos.get(x);
                        }
                    }
                }else{
                    if(sexualitat(candidatos.get(x), persona) == true){
                        if(politica(candidatos.get(x), persona) == true){
                            aux = candidatos.get(x);
                        }
                        else{
                            aux = candidatos.get(x);
                        }
                    }
                }
            }else{
                if(candidatos.get(x).isFumador() == true && persona.isFumador() == true){
                    if(sexualitat(candidatos.get(x), persona) == true){
                        if(politica(candidatos.get(x), persona) == true){
                            aux = candidatos.get(x);
                        }
                        else{
                            aux = candidatos.get(x);
                        }

                    }
                }else if(candidatos.get(x).isFumador() == false && persona.isFumador() == false){
                    if(sexualitat(candidatos.get(x), persona) == true){
                        if(politica(candidatos.get(x), persona) == true){
                            aux = candidatos.get(x);
                        }
                        else{
                            aux = candidatos.get(x);
                        }
                    }
                }else{
                    if(sexualitat(candidatos.get(x), persona) == true){
                        if(politica(candidatos.get(x), persona) == true){
                            aux = candidatos.get(x);
                        }
                        else{
                            aux = candidatos.get(x);
                        }
                    }
                }
            }
        }
            
        
        return aux;
        
    }
    
    public boolean politica(Persona candidato, Persona persona){
        boolean resultat = false;
        
        if(candidato.getOrientacionPolitica() == OrientacionPolitica.CENTRO && 
         ((persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA)||
         (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO)||
         (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA))){
            resultat = true;
        }
        else if(candidato.getOrientacionPolitica() == OrientacionPolitica.DERECHA &&
                ((persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA)||
                (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA)||
                (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO))){
            resultat = true;
        }
        else if(candidato.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA &&
                ((persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA)||
                (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA))){
            resultat = true;
        }
        else if(candidato.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA &&
                ((persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA)||
                (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA)||
                (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO))){
            resultat = true;
        }
        else if(candidato.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA &&
                ((persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA)||
                (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA))){
            resultat = true;
        }
        
        return resultat;
    }
    public boolean sexualitat(Persona candidato, Persona persona){
        
        boolean resultat = false;
        
        if((candidato.getOrientacionSexual() == OrientacionSexual.HETERO && candidato.getSexo() == Sexo.HOMBRE)&&
          (persona.getOrientacionSexual() == OrientacionSexual.HETERO && persona.getSexo() == Sexo.MUJER)){
            resultat = true;
        }
        else if((candidato.getOrientacionSexual() == OrientacionSexual.HETERO && candidato.getSexo() == Sexo.MUJER)&&
          (persona.getOrientacionSexual() == OrientacionSexual.HETERO && persona.getSexo() == Sexo.HOMBRE)){
            resultat = true;
        }
        else if((candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL && candidato.getSexo() == Sexo.MUJER)&&
                ((persona.getOrientacionSexual() == OrientacionSexual.LESBIANA || persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL)&&
                persona.getSexo() == Sexo.MUJER)){
            resultat = true;
        }
        else if((candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL && candidato.getSexo() == Sexo.HOMBRE)&&
                ((persona.getOrientacionSexual() == OrientacionSexual.GAY || persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL)&&
                persona.getSexo() == Sexo.HOMBRE)){
            resultat = true;
        }
        else if((candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL && candidato.getSexo() == Sexo.HOMBRE)&&
                (persona.getOrientacionSexual() == OrientacionSexual.HETERO && persona.getSexo() == Sexo.MUJER)){
            resultat = true;
        }
        else if((candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL && candidato.getSexo() == Sexo.MUJER)&&
                (persona.getOrientacionSexual() == OrientacionSexual.HETERO && persona.getSexo() == Sexo.HOMBRE)){
            resultat = true;
        }
        else if(candidato.getOrientacionSexual() == OrientacionSexual.GAY && persona.getOrientacionSexual() == OrientacionSexual.GAY){
            resultat = true;
        }
        
        else if(candidato.getOrientacionSexual() == OrientacionSexual.LESBIANA && persona.getOrientacionSexual() == OrientacionSexual.LESBIANA){
            resultat = true;
        }
        
        return resultat;
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
