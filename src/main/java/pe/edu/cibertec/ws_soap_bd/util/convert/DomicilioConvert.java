package pe.edu.cibertec.ws_soap_bd.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Domiciliosoap;
import pe.edu.cibertec.ws_soap_bd.model.db.Domicilio;

import java.util.ArrayList;
import java.util.List;

@Component //aplicar la inyeccion de dependencias
public class DomicilioConvert {

    //convertir de un obj domicilio soap a un objeto domicilio de la carpeta bd
    public Domicilio convertDomicilioBD(Domiciliosoap domiciliosoap) {
        Domicilio domicilio = new Domicilio();
        domicilio.setIddomicilio(domiciliosoap.getId());
        domicilio.setDescdomicilio(domiciliosoap.getDescripcion());
        domicilio.setNrodomicilio(domiciliosoap.getNumero());
        domicilio.setRefdomicilio(domiciliosoap.getReferencia());
        return domicilio;
    }

    //convertir de un objeto domicilio a un obj domiciliosoap
    public Domiciliosoap convertDomiciliosoap(Domicilio domicilio) {
        Domiciliosoap domiciliosoap = new Domiciliosoap();
        domiciliosoap.setId(domicilio.getIddomicilio());
        domiciliosoap.setDescripcion(domicilio.getDescdomicilio());
        domiciliosoap.setNumero(domicilio.getNrodomicilio());
        domiciliosoap.setReferencia(domicilio.getRefdomicilio());
        return domiciliosoap;
    }

    public List<Domicilio> convertDomicilioBdList(List<Domiciliosoap> domiciliosoaps) {
        List<Domicilio> list = new ArrayList<>();
        for (Domiciliosoap domiciliosoap : domiciliosoaps) {
            list.add(convertDomicilioBD(domiciliosoap));
        }
        return list;
    }

    public List<Domiciliosoap> convertDomicilioSoapList(List<Domicilio> domicilios) {
        List<Domiciliosoap> list = new ArrayList<>();
        for (Domicilio domicilio : domicilios) {
            list.add(convertDomiciliosoap(domicilio));
        }
        return list;
    }

}
