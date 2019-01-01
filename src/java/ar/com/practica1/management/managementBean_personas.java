package ar.com.practica1.management;

import ar.com.practica1.bean.bean_persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class managementBean_personas {

    public managementBean_personas() {
    }
    
    private bean_persona persona = new bean_persona();
    private static List<bean_persona> lista_personas = new ArrayList();

    public bean_persona getPersona() {
        return persona;
    }

    public void setPersona(bean_persona persona) {
        this.persona = persona;
    }

    public List<bean_persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(List<bean_persona> lista_personas) {
        this.lista_personas = lista_personas;
    }
    
    public void agregarLista(){
        lista_personas.add(this.persona);
    }
    public void eliminarPersona(bean_persona person){
        lista_personas.remove(person);
    }

}
