package pe.edu.cibertec.ws_soap_bd.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws.objects.Moneda;
import pe.edu.cibertec.ws.objects.Pais;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PaisRepository {

    private static final Map<String, Pais> paises = new HashMap<>();

    @PostConstruct //luego que se ejecute el constructor este metodo cargarPaises se va a ejecutar
    public void cargarPaises() {
        Pais objPais = new Pais();
        objPais.setNombre("Argentina");
        objPais.setCapital("Buenos aires");
        objPais.setMoneda(Moneda.PESO);
        objPais.setPoblacion("40000");
        paises.put(objPais.getNombre(), objPais);

        objPais = new Pais();
        objPais.setNombre("Perú");
        objPais.setCapital("Lima");
        objPais.setMoneda(Moneda.SOL);
        objPais.setPoblacion("30000");
        paises.put(objPais.getNombre(), objPais);

        objPais = new Pais();
        objPais.setNombre("Italia");
        objPais.setCapital("Roma");
        objPais.setMoneda(Moneda.EURO);
        objPais.setPoblacion("50000");
        paises.put(objPais.getNombre(), objPais);

        objPais = new Pais();
        objPais.setNombre("Ecuador");
        objPais.setCapital("Quito");
        objPais.setMoneda(Moneda.DOLAR);
        objPais.setPoblacion("10000");
        paises.put(objPais.getNombre(), objPais);
    }

    public Pais buscarPais(String nombre) {
        return paises.get(nombre);//devolverme el objpais por el nombre
    }

}
