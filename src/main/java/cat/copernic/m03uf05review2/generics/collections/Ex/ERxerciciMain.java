package cat.copernic.m03uf05review2.generics.collections.Ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.regex.Pattern.matches;

public class ERxerciciMain{

    public static void main(String[] args) {
        
       List<Persona> candidatos = new ArrayList<>();
       
       candidatos.add(new Persona(1, Sexo.HOMBRE, 20, true, OrientacionSexual.HETERO, Formacion.SECUNDARIA, OrientacionPolitica.EXTREMA_DERECHA));
       candidatos.add(new Persona(2, Sexo.MUJER, 25, false, OrientacionSexual.LESBIANA, Formacion.CATEDRATICO, OrientacionPolitica.IZQUIERDA));
       candidatos.add(new Persona(3, Sexo.HOMBRE, 40, false, OrientacionSexual.GAY, Formacion.GRADO_MEDIA, OrientacionPolitica.EXTREMA_DERECHA));
       candidatos.add(new Persona(4, Sexo.MUJER, 29, false, OrientacionSexual.BISEXUAL, Formacion.GRADO_SUPERIOR, OrientacionPolitica.EXTREMA_IZQUIERDA));
       
       
       Persona aux = new Persona(5, Sexo.MUJER, 39, false, OrientacionSexual.BISEXUAL, Formacion.GRADO_SUPERIOR, OrientacionPolitica.EXTREMA_IZQUIERDA);      
       MatcherImpl m = new MatcherImpl(aux, candidatos);
       
       System.out.println("La parella compatible es => "+ m.matches(m.getPersona(), m.getCandidatos())+" amb "+aux);
       
    }
    
}
